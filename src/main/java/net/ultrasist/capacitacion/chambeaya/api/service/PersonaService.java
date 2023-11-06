package net.ultrasist.capacitacion.chambeaya.api.service;

import java.util.List;

import net.ultrasist.capacitacion.chambeaya.api.model.Persona;

public interface PersonaService {
    
    /**
     * Regresa una lista de objetos de tipo Persona.
     * 
     * @return List<Persona>
     */
    List<Persona> getBolsa();
    
    /**
     * Calcula el factorial de un entero.
     * 
     * @param n entero al cual se le va a calcular el factorial
     * @returnn entero que tiene el factorial de n
     */
    int fact(int n);
}