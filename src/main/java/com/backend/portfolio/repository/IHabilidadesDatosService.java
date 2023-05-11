/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.repository;

import com.backend.portfolio.model.HabilidadesDatos;
import java.util.List;

/**
 *
 * @author Sergio
 */
public interface IHabilidadesDatosService {
    
    public List<HabilidadesDatos> getHabilidadesDatos();
    public void saveHabilidadesDatos(HabilidadesDatos habilidadesDatos);
    public void deleteHabilidadesDatos (Long id);
    public HabilidadesDatos findHabilidadesDatos (Long id);
}