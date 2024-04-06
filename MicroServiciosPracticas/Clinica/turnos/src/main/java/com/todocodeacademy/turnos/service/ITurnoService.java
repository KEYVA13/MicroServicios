package com.todocodeacademy.turnos.service;


import com.todocodeacademy.turnos.dto.TurnoDto;
import com.todocodeacademy.turnos.model.Turno;
import java.time.LocalDate;
import java.util.List;

public interface ITurnoService {
    
    public List<Turno> getTurnos();

    public void saveTurno(TurnoDto turnoDto);

    public void deleteTurno(Long id);

    public Turno findTurno(Long id);

    public void editTurno (Long id, Turno turno);
    
}

