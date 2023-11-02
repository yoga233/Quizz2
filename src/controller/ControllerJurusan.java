package controller;
import model.ModelJurusan;
import java.util.*;

public class ControllerJurusan {
    ArrayList<ModelJurusan> departmens;
    
    public ControllerJurusan(){
        this.departmens = new ArrayList<>();
    }
    public void insertJurusan(String nama, String fakultas){
        int index = departmens.size();
        this.departmens.add(new ModelJurusan(index+1,nama,fakultas));
    }
    public void viewAllJurusan(){
        for(int i = 0; i<departmens.size(); i++){
            this.departmens.get(i).viewJurusan();
            System.out.println("---------------");
           
        }
    }
    public void updateJurusan(String namaJurusan, String newjurusan){
        for (int i = 0; i<departmens.size(); i++){
            if(namaJurusan.equals(departmens.get(i).getNamaJurusan())){
                departmens.get(i).setNamaJurusan(newjurusan);
            }       
        }
    }
    public void deleteJurusan(String namaJurusan){
        for(int i = 0; i<departmens.size(); i++){
            if(namaJurusan.equals(departmens.get(i).getNamaJurusan())){
                departmens.remove(i);
            }
        }
    }
    public ModelJurusan searchJurusan(String namaJurusan){
        ModelJurusan jurusan = null;
        for (int i = 0 ; i < departmens.size();i++){
            if (namaJurusan.equals(departmens.get(i).getNamaJurusan())){
                jurusan = departmens.get(i);
            }
        }
        return jurusan;
    }

    public ArrayList<ModelJurusan> getDepartmens() {
        return departmens;
    }
}
