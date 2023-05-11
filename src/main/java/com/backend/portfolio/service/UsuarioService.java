/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.DTO.UsuarioDTO;
import com.backend.portfolio.model.Usuario;
import com.backend.portfolio.repository.IUsuarioService;
import com.backend.portfolio.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sergio
 */
@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public List<Usuario> getUsuarios(){
    List<Usuario> listaUsuarios=usuarioRepository.findAll();
    return listaUsuarios;
    }

    @Override
    public void saveUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }    

    @Override
    public void deleteUsuario(Long id){
        usuarioRepository.deleteById(id);
    }
    
    @Override
    public Usuario findUsuario(Long id){
        Usuario usuario=usuarioRepository.findById(id).orElse(null);
        return usuario;
    }

    @Override
    public UsuarioDTO traerUsuarioPassword(String usuario){
        UsuarioDTO usuario_aux= usuarioRepository.traerUsuarioPassword(usuario);
        return usuario_aux;
    }

//    public String traerUsuarioPassword(String usuario){
//        return usuarioRepository.traerUsuarioPassword(usuario);


}
