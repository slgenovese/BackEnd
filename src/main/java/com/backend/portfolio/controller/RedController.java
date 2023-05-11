/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.controller;

import com.backend.portfolio.model.Red;
import com.backend.portfolio.repository.IRedService;
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
public class RedController {
    @Autowired
    private IRedService interRed;

    @GetMapping("/portfolio/v1/redes")
    public List<Red> getRed(){
        return interRed.getRed();
    }

    @PostMapping("/portfolio/v1/redes")
    public String createStudent(@RequestBody Red red){
        interRed.saveRed(red);
        return "El red fue creado correctamente";
    }
    @DeleteMapping("/portfolio/v1/redes/{id}")
    public String deleteRed(@PathVariable Long id){
        interRed.deleteRed(id);
        return "El red fue eliminado correctamente";
    }
    @PutMapping("/portfolio/v1/redes/{id}")
    public Red editRed(@PathVariable Long id,
                                @RequestParam ("Nombre") String nuevoNombre, 
                                @RequestParam ("Icono") String nuevoIcono
                                ){
        Red red = interRed.findRed(id);
        red.setNombre(nuevoNombre);
        red.setIcono(nuevoIcono);
        interRed.saveRed(red);
        return red;
    }

}
