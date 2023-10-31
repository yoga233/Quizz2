/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Aaus
 */
public class ModelPembayaran {
        ArrayList<NodePembayaran> bayar;
    public ModelPembayaran(){
        this.bayar = new ArrayList<>();
    }
    public void InsertPembayaran(String harga,String nama_kasir){
        int index= bayar.size();
        this.bayar.add(new NodePembayaran(harga,new Date(),nama_kasir));
    }
    public void ViewStrukall (){
        for (int i = 0 ; i < bayar.size();i++){
            this.bayar.get(i).ViewStruk();
            System.out.println("_______________________");
        }
    }
}
