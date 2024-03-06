/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laundry;

/**
 *
 * @author Asus
 */
public interface User {
    
    void setNama(String nama);
    void setAlamat(String alamat);
    void setTelepon(String telepon);
 
    public String getNama(int id);
    public String getAlamat(int id);
    public String getTelepon(int id);
}
