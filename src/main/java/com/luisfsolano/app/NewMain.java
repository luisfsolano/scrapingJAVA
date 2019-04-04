/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisfsolano.app;

import com.luisfsolano.bean.Tarjeta;
import com.luisfsolano.controller.TarjetaController;
import com.luisfsolano.dao.TarjetaDao;
import java.util.ArrayList;
import java.util.List;
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
        
        TarjetaController tController = new TarjetaController();
        
        Scanner scaner = new Scanner(System.in);
//        
        System.out.println("Ingrese el alias de la tarjeta");
        String alias = scaner.nextLine();
        
        System.out.println("ingrese el No. de tarjeta");
        Integer id = scaner.nextInt();
        
        
        Tarjeta tarjeta = tController.crearTarjeta(id,alias);
//        Tarjeta tarjeta = tController.BuscarTarjeta(32350141);
        
        System.out.println("id: \""+tarjeta.getIdTarjeta()+"\" alias: \""+tarjeta.getAlias()+"\" saldo: \""+tarjeta.getSaldo()+"\"");
        
//        List<Tarjeta> tarjetas = new ArrayList<>();
//        tarjetas.addAll(tController.ListarTodas());
//        
//        for (Tarjeta tarjeta : tarjetas) {
//            System.out.println("id: \""+tarjeta.getIdTarjeta()+"\" alias: \""+tarjeta.getAlias()+"\" saldo: \""+tarjeta.getSaldo()+"\"");
//        }
        
        System.exit(0); 
    }
    
}
