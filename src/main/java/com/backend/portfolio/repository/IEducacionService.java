/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.repository;

import com.backend.portfolio.model.Educacion;
import com.backend.portfolio.model.Institucion;
import com.backend.portfolio.model.Titulo;
import java.time.Year;
import java.util.List;

/**
 *
 * @author Sergio
 */
public interface IEducacionService {
    
    public List<Educacion> getEducacion();
    public void saveEducacion(Educacion educacion);
    public void deleteEducacion (Long id);
    public Educacion findEducacion (Long id);
    public int actualizarDatosEducacion(Long id, Year desde, Year hasta, 
            Long n_orden, Institucion institucion, Titulo titulo);
}