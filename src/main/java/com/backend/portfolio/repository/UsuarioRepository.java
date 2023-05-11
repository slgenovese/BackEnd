/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.portfolio.repository;

import com.backend.portfolio.DTO.UsuarioDTO;
import com.backend.portfolio.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sergio
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    @Transactional
//    @Modifying no es necesario tratandoce de una consulta, no hay Update
    @Query (value = "SELECT NEW com.backend.portfolio.DTO.UsuarioDTO(id, usuario, password, persona_id)FROM Usuario WHERE usuario = :usuario")
    UsuarioDTO traerUsuarioPassword(@Param("usuario") String usuario);
//    UsuarioDTO traerUsuarioPassword();
   
}
