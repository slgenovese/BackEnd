/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.controller;

import com.backend.portfolio.DTO.InstitucionDTO;
import com.backend.portfolio.model.Institucion;
import com.backend.portfolio.repository.IInstitucionService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sergio
 */
@RestController
public class InstitucionController {
    @Autowired
    private IInstitucionService interInstitucion;

    @GetMapping("/portfolio/v1/instituciones")
    public List<InstitucionDTO> getInstitucionDTO(){
        List<Institucion> lista = interInstitucion.getInstitucion();
        List<InstitucionDTO> institucionDTO = new ArrayList<InstitucionDTO>();
        for(int i=0;i< lista.size();++i){
            var e = new InstitucionDTO(lista.get(i).getId(), lista.get(i).getInstitucion(), 
                    lista.get(i).getLink_icono());
            institucionDTO.add(e);
        }
        return institucionDTO;
    }

    @PostMapping("/portfolio/v1/instituciones")
    public String createStudent(@RequestBody Institucion institucion){
        interInstitucion.saveInstitucion(institucion);
        return "El institucion fue creado correctamente";
    }
    @DeleteMapping("/portfolio/v1/instituciones/{id}")
    public String deleteInstitucion(@PathVariable Long id){
        interInstitucion.deleteInstitucion(id);
        return "El institucion fue eliminado correctamente";
    }
    @PutMapping("/portfolio/v1/instituciones/{id}")
    public Institucion editInstitucion(@PathVariable Long id,
                                @RequestParam ("Institucion") String nuevoInstitucion, 
                                @RequestParam ("Link_Icono") String nuevoLink_Icono 
                                ){
        Institucion institucion = interInstitucion.findInstitucion(id);
        institucion.setInstitucion(nuevoInstitucion);
        institucion.setLink_icono(nuevoLink_Icono);
        interInstitucion.saveInstitucion(institucion);
        return institucion;
    }

}
