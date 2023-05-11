/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.repository;

import com.backend.portfolio.model.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sergio
 */
@Repository
public interface HabilidadesRepository extends JpaRepository<Habilidades, Long>{
    @Transactional
    @Modifying
    @Query("UPDATE Habilidades SET titulo = :titulo, n_orden = :n_orden"
            + " WHERE id = :id")
    int actualizarDatosHabilidades(@Param("id") Long id, 
            @Param("titulo") String titulo, 
            @Param("n_orden") Long n_orden);


    
}
