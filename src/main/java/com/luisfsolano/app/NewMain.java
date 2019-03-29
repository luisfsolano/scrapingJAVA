/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisfsolano.app;

import com.luisfsolano.bean.Tarjeta;
import com.luisfsolano.controller.TarjetaController;
import com.luisfsolano.dao.TarjetaDao;
import java.util.Scanner;

/**
 *
 * @author lsolano
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Scanner scaner = new Scanner(System.in);
//        
//        System.out.println("Ingrese el alias de la tarjeta");
//        String alias = scaner.nextLine();
//        
//        System.out.println("ingrese el No. de tarjeta");
//        Integer id = scaner.nextInt();
        
        TarjetaController tController = new TarjetaController();

        //Creacion de Tarjeta
        Tarjeta tarjeta = tController.crearTarjeta(32350144,"Luis Solano");
        System.out.println(tarjeta.getSaldo());
        // Bean
        //Tarjeta tarjeta = tController.devolverTarjeta() ;

        //Guardar en la base de datos
//        TarjetaDao tarjetaDao = new TarjetaDao();
//        tarjetaDao.insert(tController.devolverTarjeta());
        
        
        
        //impresion
        //System.out.println("id: "+tarjeta.getIdTarjeta()+" KSI: "+tarjeta.getKsi()+" saldo: "+tarjeta.getSaldo());
        
    }
    
}
