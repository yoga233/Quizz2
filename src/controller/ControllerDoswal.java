package controller;
import model.ModelDoswal;

import java.util.ArrayList;

public class ControllerDoswal{
    ArrayList<ModelDoswal> Doswal;
    public ControllerDoswal(){
        this.Doswal = new ArrayList<>();
    }
    public void InsertDoswal( String nama ,String nip ,String jurusan , String contact){
        int index = Doswal.size();
        this.Doswal.add(new ModelDoswal(nama, nip, jurusan, contact));
    }
    public void ViewallMhs(){
        for (int i = 0 ; i < Doswal.size();i++){
            this.Doswal.get(i).ViewDataDoswal();

        }
    }

}