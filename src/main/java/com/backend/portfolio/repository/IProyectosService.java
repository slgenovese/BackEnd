/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.repository;

import com.backend.portfolio.model.Institucion;
import com.backend.portfolio.model.Proyectos;
import java.time.Year;
import java.util.List;

/**
 *
 * @author Sergio
 */
public interface IProyectosService {
    
    public List<Proyectos> getProyectos();
    public void saveProyectos(Proyectos proyectos);
    public void deleteProyectos (Long id);
    public Proyectos findProyectos (Long id);
    public int actualizarDatosProyectos(Long id, String texto, Year desde, Year hasta, 
            Long n_orden, Institucion institucion);
}