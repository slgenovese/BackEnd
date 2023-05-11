/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Institucion;
import com.backend.portfolio.model.Proyectos;
import com.backend.portfolio.repository.IProyectosService;
import com.backend.portfolio.repository.ProyectosRepository;
import java.time.Year;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sergio
 */
@Service
public class ProyectosService implements IProyectosService{
    
    @Autowired
    private ProyectosRepository proyectosRepository;
   
    @Override
    public List<Proyectos> getProyectos(){
        List<Proyectos> listaProyectoss=proyectosRepository.findAll();
        return listaProyectoss;
    }
    
    @Override
    public void saveProyectos(Proyectos proyectos){
        proyectosRepository.save(proyectos);
    }    
    
    @Override
    public void deleteProyectos(Long id){
        proyectosRepository.deleteById(id);
    }
    
    @Override
    public Proyectos findProyectos(Long id){
        Proyectos proyectos=proyectosRepository.findById(id).orElse(null);
        return proyectos;
    }

    @Override 
    public int actualizarDatosProyectos(Long id, String texto, Year desde, Year hasta, 
            Long n_orden, Institucion institucion){
            return proyectosRepository.actualizarDatosProyectos(id, texto, desde, hasta, 
                n_orden, institucion);
    }
    
}
