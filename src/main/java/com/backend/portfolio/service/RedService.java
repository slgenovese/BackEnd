/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Red;
import com.backend.portfolio.repository.IRedService;
import com.backend.portfolio.repository.RedRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sergio
 */
@Service
public class RedService implements IRedService{
    
    @Autowired
    private RedRepository redRepository;
   
    @Override
    public List<Red> getRed(){
        List<Red> listaReds=redRepository.findAll();
        return listaReds;
    }
    
    @Override
    public void saveRed(Red red){
        redRepository.save(red);
    }    
    
    @Override
    public void deleteRed(Long id){
        redRepository.deleteById(id);
    }
    
    @Override
    public Red findRed(Long id){
        Red red=redRepository.findById(id).orElse(null);
        return red;
    }
    
}
