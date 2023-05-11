/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Institucion;
import com.backend.portfolio.repository.IInstitucionService;
import com.backend.portfolio.repository.InstitucionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sergio
 */
@Service
public class InstitucionService implements IInstitucionService{
    
    @Autowired
    private InstitucionRepository institucionRepository;
   
    @Override
    public List<Institucion> getInstitucion(){
        List<Institucion> listaInstitucions=institucionRepository.findAll();
        return listaInstitucions;
    }
    
    @Override
    public void saveInstitucion(Institucion institucion){
        institucionRepository.save(institucion);
    }    
    
    @Override
    public void deleteInstitucion(Long id){
        institucionRepository.deleteById(id);
    }
    
    @Override
    public Institucion findInstitucion(Long id){
        Institucion institucion=institucionRepository.findById(id).orElse(null);
        return institucion;
    }
    
}
