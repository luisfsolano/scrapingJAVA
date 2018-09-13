/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisfsolano.bean;

/**
 *
 * @author lsolano
 */
public class TarjetaBean {
    int idTarjeta;
    double saldo;

    public TarjetaBean(int idTarjeta, double saldo) {
        this.idTarjeta = idTarjeta;
        this.saldo = saldo;
    }

    public TarjetaBean() {
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    
    
}
