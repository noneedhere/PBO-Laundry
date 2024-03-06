/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laundry;

/**
 *
 * @author Asus
 */
public class Laporan {
    
    public void laporanPaket(Jenis jenis){
        int x = jenis.getJmlJenis();
        
        System.out.println("");
        System.out.println("                            List ");
        System.out.println("================================================================");
        System.out.println(" ======================{ Daftar Paket }=======================");
        System.out.println("");
        System.out.println("Id Paket \tNama Paket \tHarga/pakaian \tWaktu ambil");
        System.out.println("");
        
        for (int i = 0; i < x; i++) {
            System.out.println("   "+jenis.getNoJenis(i)+"\t\t"+jenis.getNamaJenis(i)+"\t   "+jenis.getHarga(i)+"\t\t  "+jenis.getDurasi(i)+" Hari");
        } 
        System.out.println("");
        System.out.println("===============================================================");
    }
    
    public void laporanClient(Client client) {
        int x = client.getJmlClient();
        
        System.out.println("");
        System.out.println(" ===================={ Tabel Client }========================");
        System.out.println("");
        System.out.println("Id Client  \tNama \t\tAlamat \t\tTelpon \t\tSaldo");
        System.out.println("");
        for (int i = 0; i < x; i++) {
            System.out.println("   "+client.getNoClient(i)+"\t\t"+client.getNama(i)+"\t\t"+ client.getAlamat(i)+"\t\t"+ client.getTelepon(i)+"\t"+client.getSaldo(i));
        }
        System.out.println("");
        System.out.println("=================================================================");
    }
    
    public void laporanPetugas(Petugas petugas){
        int x = petugas.getJmlPetugas();
        
        System.out.println("");
        System.out.println(" ===================={ Tabel Petugas }========================");
        System.out.println("");
        System.out.println("Id Petugas  \tNama \t\tAlamat \t\tTelpon \t\tJabatan");
        System.out.println("");
        for (int i = 0; i < x; i++) {
            System.out.println("   "+petugas.getNoPetugas(i)+"\t\t"+petugas.getNama(i)+"\t\t"+ petugas.getAlamat(i)+"\t"+ petugas.getTelepon(i)+"\t"+petugas.getJabatan(i));
        }
        System.out.println("");
        System.out.println("================================================================");
    }
    
    public void laporanTransaksi(Transaksi transaksi, Jenis jenis) {
        int x = transaksi.getJmlTransaksi();
        
        System.out.println("");
        System.out.println(" ====================={ Laporan Transaksi }=======================");
        System.out.println();
        System.out.println("Nama Paket \tTotal Pakaian \t   Harga/Pakaian   \tTotal");
        System.out.println("");
        
        int total = 0;
        for (int i = 0; i < x; i++){
            int jumlah=transaksi.getBanyaknya(i)*jenis.getHarga(transaksi.getIdJenis(i)); total+=jumlah;
            
            System.out.println(jenis.getNamaJenis(transaksi.getIdJenis(i))+"\t     "+ transaksi.getBanyaknya(i)+"\t\t\t"+jenis.getHarga(transaksi.getIdJenis(i))+"\t\t" + jumlah); 
        }
        System.out.println("");
        System.out.println("Total tagihan = " +total);
        System.out.println("");
    
    }
}
