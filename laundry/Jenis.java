/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laundry;

import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class Jenis {
    
    private ArrayList<Integer> noJenis = new ArrayList<Integer>();
    private ArrayList<String> jenis = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
    
    public Jenis() {
        this.noJenis.add(0);
        this.jenis.add("Cuci Basah");
        this.harga.add(2000);
        this.durasi.add(1);
        
        this.noJenis.add(1);
        this.jenis.add("Cuci Kering");
        this.harga.add(5000);
        this.durasi.add(2);
        
        this.noJenis.add(2);
        this.jenis.add("Cuci Setrika");
        this.harga.add(7000);
        this.durasi.add(3);
        }
        public int getJmlJenis(){
            return this.jenis.size();
            //menghitung jumlah array
        }
        public int getNoJenis(int idJenis){
            return this.noJenis.get(idJenis);
        }
        public void setNamaJenis(String namaJenis ){
            this.jenis.add(namaJenis);
        }
        public String getNamaJenis(int idJenis){
            return this.jenis.get(idJenis);
        } 

        public void setHarga(int harga ){
            this.harga.add(harga);
        }
        public int getHarga(int idJenis){
            return this.harga.get(idJenis);
        } 
        public void editHarga(int idJenis, int harga){
            this.harga.set(idJenis, harga);;
        } 
        public void setDurasi(int durasi ){
            this.durasi.add(durasi);
        }
        public int getDurasi(int idJenis){
            return this.durasi.get(idJenis);
        }
}
