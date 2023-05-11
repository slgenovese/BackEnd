/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.controller;

import com.backend.portfolio.DTO.RespuestaDTO;
import com.backend.portfolio.DTO.UsuarioDTO;
import com.backend.portfolio.model.Usuario;
import com.backend.portfolio.repository.IUsuarioService;
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
public class UsuarioController {
    @Autowired
    private IUsuarioService interUsuario;

    @GetMapping("/portfolio/v1/usuarios")
    public List<Usuario> getUsuarios(){
        return interUsuario.getUsuarios();
    }

    @PostMapping("/portfolio/v1/usuarios")
    public String createStudent(@RequestBody Usuario usuario){
        interUsuario.saveUsuario(usuario);
        return "El usuario fue creado correctamente";
    }
    @DeleteMapping("/portfolio/v1/usuarios/{id}")
    public String deleteUsuario(@PathVariable Long id){
        interUsuario.deleteUsuario(id);
        return "El usuario fue eliminado correctamente";
    }

/*    @PutMapping("/portfolio/v1/usuarios/{id}")
    public Usuario editUsuario(@PathVariable Long id,
                                @RequestParam ("usuario") String nuevoUsuario, 
                                @RequestParam ("password") String nuevoPassword, 
                                @RequestParam ("persona_id") long nuevoPersona_id 
                                ){
        Usuario usuario = interUsuario.findUsuario(id);
        usuario.setUsuario(nuevoUsuario);
        usuario.setPassword(nuevoPassword);
        usuario.setPersona_id(nuevoPersona_id);
        interUsuario.saveUsuario(usuario);
        return usuario;
    }*/

    @PutMapping("/portfolio/v1/usuarios/{id}")
    public String editUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
        interUsuario.saveUsuario(usuario);
        return "El usuario fue actualizado correctamente";
    }

    @PostMapping("/portfolio/v1/usuarios/password")
    public RespuestaDTO traerUsuarioPassword_Prueba(@RequestBody UsuarioDTO usuarioDTO){
//        interUsuario.traerUsuarioPassword(usuarioDTO.getUsuario());
        UsuarioDTO usuario = interUsuario.traerUsuarioPassword(usuarioDTO.getUsuario());
//        System.out.print(usuario.getUsuario());
//        System.out.print(usuarioDTO.getUsuario());
        var respuestaDTO = new RespuestaDTO("");
        if ((usuario!=null) &&(usuario.getUsuario().equals(usuarioDTO.getUsuario()) && usuario.getPassword().equals(usuarioDTO.getPassword()))){
            respuestaDTO.setRespuesta("OK");
        }
        else{
            respuestaDTO.setRespuesta("NOP");
        }
        return respuestaDTO;
    }

}
