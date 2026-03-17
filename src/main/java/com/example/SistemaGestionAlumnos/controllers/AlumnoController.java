package com.example.SistemaGestionAlumnos.controllers;

import com.example.SistemaGestionAlumnos.domain.Alumno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    List<Alumno> alumnos;

    public AlumnoController(){
        alumnos = new ArrayList<>(Arrays.asList(
                new Alumno(1, "Luis", "luis@gmail.com", 26, "Algebra"),
                new Alumno(2, "Gerardo", "gerardo@gmail.com", 23, "Algebra"),
                new Alumno(3, "Gonzalo", "gonzalo@gmail.com", 25, "Física")
        ));
    }

    //Metodo GET
    @GetMapping
    public List<Alumno> getAlumnos(){
        return alumnos;
    }
}
