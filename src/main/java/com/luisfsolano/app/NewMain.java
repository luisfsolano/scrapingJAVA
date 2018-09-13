/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisfsolano.app;

import com.luisfsolano.Bean.TarjetaBean;
import com.luisfsolano.Controller.TarjetaController;
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
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        
        // Controller
        TarjetaController tController = new TarjetaController();
        
        //Creacion de Tarjeta
        tController.crearTarjeta(id);
        
        // Bean
        TarjetaBean tarjeta = tController.devolverTarjeta();
        
        //impresion
        System.out.println("id: "+tarjeta.getIdTarjeta()+" saldo: "+tarjeta.getSaldo());
        
    }
    
}
