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

public class UsuarioDTO {
    private Long id;
    private String usuario;
    private String password;
    private Long persona_id;

    public UsuarioDTO() {
        this.id = Long.valueOf(1);
        this.usuario = "";
        this.password = "";
        this.persona_id = Long.valueOf(1);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(Long persona_id) {
        this.persona_id = persona_id;
    }
  

}
