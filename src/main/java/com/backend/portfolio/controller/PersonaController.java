/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.controller;

import com.backend.portfolio.model.Persona;
import com.backend.portfolio.DTO.PersonaAcerca_DeDTO;
import com.backend.portfolio.DTO.PersonaBannerDTO;
import com.backend.portfolio.DTO.PersonaServidorImagenesDTO;
import com.backend.portfolio.repository.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sergio
 */
@RestController
//@RequestMapping("/api")
public class PersonaController {
    @Autowired
    private IPersonaService interPersona;

    @GetMapping("/portfolio/v1/personas")
    public List<Persona> getPersonas(){
        return interPersona.getPersonas();
    }

    @PostMapping("/portfolio/v1/personas")
    public String createStudent(@RequestBody Persona persona){
        interPersona.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    @DeleteMapping("/portfolio/v1/personas/{id}")
    public String deletePersona(@PathVariable Long id){
        interPersona.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    @PutMapping("/portfolio/v1/personas/{id}")
    public Persona editPersona(@PathVariable Long id,
                                @RequestParam ("nombres") String nuevoNombre, 
                                @RequestParam ("Apellidos") String nuevoApellido, 
                                @RequestParam ("Cargo_Actual") String nuevoCargo_Actual, 
                                @RequestParam ("Acerca_De") String nuevoAcerca_De, 
                                @RequestParam ("Link_Foto") String nuevoLink_Foto, 
                                @RequestParam ("Link_Icono") String nuevoLink_Icono, 
                                @RequestParam ("Link_Banner") String nuevoLink_Banner, 
                                @RequestParam ("Link_Servidor_Imagenes") String nuevoServidor_Imagenes, 
                                @RequestParam ("provincia") String nuevoprovincia, 
                                @RequestParam ("pais") String nuevopais
                                ){
        Persona persona = interPersona.findPersona(id);
        persona.setNombres(nuevoNombre);
        persona.setApellidos(nuevoApellido);
        persona.setCargo_actual(nuevoCargo_Actual);
        persona.setAcerca_de(nuevoAcerca_De);
        persona.setLink_foto(nuevoLink_Foto);
        persona.setLink_icono(nuevoLink_Icono);
        persona.setLink_banner(nuevoLink_Banner);
        persona.setLink_servidor_imagenes(nuevoServidor_Imagenes);
        persona.setProvincia(nuevoprovincia);
        persona.setPais(nuevopais);
        interPersona.savePersona(persona);
        return persona;
    }

    @GetMapping("/portfolio/v1/personas/{id}") 
    public Persona findPersona(@PathVariable Long id){
        return interPersona.findPersona(id);
    }


    @GetMapping("/portfolio/v1/personas/acercade")
    public PersonaAcerca_DeDTO traerAcerca_De(){
        return interPersona.traerAcerca_De();
    }

    @GetMapping("/portfolio/v1/personas/banner")
    public PersonaBannerDTO traerBanner(){
        return interPersona.traerBanner();
    }

    @GetMapping("/portfolio/v1/personas/servidorimagenes")
    public PersonaServidorImagenesDTO traerServidorImagenes(){
        return interPersona.traerServidorImagenes();
    }

    @PutMapping("/portfolio/v1/personas/acercade/{id}")
    public int actualizarAcercaDe(@PathVariable Long id, @RequestBody String acerca_de){
        
        return interPersona.actualizarAcercaDe(id, acerca_de);
    }

    @PutMapping("/portfolio/v1/personas/banner/{id}")
    public int actualizarBanner(@PathVariable Long id, @RequestBody String link_banner){
        
        return interPersona.actualizarBanner(id, link_banner);
    }

    @PutMapping("/portfolio/v1/personas/foto/{id}")
    public int actualizarFoto(@PathVariable Long id, @RequestBody String link_foto){
        
        return interPersona.actualizarFoto(id, link_foto);
    }

    @PutMapping("/portfolio/v1/personas/servidorimagenes/{id}")
    public int actualizarServidorImagenes(@PathVariable Long id, @RequestBody String link_servidor_imagenes){
        
        return interPersona.actualizarServidorImagenes(id, link_servidor_imagenes);
    }

    @PutMapping("/portfolio/v1/personas/datos/{id}")
    public int actualizarDatos(@PathVariable Long id, @RequestBody PersonaAcerca_DeDTO personaDatos){

        return interPersona.actualizarDatos(id, personaDatos.getLink_icono(), personaDatos.getNombres(),
                personaDatos.getApellidos(), personaDatos.getCargo_actual(), personaDatos.getPais(),
                personaDatos.getProvincia());

    } 

}
