/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.repository;

import com.backend.portfolio.model.Persona;
import com.backend.portfolio.DTO.PersonaAcerca_DeDTO;
import com.backend.portfolio.DTO.PersonaBannerDTO;
import com.backend.portfolio.DTO.PersonaServidorImagenesDTO;
import java.util.List;

/**
 *
 * @author Sergio
 */
public interface IPersonaService {
    
    public List<Persona> getPersonas();
    public void savePersona(Persona persona);
    public void deletePersona (Long id);
    public Persona findPersona (Long id);
    public PersonaAcerca_DeDTO traerAcerca_De();
    public PersonaBannerDTO traerBanner();
    public PersonaServidorImagenesDTO traerServidorImagenes();
    public int actualizarAcercaDe(Long id, String acerca_de);
    public int actualizarBanner(Long id, String link_banner);
    public int actualizarFoto(Long id, String link_foto);
    public int actualizarServidorImagenes(Long id, String link_servidor_imagenes);
    public int actualizarDatos(Long id, String link_icono, String nombres, 
            String apellidos, String cargo_actual, String pais, String provincia);

}