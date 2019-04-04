/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisfsolano.controller;

import com.luisfsolano.bean.Tarjeta;
import com.luisfsolano.dao.TarjetaDao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author lsolano
 */
public class TarjetaController {
    
    public Tarjeta crearTarjeta(Integer id, String alias){
        TarjetaDao tarjetaDao = new TarjetaDao();
        Tarjeta tarjeta = new Tarjeta();
        String url = "http://200.46.245.230:8080/PortalCAE-WAR-MODULE/SesionPortalServlet?accion=6&NumDistribuidor=99&NomUsuario=usuInternet&NomHost=AFT&NomDominio=aft.cl&Trx=&RutUsuario=0&NumTarjeta="+id+"&bloqueable=";
        try {
            Document document = Jsoup.connect(url).timeout(100000).get();
            Elements entradas = document.select("td.verdanabold-ckc");
            tarjeta.setIdTarjeta(Integer.parseInt(entradas.get(1).getElementsByClass("verdanabold-ckc").text()));
            tarjeta.setSaldo(Double.parseDouble(entradas.get(5).getElementsByClass("verdanabold-ckc").text()));

            Elements movimientos = document.getElementsByTag("input");
            tarjeta.setKsi(movimientos.get(0).val());
            tarjeta.setAlias(alias);

            tarjetaDao.insert(tarjeta);
            tarjetaDao.CloseSession();
            return tarjeta;


        } catch (Exception e) {
            System.out.println("Error >> TarjetaController.CrearTarjeta(Integer,String)");
            return null;
        }           
    }
    
    public Tarjeta BuscarTarjeta(Integer id){
        Tarjeta tarjeta = new Tarjeta();
        try {
            TarjetaDao tarjetaDao = new TarjetaDao();
            tarjeta = tarjetaDao.findById(id);
            tarjetaDao.CloseSession();
            if (tarjeta != null) {
                return tarjeta.getDatos();
            }else{
                try {
                    return crearTarjeta(id,null);
                } catch (Exception e) {
                    System.out.println("Error >> TarjetaController.FindById(Integer) -> else");
                    return null;                    
                }
            }
        } catch (Exception e) {
            System.out.println("Error >> TarjetaController.FindById(Integer)");
            return null;
        }
    }

    public List<Tarjeta> ListarTodas() {
        try {
            TarjetaDao tarjetaDao = new TarjetaDao();
            List<Tarjeta> tarjetas = tarjetaDao.listAll();
            tarjetaDao.CloseSession();
            return tarjetas;
        } catch (Exception e) {
            System.out.println("Error >> TarjetaController.ListarTodas()");
            return null;
        }
    }

    
}


