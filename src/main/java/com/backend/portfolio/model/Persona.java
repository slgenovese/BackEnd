/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Sergio
 */
@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String apellidos;
    private String cargo_actual;
    private String acerca_de;
    private String link_foto;
    private String link_banner;
    private String link_icono;
    private String link_servidor_imagenes;
    private String provincia;
    private String pais;
    
/*    @OneToMany
    private List<Red> redes;
*/
/*    @OneToMany
    private List<Educacion> estudios;
*/
/*    @OneToMany
    private List<Proyectos> proyectos;
*/

/*    @OneToMany
    private List<Habilidades> habilidades;
*/
}