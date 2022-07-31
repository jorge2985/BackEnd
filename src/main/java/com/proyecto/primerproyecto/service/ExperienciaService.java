package com.proyecto.primerproyecto.service;
import com.proyecto.primerproyecto.model.Experiencia;
import com.proyecto.primerproyecto.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    public ExperienciaRepository expeRepo;
    
    @Override
    public List<Experiencia> verExperiencias() {
        return expeRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        expeRepo.save(exp);
    }
    
    @Override
    public void modificarExperiencia(Experiencia exp) {
        expeRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return expeRepo.findById(id).orElse(null);
    }    
}
