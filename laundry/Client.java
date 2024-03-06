/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laundry;

import java.util.*;
/**
 *
 * @author Asus
 */
public class Client implements User {
 
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    
    
    public Client(){
        this.idClient.add(0);
        this.namaClient.add("Zidane");
        this.alamat.add("Tuban");
        this.telepon.add("0812345678");
        this.saldo.add(1000000);
        
        this.idClient.add(1);
        this.namaClient.add("Fawwaz");
        this.alamat.add("Jatim");
        this.telepon.add("081234321");
        this.saldo.add(500000);
        
        this.idClient.add(2);
        this.namaClient.add("Rosyidi");
        this.alamat.add("Palang");
        this.telepon.add("089876543");
        this.saldo.add(15000000);
    }
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    public int getNoClient(int idClient){
        return this.idClient.get(idClient);
    }
    public int getSaldo(int idClient){
        return this.saldo.get(idClient);
    } 
    public void editSaldo(int idClient, int saldo){
        this.saldo.set(idClient, saldo);
    } 
    public int getJmlClient(){
        return this.saldo.size();
    } 
    @Override
    public void setNama(String namaClient ){
        this.namaClient.add(namaClient);
    }

    @Override
    public void setAlamat(String alamat ){
        this.alamat.add(alamat);
    }
    @Override
        public void setTelepon(String telepon ){
            this.telepon.add(telepon);
        }
 
        @Override
        public String getNama(int idClient){
            return this.namaClient.get(idClient);
        }
    
        @Override
        public String getAlamat(int idClient){
            return this.alamat.get(idClient);
        }
 
        @Override
        public String getTelepon(int idClient){
            return this.telepon.get(idClient);
        }
}
