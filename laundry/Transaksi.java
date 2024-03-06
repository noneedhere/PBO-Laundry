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
public class Transaksi {
    
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> idJenis = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    
     public void getTransaksi(Client client, Transaksi transaksi, Jenis jenis){
        Scanner input = new Scanner(System.in); 
        
        System.out.println("");
        System.out.println("========== Laundry GG ==========");
        System.out.println("");
        
        System.out.print("Masukkan ID Client :");
        int idClient = input.nextInt(); 
         System.out.println("");
        
        System.out.println("===== Selamat datang "+client.getNama(idClient)+" =====");
        System.out.println("");
         
        ArrayList<Integer> idJenis = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        
        boolean i = true;
        int pilihan = 0;
        int kdJenis = 0;
     do{ 
        System.out.print("Masukkan kode jenis paket :");
        kdJenis = input.nextInt();
        idJenis.add(kdJenis);
        System.out.print("pakaian sebanyak : ");
        banyak.add(input.nextInt());
        
         System.out.println("Sudah atau belum ? ");
         System.out.println("0 : belum || 1 : sudah");
         System.out.println("Masukan pilihan anda :");
         pilihan = input.nextInt();
         System.out.println("Pilihan = "+ pilihan);
         
         if(pilihan != 0){
             i = false;
             break;
         }else if(pilihan > 1){
             System.err.println("Error");
             break;
         }
         
        }while (i);

        int total = 0;
        int x = idJenis.size();
        
        for (int j = 0; j < x; j++){
            int jumlah=banyak.get(j) * jenis.getHarga(idJenis.get(j));
            total += jumlah;
            System.out.println(jenis.getNamaJenis(idJenis.get(j))+"\t"+
            idJenis.get(j)+"\t"+ jenis.getNamaJenis(idJenis.get(j))+"\t"+jumlah);transaksi.setTransaksi(jenis, idClient, idJenis.get(j), banyak.get(j));
        }
        System.out.println("Total Belanja : " +total);
        client.editSaldo(idClient, client.getSaldo(idClient)-total);
        }
     public void TransaksiPetugas(Petugas petugas){
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan ID Petugas :");
         int idPetugas = input.nextInt(); 
         System.out.println("");
         System.out.println("Pegawai : "+petugas.getNama(idPetugas)+"\nAlamat : "+petugas.getAlamat(idPetugas)+"\nTeepon : "+petugas.getTelepon(idPetugas)+"\nJabatan : "+petugas.getJabatan(idPetugas));
         System.out.println("");
     }
        public void setTransaksi(Jenis jenis, int idClient, int idJenis, int banyaknya){
            this.idClient.add(idClient);
            this.idJenis.add(idJenis);
            this.banyak.add(banyaknya);
        }
        public int getIdJenis(int id){
            return this.idJenis.get(id);
        }   
        public int getBanyaknya(int id){
            return this.banyak.get(id);
        } 
        public int getIdClient(int id){
            return this.idClient.get(id);
        } 
        public int getJmlTransaksi(){
            return this.idClient.size();
        }
}
