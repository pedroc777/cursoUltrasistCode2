package net.ultrasist.capacitacion.chambeaya.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.ultrasist.capacitacion.chambeaya.api.mapper.PersonaMapper;
import net.ultrasist.capacitacion.chambeaya.api.model.Persona;

@Service
public class PersonaServiceImpl implements PersonaService {
    private PersonaMapper personaMapper;
    
    public PersonaServiceImpl(PersonaMapper personaMapper) {
        this.personaMapper = personaMapper;
    }

    @Override
    public List<Persona> getBolsa() {
        return personaMapper.getAll();
    }
    
    @Override
    public int fact(int n) {
        return (n<2)?1:n*fact(n-1);
    }
}