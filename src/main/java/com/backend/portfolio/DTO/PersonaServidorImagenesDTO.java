/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.DTO;

import lombok.Data;

/**
 *
 * @author Sergio
 */
@Data
public class PersonaServidorImagenesDTO {
    private Long id;
    private String link_servidor_imagenes;

    public PersonaServidorImagenesDTO(Long id, String link_servidor_imagenes) {
        this.id = id;
        this.link_servidor_imagenes = link_servidor_imagenes;
    }
 
}
