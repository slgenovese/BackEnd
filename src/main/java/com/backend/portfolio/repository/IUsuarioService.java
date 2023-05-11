/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.repository;

import com.backend.portfolio.DTO.UsuarioDTO;
import com.backend.portfolio.model.Usuario;
import java.util.List;

/**
 *
 * @author Sergio
 */
public interface IUsuarioService {
    
    public List<Usuario> getUsuarios();
    public void saveUsuario(Usuario usuario);
    public void deleteUsuario (Long id);
    public Usuario findUsuario (Long id);
//    public String traerUsuarioPassword(String usuario);
    public UsuarioDTO traerUsuarioPassword(String usuario);
}
