package model;
import node.NodeJurusan;
import java.util.*;

public class ModelJurusan {
    ArrayList<NodeJurusan> departmens;
    
    public ModelJurusan(){
        this.departmens = new ArrayList<>();
    }
    public void insertJurusan(String nama, String fakultas){
        int index = departmens.size();
        this.departmens.add(new NodeJurusan(index+1,nama,fakultas));
    }
    public void viewAllJurusan(){
        for(int i = 0; i<departmens.size(); i++){
            this.departmens.get(i).viewJurusan();
            System.out.println("---------------");
            System.out.println("yoga cupu");
        }
    }
    public void updateJurusan(String namaJurusan, String newFakultas){
        for (int i = 0; i<departmens.size(); i++){
            if(namaJurusan.equals(departmens.get(i).getNama())){
                departmens.get(i).setNamaFakultas(newFakultas);
            }       
        }
    }
    public void deleteJurusan(String namaJurusan){
        for(int i = 0; i<departmens.size(); i++){
            if(namaJurusan.equals(departmens.get(i).getNama())){
                departmens.remove(i);
            }
        }
    }
}
