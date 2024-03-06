/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laundry;

import java.util.*;
/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {
        int pegawai;
        Scanner input = new Scanner (System.in);
        
        Laporan report = new Laporan();
        Petugas employee = new Petugas();
        Jenis jenis = new Jenis();
        Transaksi transaction = new Transaksi();
        Client client = new Client();
        
        report.laporanPaket(jenis);
        report.laporanClient(client);
        
        report.laporanPetugas(employee);
        transaction.TransaksiPetugas(employee);
        
        
        transaction.getTransaksi(client, transaction, jenis);
        System.out.println("");
        
        report.laporanTransaksi(transaction, jenis);
       
    }
}
