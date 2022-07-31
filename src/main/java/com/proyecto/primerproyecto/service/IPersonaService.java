package com.proyecto.primerproyecto.service;

import com.proyecto.primerproyecto.model.Persona;
import java.util.List;

//Creo 4 métodos pero sin su implementación. Eso va en Interface
public interface IPersonaService {
    
    public List<Persona> verPersonas ();
    
    public void crearPersona (Persona per);
    
    public void modificarPersona (Persona per);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona (Long id); 
    
}
