/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.controller;

import com.backend.portfolio.DTO.ProyectosDTO;
import com.backend.portfolio.model.Persona;
import com.backend.portfolio.model.Proyectos;
import com.backend.portfolio.repository.IPersonaService;
import com.backend.portfolio.repository.IProyectosService;
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
public class ProyectosController {
    @Autowired
    private IProyectosService interProyectos;

    @Autowired
    private IPersonaService interPersona;

    @GetMapping("/portfolio/v1/proyectos")
    public List<ProyectosDTO> getProyectosDTO(){
        List<Proyectos> lista = interProyectos.getProyectos();
        List<ProyectosDTO> proyectosDTO = new ArrayList<ProyectosDTO>();
        for(int i=0;i< lista.size();++i){
            var e = new ProyectosDTO(lista.get(i).getId(), lista.get(i).getTexto(),
                    lista.get(i).getDesde(), lista.get(i).getHasta(),
                    lista.get(i).getN_orden(), lista.get(i).getInstitucion());
            proyectosDTO.add(e);
        }
        return proyectosDTO;
    }

/*    @PostMapping("/portfolio/v1/proyectos")
    public String createStudent(@RequestBody Proyectos proyectos){
        interProyectos.saveProyectos(proyectos);
        return "El proyectos fue creado correctamente";
    }*/
    
    @PostMapping("/portfolio/v1/proyectos/{persona_id}")
    public String createProyectos(@PathVariable(value = "persona_id") Long persona_id,
      @RequestBody Proyectos proyectosRequest) {
      Persona persona = interPersona.findPersona(persona_id);
      System.out.println(persona.getApellidos());
      proyectosRequest.setPersona(persona);
      interProyectos.saveProyectos(proyectosRequest);
      return "OK";
    }

    @DeleteMapping("/portfolio/v1/proyectos/{id}")
    public String deleteProyectos(@PathVariable Long id){
        interProyectos.deleteProyectos(id);
        return "El proyectos fue eliminado correctamente";
    }
    @PutMapping("/portfolio/v1/proyectos/{id}")
    public Proyectos editProyectos(@PathVariable Long id,
                                @RequestParam ("Texto") String nuevoTexto, 
                                @RequestParam ("Desde") Year nuevoDesde, 
                                @RequestParam ("Hasta") Year nuevoHasta, 
                                @RequestParam ("N_Orden") Long nuevoN_Orden 
                                ){
        Proyectos proyectos = interProyectos.findProyectos(id);
        proyectos.setTexto(nuevoTexto);
        proyectos.setDesde(nuevoDesde);
        proyectos.setHasta(nuevoHasta);
        proyectos.setN_orden(nuevoN_Orden);
        interProyectos.saveProyectos(proyectos);
        return proyectos;
    }

    @PutMapping("/portfolio/v1/proyectos/datos/{id}")
    public int actualizarDatos(@PathVariable Long id, @RequestBody ProyectosDTO proyectosDatos){

        return interProyectos.actualizarDatosProyectos(id, proyectosDatos.getTexto(), proyectosDatos.getDesde(), proyectosDatos.getHasta(),
                proyectosDatos.getN_orden(), proyectosDatos.getInstitucion());

    } 

}
