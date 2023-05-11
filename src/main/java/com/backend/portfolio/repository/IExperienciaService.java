/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.repository;

import com.backend.portfolio.model.Experiencia;
import com.backend.portfolio.model.Institucion;
import java.time.Year;
import java.util.List;

/**
 *
 * @author Sergio
 */
public interface IExperienciaService {
    
    public List<Experiencia> getExperiencia();
    public void saveExperiencia(Experiencia experiencia);
    public void deleteExperiencia (Long id);
    public Experiencia findExperiencia (Long id);
    public int actualizarDatosExperiencia(Long id, String texto, Year desde, Year hasta, 
            String pais, String provincia, Long n_orden, Institucion institucion);
}