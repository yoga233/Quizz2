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
    public boolean isDoswalEmpty() {
        return this.Doswal.isEmpty();
    }


    public void UpadateDoswal(String nama , String newnama){
        for (int i = 0 ; i < Doswal.size(); i++){
            if (nama.equals(Doswal.get(i).getNama())){
                Doswal.get(i).setNama(newnama);
            }
        }

    }
    public void DeleteDoswal(String nama){
        for (int i = 0 ; i < Doswal.size(); i++){
            if (nama.equals(Doswal.get(i).getNama())){
                Doswal.remove(i);
            }
        }
    }

    public ModelDoswal getDoswal(String nama) {
        for (ModelDoswal doswal : Doswal) {
            if (nama.equals(doswal.getNama())) {
                return doswal;
            }
        }
        return null;
    }
    public ModelDoswal searchDoswa(String namadoswal){
        ModelDoswal doswal = null;
        for (int i = 0 ; i < Doswal.size();i++){
            if (namadoswal.equals(Doswal.get(i).getNama())){
                doswal = Doswal.get(i);
            }
        }
        return doswal;
    }
}




