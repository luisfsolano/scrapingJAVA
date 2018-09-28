/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisfsolano.model;

import com.luisfsolano.controller.ConnSession;
import com.luisfsolano.controller.crudOperations;
import com.luisfsolano.model.Tarjeta;
import java.util.List;

/**
 *
 * @author lsolano
 */
public class TarjetaDao implements crudOperations<Tarjeta>{
    ConnSession connSession;
    public TarjetaDao() {
        connSession = new ConnSession();
    }

    @Override
    public void insert(Tarjeta obj) {
        connSession.getSession().persist(obj);
        connSession.getSession().getTransaction().commit();
    }

    @Override
    public void delete(Tarjeta obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Tarjeta obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Tarjeta> listAll() {
        return connSession.getSession().createQuery("from Tarjetas").list();
    }
    
}
