/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.dao;


import mx.com.gm.domain.Transacciones;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jhonatan
 */
public interface TransaccionesDao extends JpaRepository<Transacciones, Long>{
    
}
