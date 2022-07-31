package com.proyecto.primerproyecto.Controller;

import com.proyecto.primerproyecto.model.Educacion;
import com.proyecto.primerproyecto.model.Experiencia;
import com.proyecto.primerproyecto.model.Persona;
import com.proyecto.primerproyecto.service.IEducacionService;
import com.proyecto.primerproyecto.service.IExperienciaService;
import com.proyecto.primerproyecto.service.IPersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//Incorporo o importo la anotación RestController
import org.springframework.web.bind.annotation.RestController;

/*
Agrego la anotación RestController para indicarle a SpringBoot
que es un controlador
*/

@RestController
@CrossOrigin(origins = "*")
public class Controller {
    
    /*List<Persona> listaPersonas = new ArrayList();              //Creo la lista del tipo 'Persona' donde se almacenarán las personas.
    
    @GetMapping ("/hola/{nombre}/{apellido}/{edad}")
    public String decirHola(@PathVariable String nombre,
                            @PathVariable String apellido,
                            @PathVariable int edad){
        return "Hola Mundo " + nombre + " Apellido: " + apellido
                + " Edad: " + edad;
    }
    
    @GetMapping("/chau")
    public String decirChau (@RequestParam String nombre,
                             @RequestParam String apellido,
                             @RequestParam int edad){
        return "Chau Mundo " + nombre + " Apellido: " + apellido
                + " Edad: " + edad;
    }*/
    
    @Autowired                                                   //Inyección de dependencias
    private IPersonaService persoServ;                           //Implementación de nuestra Interfaz
    
    @CrossOrigin(origins = "*")
    @PostMapping("/nueva/persona")                                 //Función para agregar personas a la lista
    public void agregarPersona(@RequestBody Persona pers) {      //La persona va a venir en el cuerpo de la solicitud
        persoServ.crearPersona(pers);                            //A la interfaz persoServ le asignamos el método crearPersona
    }
    
    @CrossOrigin(origins = "*")
    @PutMapping("cambiar/persona/{id}")
    public void modificarPersona (@RequestBody Persona pers) {
        persoServ.modificarPersona(pers);
    }
    
    //@CrossOrigin(origins = "*")
    @GetMapping ("/ver/personas")
    @ResponseBody                                               //Digo que lo devuelva en el cuerpo de la respuesta
    public List<Persona> verPersonas() {                        //Función para mostrar las personas agregadas en la lista. Las muestro en una lista del tipo 'Persona'
        return persoServ.verPersonas();
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping ("/buscar/persona/{id}")
    public Persona buscarPersona(@PathVariable Long id){
        return persoServ.buscarPersona(id);
    }
    
    @CrossOrigin(origins = "*")
    @DeleteMapping ("/borrar/persona/{id}")
    public void borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    
    @Autowired
    private IExperienciaService expeServ;
    
    @PostMapping("/nueva/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia exp) {
        expeServ.crearExperiencia(exp);
    }
    
    @PutMapping("/cambiar/experiencia/{id}")
    public void cambiarExperiencia(@RequestBody Experiencia exp) {
        expeServ.modificarExperiencia(exp);
    }
    
    @GetMapping ("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias() {
        return expeServ.verExperiencias();
    }
    
    @GetMapping ("/buscar/experiencia/{id}")
    public Experiencia buscarExperiencia(@PathVariable Long id){
        return expeServ.buscarExperiencia(id);
    }
    
    @DeleteMapping ("/borrar/experiencia/{id}")
    public void borrarExperiencia (@PathVariable Long id){
        expeServ.borrarExperiencia(id);
    }
    
    @Autowired
    private IEducacionService eduServ;
    
    @PostMapping("/nueva/educacion")
    public void agregarEducacion(@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
    }
    
    @PutMapping("/cambiar/educacion/{id}")
    public void cambiarEducacion(@RequestBody Educacion edu) {
        eduServ.modificarEducacion(edu);
    }
    
    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return eduServ.verEducacion();
    }
    
    @GetMapping ("/buscar/educacion/{id}")
    public Educacion buscarEducacion(@PathVariable Long id){
        return eduServ.buscarEducacion(id);
    }
    
    @DeleteMapping ("/borrar/educacion/{id}")
    public void borrarEducacion (@PathVariable Long id){
        eduServ.borrarEducacion(id);
    }
}
