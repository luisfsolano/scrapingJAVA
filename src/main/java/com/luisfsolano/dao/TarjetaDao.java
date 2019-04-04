/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisfsolano.dao;

import com.luisfsolano.controller.ConexionController;
import com.luisfsolano.faces.CrudInterfaces;
import com.luisfsolano.bean.Tarjeta;
import java.util.List;

/**
 *
 * @author lsolano
 */
public class TarjetaDao implements CrudInterfaces<Tarjeta>{
    ConexionController connSession;
    public TarjetaDao() {
        connSession = new ConexionController();
    }

    @Override
    public Tarjeta insert(Tarjeta obj) {
        
            connSession.getSession().saveOrUpdate(obj);
            connSession.getSession().getTransaction().commit();
            return obj;
        
    }

    @Override
    public void delete(Tarjeta obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tarjeta update(Tarjeta obj) {
        try {
            connSession.getSession().update(obj);
            System.out.println("TARJETA ACTUALIZADA");
            return obj;  
        } catch (Exception e) {
            System.out.println("ERROR AL ACTUALIZAR");
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Tarjeta> listAll() {
        return connSession.getSession().createCriteria(Tarjeta.class).list();
    }
    
    @Override
    public Tarjeta findById(Integer id) {
        try {
            Tarjeta buscada = (Tarjeta) connSession.getSession().get(Tarjeta.class, id);
            return buscada;
        } catch (Exception e) {
            return null;
        }        
    }
    
    public void CloseSession(){
        connSession.getSession().disconnect();
    }
    
}
