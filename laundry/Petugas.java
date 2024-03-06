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
public class Petugas implements User{
    
    private ArrayList<Integer> idPetugas = new ArrayList<Integer>();
    private ArrayList<String> namaPetugas= new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<String> jabatan = new ArrayList<String>();
    
    public Petugas() {
            
        this.idPetugas.add(0);
        this.namaPetugas.add("admin 1");
        this.alamat.add("Jembatan");
        this.jabatan.add("Senior");
        this.telepon.add("08123123123");
            
        this.idPetugas.add(1);
        this.namaPetugas.add("admin 2");
        this.alamat.add("Pinggiran");
        this.telepon.add("081112223333");
        this.jabatan.add("Junior");
            
        this.idPetugas.add(2);
        this.namaPetugas.add("admin 3");
        this.alamat.add("Jalan Raya");
        this.telepon.add("08321312312");
        this.jabatan.add("Nganggur");
        }
        public void setJabatan(String jabatan ){
            this.jabatan.add(jabatan);
        }
        public int getNoPetugas(int idPetugas){
        return this.idPetugas.get(idPetugas);
    }
        public String getJabatan(int idPetugas){
            return this.jabatan.get(idPetugas);
        } 
        public int getJmlPetugas(){
            return this.namaPetugas.size();
        } 
        @Override
        public void setNama(String namaPetugas ){
            this.namaPetugas.add(namaPetugas);
        }

        @Override
        public void setAlamat(String alamat ){
            this.namaPetugas.add(alamat);
        }
        @Override
        public void setTelepon(String telepon ){
            this.namaPetugas.add(telepon); 
        }

        @Override
        public String getNama(int idPetugas){
            return this.namaPetugas.get(idPetugas);
        }

        @Override
        public String getAlamat(int idPetugas){
            return this.alamat.get(idPetugas);
        }

        @Override
        public String getTelepon(int idPetugas){
            return this.telepon.get(idPetugas);
        }
}
