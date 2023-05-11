/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.repository;

import com.backend.portfolio.model.Habilidades;
import java.util.List;

/**
 *
 * @author Sergio
 */
public interface IHabilidadesService {
    
    public List<Habilidades> getHabilidades();
    public void saveHabilidades(Habilidades habilidades);
    public void deleteHabilidades (Long id);
    public Habilidades findHabilidades (Long id);
    public int actualizarDatosHabilidades(Long id, String titulo, Long n_orden);
}