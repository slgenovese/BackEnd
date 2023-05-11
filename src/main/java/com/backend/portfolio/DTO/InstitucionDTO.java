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
public class InstitucionDTO implements Serializable {
    private Long id;
    private String institucion;
    private String link_icono;

    public InstitucionDTO(Long id, String institucion, String link_icono) {
        this.id = id;
        this.institucion = institucion;
        this.link_icono = link_icono;
    }

}
