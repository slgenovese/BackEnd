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
@Data
public class PersonaBannerDTO {
    private Long id;
    private String link_banner;
    private String link_foto;

    public PersonaBannerDTO(Long id, String link_banner, String link_foto) {
        this.id = id;
        this.link_banner = link_banner;
        this.link_foto = link_foto;
    }
    
}
