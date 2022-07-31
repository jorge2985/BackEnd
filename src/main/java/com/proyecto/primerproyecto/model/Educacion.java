package com.proyecto.primerproyecto.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;                                                //Atributos de la clase
    private String nombreInstitucion;
    private String formacion;
    private boolean finalizo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String descripcion;
    
    public Educacion(){
    }
    
    public Educacion(Long id, 
            String nombreInstitucion, 
            String formacion,
            boolean finalizo,
            LocalDate fechaInicio, 
            LocalDate fechaFin, 
            String descripcion) {
        this.id = id;
        this.nombreInstitucion = nombreInstitucion;
        this.formacion = formacion;
        this.finalizo = finalizo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }
}
