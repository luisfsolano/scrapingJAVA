/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisfsolano.Controller;

import com.luisfsolano.Bean.TarjetaBean;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author lsolano
 */
public class TarjetaController {
    
    
    
    
    TarjetaBean tarjeta = new TarjetaBean();
    
    public void crearTarjeta(int id){
        String url = "http://200.46.245.230:8080/PortalCAE-WAR-MODULE/SesionPortalServlet?accion=6&NumDistribuidor=99&NomUsuario=usuInternet&NomHost=AFT&NomDominio=aft.cl&Trx=&RutUsuario=0&NumTarjeta="+id+"&bloqueable=";
                try {
                    Document document = Jsoup.connect(url).userAgent("Mozilla/5.0").timeout(100000).get();
                    Elements entradas = document.select("td.verdanabold-ckc");
                    tarjeta.setIdTarjeta(Integer.parseInt(entradas.get(1).getElementsByClass("verdanabold-ckc").text()));
                    tarjeta.setSaldo(Double.parseDouble(entradas.get(5).getElementsByClass("verdanabold-ckc").text()));
                } catch (Exception e) {
                    System.out.println(">>>>>>>  Excepcion: "+e.getMessage()+"-----"+e.getLocalizedMessage());
                }
            
    }
    
    public TarjetaBean devolverTarjeta(){
        return tarjeta;
    }
    
}


