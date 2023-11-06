package net.ultrasist.capacitacion.chambeaya.api.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.ultrasist.capacitacion.chambeaya.api.exceptions.MapperException;
import net.ultrasist.capacitacion.chambeaya.api.exceptions.ServiceException;
import net.ultrasist.capacitacion.chambeaya.api.mapper.PersonaMapper;
import net.ultrasist.capacitacion.chambeaya.api.model.Persona;

@Service
@Slf4j
public class PersonaServiceImpl implements PersonaService {
    private PersonaMapper personaMapper;
    
    public PersonaServiceImpl(PersonaMapper personaMapper) {
        this.personaMapper = personaMapper;
    }

    @Override
    public List<Persona> getBolsa() throws ServiceException {
        try {
            List<Persona> bolsa = personaMapper.getAll();
            for(Persona p : bolsa) {
                if(p.getFirst().toLowerCase().equals("carlos")) {
                    int age = p.getAge();
                    age = age + 1;
                    p.setAge(age);
                }
            }
            return bolsa;
        } catch (Throwable e) {
            String rnd = getRandomString(8);
            log.error(rnd + "--->" + e.getMessage());
            throw new MapperException(1001, "ERR_"+1001, "mapper error code: " + rnd, e.getMessage());
            // Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is java.sql.SQLNonTransientConnectionException: Socket fail to connect to host:address=(host=localhost)(port=3306)(type=primary). Connection refused
            // Cause: java.sql.SQLSyntaxErrorException: (conn=13) Table 'prueba.persona2' doesn't exist
            // PersistenceException (disk full, String too large, etc)
            // DataAccessException (tipicamente permisos)
            // SQLIntegrityConstraintViolationException (llave foránea inválida)
        }
    }
    
    private String getRandomString(int n) {
        Random rnd = new Random();
        
        // 62 LETRAS:       12345678901234567890123456789012345678901234567890123456789012
        String alphabeth = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        // Un arreglo de caracteres de longitud n:
        char[] result = new char[n];
        
        for(int i=0; i<n; i++) {
            double d = alphabeth.length() * rnd.nextDouble();
            result[i] = alphabeth.charAt((int)d);
        }
        return new String(result);
    }
    
    @Override
    public int fact(int n) {
        return (n<2)?1:n*fact(n-1);
    }
}