/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.PersonaRed;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.portfolio.repository.IPersonaRedService;
import com.backend.portfolio.repository.PersonaRedRepository;

/**
 *
 * @author Sergio
 */
@Service
public class PersonaRedService implements IPersonaRedService{
    
    @Autowired
    private PersonaRedRepository persona_redRepository;
   
    @Override
    public List<PersonaRed> getPersona_Red(){
        List<PersonaRed> listaPersona_Reds=persona_redRepository.findAll();
        return listaPersona_Reds;
    }
    
    @Override
    public void savePersona_Red(PersonaRed persona_red){
        persona_redRepository.save(persona_red);
    }    
    
    @Override
    public void deletePersona_Red(Long id){
        persona_redRepository.deleteById(id);
    }
    
    @Override
    public PersonaRed findPersona_Red(Long id){
        PersonaRed persona_red=persona_redRepository.findById(id).orElse(null);
        return persona_red;
    }
    
}
