package net.ultrasist.capacitacion.chambeaya.api.controller;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith;
//import org.junit.Before;
//import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;

import net.ultrasist.capacitacion.chambeaya.api.exceptions.ServiceException;
import net.ultrasist.capacitacion.chambeaya.api.mapper.PersonaMapper;
import net.ultrasist.capacitacion.chambeaya.api.service.PersonaService;
import net.ultrasist.capacitacion.chambeaya.api.service.PersonaServiceImpl;
import net.ultrasist.capacitacion.chambeaya.api.model.Persona;

@ExtendWith(MockitoExtension.class) 
//@RunWith(MockitoJUnitRunner.class)
public class HelloControllerTest {
    private PersonaService personaService;
    
    @Mock
    private PersonaMapper personaMapper;
    
    @BeforeEach
    void setup() { // stubbing personaMapper
        // GIVEN:
        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona(1, "carlos", "arellano", "felix", 17)); // age = 23, but "carlos" found in firstname
        lista.add(new Persona(2, "alberto", "arellano", "felix", 51)); // age = 23, but "carlos" found in firstname
        when(personaMapper.getAll()).thenReturn(lista);
        this.personaService = new PersonaServiceImpl(personaMapper);
    }
    
    @Test
    void DBTest1() throws ServiceException {
        // testing our business code
        List<Persona> bolsa = this.personaService.getBolsa();
        //System.out.println(bolsa2.get(0).getAge());
        assertTrue(bolsa.get(0).getAge() == 18);
    }
    @Test
    void DBTest1a() throws ServiceException {
        // testing our business code
        List<Persona> bolsa = this.personaService.getBolsa();
        //System.out.println(bolsa2.get(0).getAge());
        assertFalse(bolsa.get(0).getAge() == 88);
    }
    @Test
    void DBTest2() throws ServiceException {
        // testing our business code
        List<Persona> bolsa = this.personaService.getBolsa();
        //System.out.println(bolsa2.get(0).getAge());
        assertTrue(bolsa.get(1).getAge() == 51);
    }
    @Test
    void DBTest2a() throws ServiceException {
        // testing our business code
        List<Persona> bolsa = this.personaService.getBolsa();
        //System.out.println(bolsa2.get(0).getAge());
        assertFalse(bolsa.get(1).getAge() == 14);
    }
}