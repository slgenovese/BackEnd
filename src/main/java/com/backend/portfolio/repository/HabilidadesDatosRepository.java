/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.repository;

import com.backend.portfolio.model.HabilidadesDatos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sergio
 */

@Repository
public interface HabilidadesDatosRepository extends JpaRepository<HabilidadesDatos, Long>{
/*
    @Transactional
    @Modifying
    @Query("INSERT INTO habilidades_datos(id, color, etiqueta, porcentaje) VALUES (id, titulo, color, porcentaje)")
    int insertarDatosHabilidades(@Param("id") Long id, 
            @Param("titulo") String titulo, 
            @Param("n_orden") Long n_orden);
*/
    
}
    
