/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;
/**
 *
 * @author Aaus
 */
public class ModelPembayaran {
    String harga;
    Date Tanggal;
    String nama_kasir;
    public ModelPembayaran(String harga, Date Tanggal , String nama_kasir){
       this.harga = harga;
       this.Tanggal = Tanggal;
       this.nama_kasir = nama_kasir;
    }
    public void ViewStruk(){
        System.out.println("Harga : " + this.harga);
        System.out.println("Tanggal Pembayaran : " + this.Tanggal);
        System.out.println("Nama Kasir : " + this.nama_kasir);
    }
}
