package controller;
import model.ModelPendaftaran;
import java.util.ArrayList;
import model.ModelWaliMhs;

public class ControllerPendaftaran {
    ArrayList<ModelPendaftaran> daftarMahasiswa;
    
    public ControllerPendaftaran(){
        this.daftarMahasiswa = new ArrayList<>();
    }
    
    public void daftarMahasiswa (String Mhs, String tglLahir,String username, String wKtp, String wNama, String wAlamat, String wTelp) {
        ModelWaliMhs mWali = new ModelWaliMhs(wKtp, wNama, wAlamat, wTelp);
        ModelPendaftaran mahasiswa = new ModelPendaftaran(Mhs, tglLahir, mWali,username);
        daftarMahasiswa.add(mahasiswa);
    }

    public ArrayList<ModelPendaftaran> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }
    public Boolean ifEmpty (){
        return this.daftarMahasiswa.isEmpty();
    }
    public ModelPendaftaran getmahasiswa(String nama){
        return getmahasiswa(nama);
    }
}
