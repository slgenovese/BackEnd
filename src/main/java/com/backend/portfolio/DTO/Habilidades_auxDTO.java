/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.DTO;

/**
 *
 * @author sgenovese
 */
public class Habilidades_auxDTO {
    private Long id;
    private String titulo;
    private Long n_orden;

    public Habilidades_auxDTO(Long id, String titulo, Long n_orden) {
        this.id = id;
        this.titulo = titulo;
        this.n_orden = n_orden;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getN_orden() {
        return n_orden;
    }

    public void setN_orden(Long n_orden) {
        this.n_orden = n_orden;
    }
    
}
