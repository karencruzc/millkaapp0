package com.example.milka1.controller;

import com.example.milka1.model.Alumno;
import com.example.milka1.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RequestMapping("alumno")
@RestController
public class Millka1Controller {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/get-alumno")
    public Alumno alumno(){
        return  alumnoService.getAlumno();
    }

}
