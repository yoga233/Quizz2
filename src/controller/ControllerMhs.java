package controller;
import model.ModelMhs;

import java.util.ArrayList;

public class ControllerMhs{
    ArrayList<ModelMhs> siswa;
    ControllerDoswal wali =  new ControllerDoswal();
    public ControllerMhs(){
        this.siswa = new ArrayList<>();
    }
    public void InsertMhs(String nama , String npm,String  telp){
        int index = siswa.size();
        this.siswa.add(new ModelMhs(nama,npm,telp));
    }
    public void ViewallMhs(){
        for (int i = 0 ; i < siswa.size();i++){
            this.siswa.get(i).ViewDataMhs();

        }

    }

}
