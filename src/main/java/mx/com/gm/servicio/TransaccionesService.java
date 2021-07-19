/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Transacciones;


/**
 *
 * @author Jhonatan
 */
public interface TransaccionesService {
    
    public List<Transacciones> listarTransacciones();
    
    public void guardar(Transacciones transacciones);
}
