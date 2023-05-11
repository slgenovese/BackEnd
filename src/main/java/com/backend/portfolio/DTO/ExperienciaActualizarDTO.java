/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.DTO;

import java.io.Serializable;
import java.time.Year;
import lombok.Data;

/**
 *
 * @author sgenovese
 */
@Data
public class ExperienciaActualizarDTO implements Serializable{
    private Long id;
    private String texto;
    private Year desde;
    private Year hasta;
    private String provincia;
    private String pais;
    private Long n_orden;
    private Long id_institucion;

    public ExperienciaActualizarDTO(Long id, String texto, Year desde, Year hasta, String provincia, String pais, Long n_orden, Long id_institucion) {
        this.id = id;
        this.texto = texto;
        this.desde = desde;
        this.hasta = hasta;
        this.provincia = provincia;
        this.pais = pais;
        this.n_orden = n_orden;
        this.id_institucion = id_institucion;
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

    public String getprovincia() {
        return provincia;
    }

    public void setprovincia(String provincia) {
        this.provincia = provincia;
    }

    public String getpais() {
        return pais;
    }

    public void setpais(String pais) {
        this.pais = pais;
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

    public Long getId_institucion() {
        return id_institucion;
    }

    public void setId_institucion(Long id_institucion) {
        this.id_institucion = id_institucion;
    }

}
