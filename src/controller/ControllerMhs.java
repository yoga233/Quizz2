package controller;

import model.ModelDoswal;
import model.ModelMhs;

import java.util.ArrayList;

public class ControllerMhs {
    ArrayList<ModelMhs> siswa;
    ArrayList<ModelDoswal> dosenWali; // Hubungan agregasi dengan ModelDoswal

    public ControllerMhs() {
        this.siswa = new ArrayList<>();
        this.dosenWali = new ArrayList<>();
    }

    public void InsertMhs(String nama, String npm, String telp, ModelDoswal dosenWali) {
        int index = siswa.size();
        this.siswa.add(new ModelMhs(nama, npm, telp));
        this.dosenWali.add(dosenWali);
    }

    public void ViewallMhs() {
        for (int i = 0; i < siswa.size(); i++) {
            this.siswa.get(i).ViewDataMhs();
            // Tampilkan Dosen Wali dari ArrayList dosenWali
            if (i < dosenWali.size()) {
                System.out.println("Dosen Wali: " + dosenWali.get(i).getNama());
            }
            System.out.println();
        }
    }
}
