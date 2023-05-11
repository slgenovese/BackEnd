/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.model;

import lombok.Data;

/**
 *
 * @author Sergio
 */
@Data
public class PersonaAcerca_De {
    private Long id;
    private String link_icono;
    private String nombres;
    private String apellidos;
    private String cargo_actual;
    private String provincia;
    private String pais;
    private String acerca_de;

    public PersonaAcerca_De(Long id, String link_icono, String nombres, String apellidos, String cargo_actual, String provincia, String pais, String acerca_de) {
        this.id = id;
        this.link_icono = link_icono;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cargo_actual = cargo_actual;
        this.provincia = provincia;
        this.pais = pais;
        this.acerca_de = acerca_de;
    }

}
