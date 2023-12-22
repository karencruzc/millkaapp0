package com.example.milka1.model;

public class Alumno {
    private int id;
    private String nombre;
    private String curso1;
    private String curso2;
    private int edad;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String curso1, String curso2, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.curso1 = curso1;
        this.curso2 = curso2;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso1() {
        return curso1;
    }

    public void setCurso1(String curso1) {
        this.curso1 = curso1;
    }

    public String getCurso2() {
        return curso2;
    }

    public void setCurso2(String curso2) {
        this.curso2 = curso2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
