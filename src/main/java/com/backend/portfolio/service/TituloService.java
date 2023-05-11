/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Titulo;
import com.backend.portfolio.repository.ITituloService;
import com.backend.portfolio.repository.TituloRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sergio
 */
@Service
public class TituloService implements ITituloService{
    
    @Autowired
    private TituloRepository tituloRepository;
   
    @Override
    public List<Titulo> getTitulo(){
        List<Titulo> listaTitulos=tituloRepository.findAll();
        return listaTitulos;
    }
    
    @Override
    public void saveTitulo(Titulo titulo){
        tituloRepository.save(titulo);
    }    
    
    @Override
    public void deleteTitulo(Long id){
        tituloRepository.deleteById(id);
    }
    
    @Override
    public Titulo findTitulo(Long id){
        Titulo titulo=tituloRepository.findById(id).orElse(null);
        return titulo;
    }
    
}
