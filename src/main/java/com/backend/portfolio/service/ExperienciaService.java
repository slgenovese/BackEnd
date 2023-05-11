/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Experiencia;
import com.backend.portfolio.model.Institucion;
import com.backend.portfolio.repository.IExperienciaService;
import com.backend.portfolio.repository.ExperienciaRepository;
import java.time.Year;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sergio
 */
@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    private ExperienciaRepository experienciaRepository;
   
    @Override
    public List<Experiencia> getExperiencia(){
        List<Experiencia> listaExperiencias=experienciaRepository.findAll();
        return listaExperiencias;
    }
    
    @Override
    public void saveExperiencia(Experiencia experiencia){
        experienciaRepository.save(experiencia);
    }    
    
    @Override
    public void deleteExperiencia(Long id){
        experienciaRepository.deleteById(id);
    }
    
    @Override
    public Experiencia findExperiencia(Long id){
        Experiencia experiencia=experienciaRepository.findById(id).orElse(null);
        return experiencia;
    }

    @Override 
    public int actualizarDatosExperiencia(Long id, String texto, Year desde, Year hasta, 
            String pais, String provincia, Long n_orden, Institucion institucion){
            return experienciaRepository.actualizarDatosExperiencia(id, texto, desde, hasta, 
                pais, provincia, n_orden, institucion);
    }
}
