/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.repository;

import com.backend.portfolio.model.Institucion;
import java.util.List;

/**
 *
 * @author Sergio
 */
public interface IInstitucionService {
    
    public List<Institucion> getInstitucion();
    public void saveInstitucion(Institucion institucion);
    public void deleteInstitucion (Long id);
    public Institucion findInstitucion (Long id);
}