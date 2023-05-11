/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.controller;

import com.backend.portfolio.model.HabilidadesDatos;
import com.backend.portfolio.repository.IHabilidadesDatosService;
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
public class HabilidadesDatosController {
    @Autowired
    private IHabilidadesDatosService interHabilidadesDatos;

    @GetMapping("/portfolio/v1/habilidadesdatos")
    public List<HabilidadesDatos> getHabilidadesDatos(){
        return interHabilidadesDatos.getHabilidadesDatos();
    }

    @PostMapping("/portfolio/v1/habilidadesdatos")
    public String createStudent(@RequestBody HabilidadesDatos habilidadesDatos){
        interHabilidadesDatos.saveHabilidadesDatos(habilidadesDatos);
        return "El habilidades fue creado correctamente";
    }
    @DeleteMapping("/portfolio/v1/habilidadesdatos/{id}")
    public String deleteHabilidadesDatos(@PathVariable Long id){
        interHabilidadesDatos.deleteHabilidadesDatos(id);
        return "El habilidades fue eliminado correctamente";
    }
    @PutMapping("/portfolio/v1/habilidadesdatos/{id}")
    public HabilidadesDatos editHabilidadesDatos(@PathVariable Long id,
                                @RequestParam ("Color") String nuevoColor, 
                                @RequestParam ("Etiqueta") String nuevoEtiqueta, 
                                @RequestParam ("Porcentaje") int nuevoPorcentaje 
                                ){
        HabilidadesDatos habilidadesDatos = interHabilidadesDatos.findHabilidadesDatos(id);
        habilidadesDatos.setColor(nuevoColor);
        habilidadesDatos.setEtiqueta(nuevoEtiqueta);
        habilidadesDatos.setPorcentaje(nuevoPorcentaje);
        interHabilidadesDatos.saveHabilidadesDatos(habilidadesDatos);
        return habilidadesDatos;
    }

}
