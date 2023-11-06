package net.ultrasist.capacitacion.chambeaya.api.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import net.ultrasist.capacitacion.chambeaya.api.mapper.PersonaMapper;
import net.ultrasist.capacitacion.chambeaya.api.service.PersonaService;
import net.ultrasist.capacitacion.chambeaya.api.service.PersonaServiceImpl;

public class HelloControllerTest {
    @Test
    void testFactorial() {
        PersonaService hc = new PersonaServiceImpl(new PersonaMapper());
        assertEquals(hc.fact(5), 120);
        assertNotEquals(hc.fact(5), 12);
    }
}