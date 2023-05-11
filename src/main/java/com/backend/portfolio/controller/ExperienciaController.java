/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.controller;

import com.backend.portfolio.DTO.ExperienciaDTO;
import com.backend.portfolio.model.Experiencia;
import com.backend.portfolio.model.Persona;
import com.backend.portfolio.repository.IExperienciaService;
import com.backend.portfolio.repository.IPersonaService;
import java.time.Year;
import java.util.ArrayList;
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

public class ExperienciaController {
    @Autowired
    private IExperienciaService interExperiencia;

    @Autowired
    private IPersonaService interPersona;

    @GetMapping("/portfolio/v1/experiencias")
    public List<ExperienciaDTO> getExperienciaDTO(){
        List<Experiencia> lista = interExperiencia.getExperiencia();
        List<ExperienciaDTO> experienciaDTO = new ArrayList<ExperienciaDTO>();
        for(int i=0;i< lista.size();++i){
            var e = new ExperienciaDTO(lista.get(i).getId(), lista.get(i).getTexto(),
                    lista.get(i).getDesde(), lista.get(i).getHasta(),
                    lista.get(i).getProvincia(), lista.get(i).getPais(), 
                    lista.get(i).getN_orden(), lista.get(i).getInstitucion());
            experienciaDTO.add(e);
        }
        return experienciaDTO;
    }

    @PostMapping("/portfolio/v1/experiencias/{persona_id}")
    public String createExperiencia(@PathVariable(value = "persona_id") Long persona_id,
      @RequestBody Experiencia experienciaRequest) {
      Persona persona = interPersona.findPersona(persona_id);
      System.out.println(persona.getApellidos());
      experienciaRequest.setPersona(persona);
      interExperiencia.saveExperiencia(experienciaRequest);
      return "OK";
    }

    @DeleteMapping("/portfolio/v1/experiencias/{id}")
    public String deleteExperiencia(@PathVariable Long id){
        interExperiencia.deleteExperiencia(id);
        return "El experiencia fue eliminado correctamente";
    }
    @PutMapping("/portfolio/v1/experiencias/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
                                @RequestParam ("Texto") String nuevoTexto, 
                                @RequestParam ("Desde") Year nuevoDesde, 
                                @RequestParam ("Hasta") Year nuevoHasta, 
                                @RequestParam ("provincia") String nuevoprovincia, 
                                @RequestParam ("pais") String nuevopais, 
                                @RequestParam ("N_Orden") Long nuevoN_Orden 
                                ){

        Experiencia experiencia = interExperiencia.findExperiencia(id);
        experiencia.setTexto(nuevoTexto);
        experiencia.setDesde(nuevoDesde);
        experiencia.setHasta(nuevoHasta);
        experiencia.setProvincia(nuevoprovincia);
        experiencia.setPais(nuevopais);
        experiencia.setN_orden(nuevoN_Orden);
        interExperiencia.saveExperiencia(experiencia);
        return experiencia;
    }

    @PutMapping("/portfolio/v1/experiencias/datos/{id}")
    public int actualizarDatos(@PathVariable Long id, @RequestBody ExperienciaDTO experienciaDatos){

        return interExperiencia.actualizarDatosExperiencia(id, experienciaDatos.getTexto(), experienciaDatos.getDesde(), experienciaDatos.getHasta(),
                experienciaDatos.getPais(), experienciaDatos.getProvincia(), experienciaDatos.getN_orden(),
                experienciaDatos.getInstitucion());

    } 
}
