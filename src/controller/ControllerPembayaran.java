package controller;
import model.ModelPembayaran;
import java.util.ArrayList;
import java.util.Date;


public class ControllerPembayaran {
        ArrayList<ModelPembayaran> bayar;
    public ControllerPembayaran(){
        this.bayar = new ArrayList<>();
    }
    public void InsertPembayaran(String harga,String nama_kasir){
        int index= bayar.size();
        this.bayar.add(new ModelPembayaran(harga,new Date(),nama_kasir));
    }
    public void ViewStrukall (){
        for (int i = 0 ; i < bayar.size();i++){
            this.bayar.get(i).ViewStruk();
            System.out.println("_______________________");
        }
    }
}
