/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.controller;

import com.backend.portfolio.DTO.TituloDTO;
import com.backend.portfolio.model.Titulo;
import com.backend.portfolio.repository.ITituloService;
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
public class TituloController {
    @Autowired
    private ITituloService interTitulo;

    @GetMapping("/portfolio/v1/titulos")
    public List<TituloDTO> getTituloDTO(){
        List<Titulo> lista = interTitulo.getTitulo();
        List<TituloDTO> tituloDTO = new ArrayList<TituloDTO>();
        for(int i=0;i< lista.size();++i){
            var e = new TituloDTO(lista.get(i).getId(), lista.get(i).getTitulo());
            tituloDTO.add(e);
        }
        return tituloDTO;
    }

    @PostMapping("/portfolio/v1/titulos")
    public String createStudent(@RequestBody Titulo titulo){
        interTitulo.saveTitulo(titulo);
        return "El titulo fue creado correctamente";
    }
    @DeleteMapping("/portfolio/v1/titulos/{id}")
    public String deleteTitulo(@PathVariable Long id){
        interTitulo.deleteTitulo(id);
        return "El titulo fue eliminado correctamente";
    }
    @PutMapping("/portfolio/v1/titulos/{id}")
    public Titulo editTitulo(@PathVariable Long id,
                                @RequestParam ("Titulo") String nuevoTitulo 
                                ){
        Titulo titulo = interTitulo.findTitulo(id);
        titulo.setTitulo(nuevoTitulo);
        interTitulo.saveTitulo(titulo);
        return titulo;
    }

}
