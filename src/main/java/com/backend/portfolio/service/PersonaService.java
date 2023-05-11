/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Persona;
import com.backend.portfolio.DTO.PersonaAcerca_DeDTO;
import com.backend.portfolio.DTO.PersonaBannerDTO;
import com.backend.portfolio.DTO.PersonaServidorImagenesDTO;
import com.backend.portfolio.repository.IPersonaService;
import com.backend.portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sergio
 */
@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    private PersonaRepository personaRepository;
   
    @Override
    public List<Persona> getPersonas(){
        List<Persona> listaPersonas=personaRepository.findAll();
        return listaPersonas;
    }
    
    @Override
    public void savePersona(Persona persona){
        personaRepository.save(persona);
    }    
    
    @Override
    public void deletePersona(Long id){
        personaRepository.deleteById(id);
    }
    
    @Override
    public Persona findPersona(Long id){
        Persona persona=personaRepository.findById(id).orElse(null);
        return persona;
    }

    
    @Override 
    public PersonaAcerca_DeDTO traerAcerca_De(){
        return personaRepository.traerAcercaDe();
    }

    @Override 
    public PersonaBannerDTO traerBanner(){
        return personaRepository.traerBanner();
    }

    @Override 
    public PersonaServidorImagenesDTO traerServidorImagenes(){
        return personaRepository.traerServidorImagenes();
    }

    @Override 
    public int actualizarAcercaDe(Long id, String acerca_de){
        return personaRepository.actualizarAcercaDe(id, acerca_de);
    }

    @Override 
    public int actualizarBanner(Long id, String link_banner){
        return personaRepository.actualizarBanner(id, link_banner);
    }

    @Override 
    public int actualizarFoto(Long id, String link_foto){
        return personaRepository.actualizarFoto(id, link_foto);
    }

    @Override 
    public int actualizarServidorImagenes(Long id, String link_servidor_imagenes){
        return personaRepository.actualizarServidorImagenes(id, link_servidor_imagenes);
    }

    @Override 
    public int actualizarDatos(Long id, String link_icono, String nombres, 
            String apellidos, String cargo_actual, String pais, String provincia){
            return personaRepository.actualizarDatos(id, link_icono, nombres, 
                apellidos, cargo_actual, pais, provincia);
    }

}
