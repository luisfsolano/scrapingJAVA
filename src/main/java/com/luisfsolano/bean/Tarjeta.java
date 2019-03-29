/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisfsolano.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author lsolano
 */

@Entity
@Table(name="tarjeta")
public class Tarjeta implements Serializable {
    
    
    @Id
    @Column(name="id")
    int idTarjeta;
    
    @Column(name="saldo")
    double saldo;
    
    @Column(name="ksi")
    String ksi;
    
    @Column(name="alias")
    String alias;
    
    public Tarjeta(int idTarjeta, double saldo, String ksi, String alias) {
        this.idTarjeta = idTarjeta;
        this.saldo = saldo;
        this.ksi = ksi;
        this.alias = alias;
    }

    public Tarjeta() {
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

    public String getKsi() {
        return ksi;
    }

    public void setKsi(String ksi) {
        this.ksi = ksi;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    
}
