/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Educacion;
import com.backend.portfolio.model.Institucion;
import com.backend.portfolio.model.Titulo;
import com.backend.portfolio.repository.IEducacionService;
import com.backend.portfolio.repository.EducacionRepository;
import java.time.Year;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sergio
 */
@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    private EducacionRepository educacionRepository;
   
    @Override
    public List<Educacion> getEducacion(){
        List<Educacion> listaEducacions=educacionRepository.findAll();
        return listaEducacions;
    }
    
    @Override
    public void saveEducacion(Educacion educacion){
        educacionRepository.save(educacion);
    }    
    
    @Override
    public void deleteEducacion(Long id){
        educacionRepository.deleteById(id);
    }
    
    @Override
    public Educacion findEducacion(Long id){
        Educacion educacion=educacionRepository.findById(id).orElse(null);
        return educacion;
    }
    @Override 
    public int actualizarDatosEducacion(Long id, Year desde, Year hasta, 
            Long n_orden, Institucion institucion, Titulo titulo){
            return educacionRepository.actualizarDatosEducacion(id, desde, hasta, 
                n_orden, institucion, titulo);
    }
    
}
