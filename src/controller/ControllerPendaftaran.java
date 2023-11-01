package controller;
import model.ModelPendaftaran;
import java.util.ArrayList;

public class ControllerPendaftaran {
    ArrayList<ModelPendaftaran> daftarMahasiswa;
    public ControllerPendaftaran(){
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void daftarMahasiswa (String Mhs, String tglLahir, String waliMhs, String jurusan) {
        ModelPendaftaran mahasiswa = new ModelPendaftaran(Mhs, tglLahir, waliMhs, jurusan);
        daftarMahasiswa.add(mahasiswa);
    }

    public ArrayList<ModelPendaftaran> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }
    public Boolean ifEmpty (){
        return this.daftarMahasiswa.isEmpty();
    }

}
