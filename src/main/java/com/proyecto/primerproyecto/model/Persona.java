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
public class Persona {                                              //Creo la clase Persona
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;                                                //Atributos de la clase
    private String nombre;
    private String apellido;
    private String domicilio;
    private LocalDate fechaNac;
    private String telefono;
    private String email;
    private String password;
    private String urlFoto;
    
    public Persona() {
    }
    
    //Método de la clase que almacena en las variables
    //de los atributos los valores que recibe.
    public Persona(Long id, 
            String nombre, 
            String apellido, 
            String domicilio, 
            LocalDate fechaNac,
            String telefono,
            String email,
            String password,
            String urlFoto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
        this.urlFoto = urlFoto;
    }
}
