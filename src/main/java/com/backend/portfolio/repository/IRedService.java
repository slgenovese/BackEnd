/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.repository;

import com.backend.portfolio.model.Red;
import java.util.List;

/**
 *
 * @author Sergio
 */
public interface IRedService {
    
    public List<Red> getRed();
    public void saveRed(Red red);
    public void deleteRed (Long id);
    public Red findRed (Long id);
}