/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.repository;

import com.backend.portfolio.model.Experiencia;
import com.backend.portfolio.model.Institucion;
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
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>{

    @Transactional
    @Modifying
    @Query("UPDATE Experiencia SET texto = :texto, desde = :desde, hasta = :hasta, pais = :pais, provincia = :provincia,"
            + " n_orden = :n_orden, institucion = :institucion"
            + " WHERE id = :id")
    int actualizarDatosExperiencia(@Param("id") Long id, 
            @Param("texto") String texto,
            @Param("desde") Year desde, 
            @Param("hasta") Year hasta,
            @Param("pais") String pais,
            @Param("provincia") String provincia,
            @Param("n_orden") Long n_orden,
            @Param("institucion") Institucion institucion);
   

    /*    @Transactional
    @Modifying
    @Query("UPDATE Experiencia, Experiencia_Instituciones SET texto = :texto, desde = :desde, hasta = :hasta, pais = :pais, provincia = :provincia,"
            + " pais = :pais, provincia = :provincia, n_orden = :n_orden, Experiencia_Instituciones.instituciones_id = :id_institucion"
            + " WHERE id = :id AND Experiencia_Instituciones.experiencia_id = :id")
    int actualizarDatosExperiencia(@Param("id") Long id, 
            @Param("texto") String texto,
            @Param("desde") Year desde, 
            @Param("hasta") Year hasta,
            @Param("pais") String pais,
            @Param("provincia") String provincia,
            @Param("pais") String pais,
            @Param("provincia") String provincia,
            @Param("n_orden") Long n_orden,
            @Param("id_institucion") Long id_institucion);
 */   
} 
