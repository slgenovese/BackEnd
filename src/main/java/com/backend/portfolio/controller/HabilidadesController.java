/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.controller;

import com.backend.portfolio.DTO.HabilidadesDTO;
import com.backend.portfolio.DTO.Habilidades_auxDTO;
import com.backend.portfolio.model.Habilidades;
import com.backend.portfolio.model.Persona;
import com.backend.portfolio.repository.IHabilidadesService;
import com.backend.portfolio.repository.IPersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sergio
 */
@RestController
public class HabilidadesController {
    @Autowired
    private IHabilidadesService interHabilidades;

    @Autowired
    private IPersonaService interPersona;

    @GetMapping("/portfolio/v1/habilidades")
    public List<HabilidadesDTO> getHabilidadesDTO(){
        List<Habilidades> lista = interHabilidades.getHabilidades();
        List<HabilidadesDTO> habilidadesDTO = new ArrayList<HabilidadesDTO>();
        for(int i=0;i< lista.size();++i){
            var e = new HabilidadesDTO(lista.get(i).getId(), lista.get(i).getTitulo(),
                    lista.get(i).getN_orden(), lista.get(i).getHabilidadesDatos());
            habilidadesDTO.add(e);
        }
        return habilidadesDTO;
    }

/*    @PostMapping("/portfolio/v1/habilidades")
    public String createStudent(@RequestBody Habilidades habilidades){
        interHabilidades.saveHabilidades(habilidades);
        return "La Habilidad fue creada correctamente";
    }*/
    
    @PostMapping("/portfolio/v1/habilidades/{persona_id}")
    public String createHabilidades(@PathVariable(value = "persona_id") Long persona_id,
      @RequestBody Habilidades habilidadesRequest) {
      Persona persona = interPersona.findPersona(persona_id);
      System.out.println(persona.getApellidos());
      habilidadesRequest.setPersona(persona);
      interHabilidades.saveHabilidades(habilidadesRequest);
      return "OK";
    }

    
    @DeleteMapping("/portfolio/v1/habilidades/{id}")
    public String deleteHabilidades(@PathVariable Long id){
        interHabilidades.deleteHabilidades(id);
        return "Las habilidades fueron eliminadas correctamente";
    }
/*
    @PutMapping("/portfolio/v1/habilidades/{id}")
    public Habilidades editHabilidades(@PathVariable Long id,
                                @RequestParam ("Titulo") String nuevoTitulo, 
                                @RequestParam ("N_Orden") Long nuevoN_Orden 
                                ){
        Habilidades habilidades = interHabilidades.findHabilidades(id);
        habilidades.setTitulo(nuevoTitulo);
        habilidades.setN_orden(nuevoN_Orden);
        interHabilidades.saveHabilidades(habilidades);
        return habilidades;
    }
*/
    @PutMapping("/portfolio/v1/habilidades/{id}")
    public int actualizarDatos(@PathVariable Long id, @RequestBody Habilidades_auxDTO habilidadesDatos){
        return interHabilidades.actualizarDatosHabilidades(id, habilidadesDatos.getTitulo(),
                habilidadesDatos.getN_orden());

    } 

}
