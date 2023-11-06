package net.ultrasist.capacitacion.chambeaya.api.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import net.ultrasist.capacitacion.chambeaya.api.model.Persona;

// Fing que va a la base de datos pero en realidad usa una bolsa de tipo ArrayList
@Repository
public class PersonaMapper {
    private List<Persona> bolsa = new ArrayList<>();
    
    public PersonaMapper() {
        bolsa.add(new Persona(45, "Gustavo3", "Hidalgo", "Pineda", 28));
        bolsa.add(new Persona(76, "Adolfo3", "Torres", "avalos", 88));
        bolsa.add(new Persona(99, "Hector3", "Perez", "Lopez", 77));
        bolsa.add(new Persona(14, "Febronio3", "Gutierrez", "Triana", 11));
    }
    
    public Persona findById(int id) {
        // select * from persona where id=#id
        Optional<Persona> resultado = bolsa.stream().filter(x -> x.getId()==id).findFirst();
        if(resultado.isPresent()) return resultado.get();
        return new Persona();
    }

    public void insert(Persona p) {
        bolsa.add(p);
    }
    public List<Persona> getAll() {
        return bolsa;
    }
    public void delete(Persona p) {
        bolsa.remove(p);
    }
    
}