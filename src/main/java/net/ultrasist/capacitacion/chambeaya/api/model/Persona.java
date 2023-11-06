package net.ultrasist.capacitacion.chambeaya.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    private int id;
    private String first;
    private String last;
    private String second;
    private int age;
}