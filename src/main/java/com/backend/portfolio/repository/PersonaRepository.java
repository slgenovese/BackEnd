/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.portfolio.repository;

import com.backend.portfolio.model.Persona;
import com.backend.portfolio.DTO.PersonaAcerca_DeDTO;
import com.backend.portfolio.DTO.PersonaBannerDTO;
import com.backend.portfolio.DTO.PersonaServidorImagenesDTO;
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
public interface PersonaRepository extends JpaRepository<Persona, Long>{

    @Query (value = "SELECT NEW com.backend.portfolio.DTO.PersonaAcerca_DeDTO(id, link_icono, nombres, apellidos, cargo_actual, provincia, pais, acerca_de)FROM Persona")
    PersonaAcerca_DeDTO traerAcercaDe();

    @Query (value = "SELECT NEW com.backend.portfolio.DTO.PersonaBannerDTO(id, link_banner, link_foto)FROM Persona")
    PersonaBannerDTO traerBanner();

    @Query (value = "SELECT NEW com.backend.portfolio.DTO.PersonaServidorImagenesDTO(id, link_servidor_imagenes)FROM Persona")
    PersonaServidorImagenesDTO traerServidorImagenes();

    @Transactional
    @Modifying
    @Query("update Persona set acerca_de = :acerca_de where id = :id")
    int actualizarAcercaDe(@Param("id") Long id, @Param("acerca_de") String acerca_de);

    @Transactional
    @Modifying
    @Query("update Persona set link_banner = :link_banner where id = :id")
    int actualizarBanner(@Param("id") Long id, @Param("link_banner") String link_banner);

    @Transactional
    @Modifying
    @Query("update Persona set link_servidor_imagenes = :link_servidor_imagenes where id = :id")
    int actualizarServidorImagenes(@Param("id") Long id, @Param("link_servidor_imagenes") String link_servidor_imagenes);

    @Transactional
    @Modifying
    @Query("update Persona set link_foto = :link_foto where id = :id")
    int actualizarFoto(@Param("id") Long id, @Param("link_foto") String link_foto);

    @Transactional
    @Modifying
    @Query("update Persona set link_icono = :link_icono, nombres = :nombres, apellidos = :apellidos, "
            + "cargo_actual = :cargo_actual, pais = :pais, provincia = :provincia "
            + "where id = :id")
    int actualizarDatos(@Param("id") Long id, 
            @Param("link_icono") String link_icono, 
            @Param("nombres") String nombres,
            @Param("apellidos") String apellidos,
            @Param("cargo_actual") String cargo_actual,
            @Param("pais") String pais,
            @Param("provincia") String provincia);
}
