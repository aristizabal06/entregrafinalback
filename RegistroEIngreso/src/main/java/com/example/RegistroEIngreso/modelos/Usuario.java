package com.example.RegistroEIngreso.modelos;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity

public class Usuario {

    @Id
    private Integer id;

    private String nombre;

    private String comtraseña;

    private LocalDate fechaNacimiento;

    private String cuidad;
    
    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String comtraseña, LocalDate fechaNacimiento, String cuidad) {
        this.id = id;
        this.nombre = nombre;
        this.comtraseña = comtraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.cuidad = cuidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComtraseña() {
        return comtraseña;
    }

    public void setComtraseña(String comtraseña) {
        this.comtraseña = comtraseña;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }
}
