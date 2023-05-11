/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.HabilidadesDatos;
import com.backend.portfolio.repository.HabilidadesDatosRepository;
import com.backend.portfolio.repository.IHabilidadesDatosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sergio
 */
@Service
public class HabilidadesDatosService implements IHabilidadesDatosService{
    
    @Autowired
    private HabilidadesDatosRepository habilidadesDatosRepository;
   
    @Override
    public List<HabilidadesDatos> getHabilidadesDatos(){
        List<HabilidadesDatos> listaHabilidadesDatos=habilidadesDatosRepository.findAll();
        return listaHabilidadesDatos;
    }
    
    @Override
    public void saveHabilidadesDatos(HabilidadesDatos habilidadesDatos){
        habilidadesDatosRepository.save(habilidadesDatos);
    }    
    
    @Override
    public void deleteHabilidadesDatos(Long id){
        habilidadesDatosRepository.deleteById(id);
    }
    
    @Override
    public HabilidadesDatos findHabilidadesDatos(Long id){
        HabilidadesDatos habilidadesDatos=habilidadesDatosRepository.findById(id).orElse(null);
        return habilidadesDatos;
    }
    

}
