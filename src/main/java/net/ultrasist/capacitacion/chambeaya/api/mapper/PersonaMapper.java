package net.ultrasist.capacitacion.chambeaya.api.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import net.ultrasist.capacitacion.chambeaya.api.model.Persona;

@Repository
public interface PersonaMapper {
    @Select("SELECT id, first, last, second, age FROM persona")
    List<Persona> getAll();
}