package com.proyecto.primerproyecto.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter                                                     //Las anotations @Getter para obtener y @Setter para enviar
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;                                                //Atributos de la clase
    private String nombreEmpresa;
    private boolean trabajoActual;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String descripcion;
    
    
    public Experiencia() {
    }
    
    //Método de la clase que almacena en las variables
    //de los atributos los valores que recibe.
    public Experiencia(Long id, 
            String nombreEmpresa, 
            boolean trabajoActual,
            LocalDate fechaInicio, 
            LocalDate fechaFin, 
            String descripcion) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.trabajoActual = trabajoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }
}
