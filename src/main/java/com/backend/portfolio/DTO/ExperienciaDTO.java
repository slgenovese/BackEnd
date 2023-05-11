/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.DTO;

import com.backend.portfolio.model.Institucion;
import java.io.Serializable;
import java.time.Year;

/**
 *
 * @author sgenovese
 */

public class ExperienciaDTO implements Serializable{
    private Long id;
    private String texto;
    private Year desde;
    private Year hasta;
    private String provincia;
    private String pais;
    private Long n_orden;
    private Institucion institucion;

    public ExperienciaDTO(Long id, String texto, Year desde, Year hasta, String provincia, String pais, Long n_orden, Institucion institucion) {
        this.id = id;
        this.texto = texto;
        this.desde = desde;
        this.hasta = hasta;
        this.provincia = provincia;
        this.pais = pais;
        this.n_orden = n_orden;
        this.institucion = institucion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Year getDesde() {
        return desde;
    }

    public void setDesde(Year desde) {
        this.desde = desde;
    }

    public Year getHasta() {
        return hasta;
    }

    public void setHasta(Year hasta) {
        this.hasta = hasta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Long getN_orden() {
        return n_orden;
    }

    public void setN_orden(Long n_orden) {
        this.n_orden = n_orden;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }


}
