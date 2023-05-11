/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.repository;

import com.backend.portfolio.model.PersonaRed;
import java.util.List;

/**
 *
 * @author Sergio
 */
public interface IPersonaRedService {
    
    public List<PersonaRed> getPersona_Red();
    public void savePersona_Red(PersonaRed persona_red);
    public void deletePersona_Red (Long id);
    public PersonaRed findPersona_Red (Long id);
}