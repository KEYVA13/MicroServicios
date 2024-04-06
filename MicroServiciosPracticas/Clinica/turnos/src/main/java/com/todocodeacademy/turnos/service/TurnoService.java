package com.todocodeacademy.turnos.service;
import com.todocodeacademy.turnos.dto.TurnoDto;
import com.todocodeacademy.turnos.model.Paciente;
import com.todocodeacademy.turnos.model.Turno;
import com.todocodeacademy.turnos.repository.ITurnoRepository;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TurnoService implements ITurnoService{
    
    @Autowired
    private ITurnoRepository turnoRepo;
    @Autowired
    private RestTemplate apiConsumir;

    @Override
    public List<Turno> getTurnos() {
        return turnoRepo.findAll();
    }

    @Override
    public void saveTurno(TurnoDto turnoDto) {
        
        //buscar el paciente en la api pacientes
        //Paciente pac = //buscar en la api
        Paciente p = apiConsumir.getForObject("http://localhost:9001/pacientes/traerdni/" + turnoDto.getDni(),Paciente.class);
        //String nombreCompletoPaciente = //lo que consumo de nombre de la api;


        String nombreCompleto ;
        if(p != null){
            nombreCompleto = p.getNombre() + " " + p.getApellido();
        }else{
            nombreCompleto = "no se encontraron datos";
        }

        Turno turno = new Turno();
        turno.setFecha(turnoDto.getFecha());
        turno.setTratamiento(turnoDto.getTratamiento());
        turno.setNombreCompletoPaciente(nombreCompleto);
        
        turnoRepo.save(turno);
        
        
    }

    @Override
    public void deleteTurno(Long id) {
        turnoRepo.deleteById(id);
    }

    @Override
    public Turno findTurno(Long id) {
        return turnoRepo.findById(id).orElse(null);
    }

    @Override
    public void editTurno(Long id, Turno turno) {
       
        Turno turn = this.findTurno(id);
        
        turn.setFecha(turno.getFecha());
        turn.setTratamiento(turno.getTratamiento());
        turn.setNombreCompletoPaciente(turno.getNombreCompletoPaciente());
        
        turnoRepo.save(turn);
    }
    
    
    
    
    
}
