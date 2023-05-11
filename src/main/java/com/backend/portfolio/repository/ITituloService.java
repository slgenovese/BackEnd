/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.repository;

import com.backend.portfolio.model.Titulo;
import java.util.List;

/**
 *
 * @author Sergio
 */
public interface ITituloService {
    
    public List<Titulo> getTitulo();
    public void saveTitulo(Titulo titulo);
    public void deleteTitulo (Long id);
    public Titulo findTitulo (Long id);
}