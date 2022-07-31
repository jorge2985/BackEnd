package com.proyecto.primerproyecto.service;

import com.proyecto.primerproyecto.model.Educacion;
import java.util.List;

//Creo 4 métodos pero sin su implementación. Eso va en Interface
public interface IEducacionService {
    
    public List<Educacion> verEducacion ();
    
    public void crearEducacion (Educacion edu);
    
    public void modificarEducacion (Educacion edu);
    
    public void borrarEducacion (Long id);
    
    public Educacion buscarEducacion (Long id);
}
