package com.proyecto.primerproyecto.service;

import com.proyecto.primerproyecto.model.Experiencia;
import java.util.List;

//Creo 4 métodos pero sin su implementación. Eso va en Interface
public interface IExperienciaService {
    
    public List<Experiencia> verExperiencias ();
    
    public void crearExperiencia (Experiencia exp);
    
    public void modificarExperiencia (Experiencia exp);
    
    public void borrarExperiencia (Long id);
    
    public Experiencia buscarExperiencia (Long id);
}
