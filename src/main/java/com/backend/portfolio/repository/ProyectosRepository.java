/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.repository;

import com.backend.portfolio.model.Institucion;
import com.backend.portfolio.model.Proyectos;
import java.time.Year;
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
public interface ProyectosRepository extends JpaRepository<Proyectos, Long>{
    @Transactional
    @Modifying
    @Query("UPDATE Proyectos SET texto = :texto, desde = :desde, hasta = :hasta,"
            + " n_orden = :n_orden, institucion = :institucion"
            + " WHERE id = :id")
    int actualizarDatosProyectos(@Param("id") Long id, 
            @Param("texto") String texto,
            @Param("desde") Year desde, 
            @Param("hasta") Year hasta,
            @Param("n_orden") Long n_orden,
            @Param("institucion") Institucion institucion);
    
}
