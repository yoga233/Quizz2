package controller;
import model.ModelWaliMhs;

import java.util.ArrayList;

public class ControllerWaliMhs {
    ArrayList<ModelWaliMhs> wali;

    public ControllerWaliMhs() {
        this.wali = new ArrayList<>();
    }

    public void InsertWaliMhs(String noktp, String nama, String alamat, String notelp) {
        int index = wali.size();
        this.wali.add(new ModelWaliMhs(noktp, nama, alamat, notelp));
    }

    public void ViewDataDiriOrtu() {
        for (int i = 0; i < wali.size(); i++) {
            this.wali.get(i).ViewDataWaliMhs();
        }
    }
}
