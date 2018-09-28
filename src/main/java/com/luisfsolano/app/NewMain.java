/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisfsolano.app;

import com.luisfsolano.model.Tarjeta;
import com.luisfsolano.controller.TarjetaController;
import com.luisfsolano.model.TarjetaDao;
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
        
        // objeto para escanear
        System.out.println("ingrese el No. de tarjeta");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        
        for (int i = id; i <= id+20; i++) {
            TarjetaController tController = new TarjetaController();

            //Creacion de Tarjeta
            tController.crearTarjeta(i);

            // Bean
            //Tarjeta tarjeta = tController.devolverTarjeta() ;

            //Guardar en la base de datos
            TarjetaDao tarjetaDao = new TarjetaDao();
            tarjetaDao.insert(tController.devolverTarjeta());
        }
        
        
        //impresion
        //System.out.println("id: "+tarjeta.getIdTarjeta()+" KSI: "+tarjeta.getKsi()+" saldo: "+tarjeta.getSaldo());
        
    }
    
}
