package net.ultrasist.capacitacion.chambeaya.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Persona {
    private int id;
    private String nombre;
    private String apPat;
    private String apMat;
    private int edad;
    
    public Persona() {
        System.out.println("Ejecutando constructor");
    }
    // POJO: Plain Old Java Object
}