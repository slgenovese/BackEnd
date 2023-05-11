/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Habilidades;
import com.backend.portfolio.repository.IHabilidadesService;
import com.backend.portfolio.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sergio
 */
@Service
public class HabilidadesService implements IHabilidadesService{
    
    @Autowired
    private HabilidadesRepository habilidadesRepository;
   
    @Override
    public List<Habilidades> getHabilidades(){
        List<Habilidades> listaHabilidadess=habilidadesRepository.findAll();
        return listaHabilidadess;
    }
    
    @Override
    public void saveHabilidades(Habilidades habilidades){
        habilidadesRepository.save(habilidades);
    }    
    
/*    @Override
    public void deleteHabilidades(Long id){
        habilidadesRepository.deleteById(id);
    }
*/
    @Override
    public void deleteHabilidades(Long id){
        Habilidades habilidades=habilidadesRepository.findById(id).orElse(null);
        habilidadesRepository.delete(habilidades);
    }
    
    @Override
    public Habilidades findHabilidades(Long id){
        Habilidades habilidades=habilidadesRepository.findById(id).orElse(null);
        return habilidades;
    }
    
    @Override 
    public int actualizarDatosHabilidades(Long id, String titulo, Long n_orden){
            return habilidadesRepository.actualizarDatosHabilidades(id, titulo, 
                n_orden);
    }
    
}
