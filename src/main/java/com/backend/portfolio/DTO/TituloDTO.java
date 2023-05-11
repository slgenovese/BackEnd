/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.DTO;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Sergio
 */
@Data
public class TituloDTO implements Serializable {
    private Long id;
    private String Titulo;

    public TituloDTO(Long id, String Titulo) {
        this.id = id;
        this.Titulo = Titulo;
    }
    
}
