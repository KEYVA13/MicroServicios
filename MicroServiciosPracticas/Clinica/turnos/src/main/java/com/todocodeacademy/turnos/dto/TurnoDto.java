package com.todocodeacademy.turnos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TurnoDto {

    private LocalDate fecha;
    private String dni;
    private String tratamiento;

}
