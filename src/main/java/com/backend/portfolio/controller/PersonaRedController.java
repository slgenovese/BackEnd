/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.controller;

import com.backend.portfolio.model.Persona;
import com.backend.portfolio.model.PersonaRed;
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
import com.backend.portfolio.repository.IPersonaRedService;
import com.backend.portfolio.repository.IPersonaService;

/**
 *
 * @author Sergio
 */
@RestController
public class PersonaRedController {
    @Autowired
    private IPersonaRedService interPersona_Red;

    @Autowired
    private IPersonaService interPersona;

    @GetMapping("/portfolio/v1/personas_redes")
    public List<PersonaRed> getPersona_Red(){
        return interPersona_Red.getPersona_Red();
    }

/*    @PostMapping("/portfolio/v1/personas_redes")
    public String createStudent(@RequestBody PersonaRed persona_red){
        interPersona_Red.savePersona_Red(persona_red);
        return "El persona_red fue creado correctamente";
    }
*/
    @PostMapping("portfolio/v1/personas_redes/{persona_id}")
    public String createPersonasRedes(@PathVariable(value = "persona_id") Long persona_id,
      @RequestBody PersonaRed personasRedesRequest) {
      Persona persona = interPersona.findPersona(persona_id);
      personasRedesRequest.setPersona(persona);
      interPersona_Red.savePersona_Red(personasRedesRequest);
      return "OK";
    }

    @DeleteMapping("/portfolio/v1/personas_redes/{id}")
    public String deletePersona_Red(@PathVariable Long id){
        interPersona_Red.deletePersona_Red(id);
        return "El persona_red fue eliminado correctamente";
    }
    @PutMapping("/portfolio/v1/personas_redes/{id}")
    public PersonaRed editPersona_Red(@PathVariable Long id,
                                @RequestParam ("Link") String nuevoLink, 
                                @RequestParam ("icono") String nuevoIcono 
                                ){
        PersonaRed persona_red = interPersona_Red.findPersona_Red(id);
        persona_red.setLink(nuevoLink);
        persona_red.setIcono(nuevoIcono);
        interPersona_Red.savePersona_Red(persona_red);
        return persona_red;
    }

}
