package com.portfolio.vs.Interface;

import com.portfolio.vs.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    // Traer lista de personas
    public List<Persona> getPersona();
    
    // Guardar un objeto de tipo persona
    public void savePersona (Persona persona);
    
    // Eliminar un objeto buscado por id
    public void deletePersona (Long id);
    
    // Buscar persona por id
    public Persona findPersona (Long id);
    
}
