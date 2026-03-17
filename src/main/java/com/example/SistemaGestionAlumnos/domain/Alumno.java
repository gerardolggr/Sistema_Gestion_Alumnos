package com.example.SistemaGestionAlumnos.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Alumno {
    private int id_alumno;
    private String nombre;
    private String email;
    private int edad;
    private String curso;


    public Alumno(int id_alumno, String nombre, String email, int edad, String curso) {
        this.id_alumno = id_alumno;
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.curso = curso;
    }
}
