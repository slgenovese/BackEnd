/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.controller;

import com.backend.portfolio.model.Educacion;
import com.backend.portfolio.DTO.EducacionDTO;
import com.backend.portfolio.model.Persona;
import com.backend.portfolio.repository.IEducacionService;
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
public class EducacionController {
    @Autowired
    private IEducacionService interEducacion;

    @Autowired
    private IPersonaService interPersona;

    @GetMapping("/portfolio/v1/estudios")
    public List<EducacionDTO> getEducacionDTO(){
        List<Educacion> lista = interEducacion.getEducacion();
        List<EducacionDTO> educacionDTO = new ArrayList<EducacionDTO>();
        for(int i=0;i< lista.size();++i){
            var e = new EducacionDTO(lista.get(i).getId(), lista.get(i).getDesde(),
                    lista.get(i).getHasta(), lista.get(i).getN_orden(),
                    lista.get(i).getInstitucion(), lista.get(i).getTitulo());
            educacionDTO.add(e);
        }
        return educacionDTO;
    }

/*    @PostMapping("/portfolio/v1/estudios")
    public String createStudent(@RequestBody Educacion educacion){
        interEducacion.saveEducacion(educacion);
        return "El educacion fue creado correctamente";
    }*/

    @PostMapping("/portfolio/v1/estudios/{persona_id}")
    public String createEducacion(@PathVariable(value = "persona_id") Long persona_id,
      @RequestBody Educacion educacionRequest) {
      Persona persona = interPersona.findPersona(persona_id);
      System.out.println(persona.getApellidos());
      educacionRequest.setPersona(persona);
      interEducacion.saveEducacion(educacionRequest);
      return "OK";
    }

    @DeleteMapping("/portfolio/v1/estudios/{id}")
    public String deleteEducacion(@PathVariable Long id){
        interEducacion.deleteEducacion(id);
        return "El educacion fue eliminado correctamente";
    }
    @PutMapping("/portfolio/v1/estudios/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                                @RequestParam ("Desde") Year nuevoDesde, 
                                @RequestParam ("Hasta") Year nuevoHasta, 
                                @RequestParam ("N_Orden") long nuevoN_Orden 
                                ){
        Educacion educacion = interEducacion.findEducacion(id);
        educacion.setDesde(nuevoDesde);
        educacion.setHasta(nuevoHasta);
        educacion.setN_orden(nuevoN_Orden);
        interEducacion.saveEducacion(educacion);
        return educacion;
    }
    @PutMapping("/portfolio/v1/estudios/datos/{id}")
    public int actualizarDatos(@PathVariable Long id, @RequestBody EducacionDTO educacionDatos){

        return interEducacion.actualizarDatosEducacion(id, educacionDatos.getDesde(), educacionDatos.getHasta(),
                educacionDatos.getN_orden(), educacionDatos.getInstitucion(), educacionDatos.getTitulo());

    } 

}
