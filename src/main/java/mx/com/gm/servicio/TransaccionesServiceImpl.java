package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.PersonaDao;
import mx.com.gm.dao.TransaccionesDao;
import mx.com.gm.domain.Persona;
import mx.com.gm.domain.Transacciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonatan
 */
@Service
public class TransaccionesServiceImpl implements TransaccionesService{

    @Autowired
    private TransaccionesDao transaccionesDao;

    @Override
    @Transactional(readOnly = true)
    public List<Transacciones> listarTransacciones() {
         return (List<Transacciones>) transaccionesDao.findAll();
    }

    @Override
    public void guardar(Transacciones transacciones) {
        transaccionesDao.save(transacciones);
    }
    
   

   
    
}
