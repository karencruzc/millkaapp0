package com.example.milka1.service.impl;

import com.example.milka1.model.Alumno;
import com.example.milka1.service.AlumnoService;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl implements AlumnoService {
    public Alumno getAlumno(){
        Alumno fer = new Alumno();
        fer.setId(1);
        fer.setNombre("Fernando");
        fer.setCurso1("JAVA");
        fer.setCurso2("SQL");
        fer.setEdad(30);

        return fer;
    }
}
