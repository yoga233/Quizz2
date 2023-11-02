package model;
public class ModelPendaftaran {
    String Mhs;
    String tglLahir;
    String waliMhs;
//    String jurusan;

    public ModelPendaftaran(String Mhs, String tglLahir, String waliMhs) {
        this.Mhs = Mhs;
        this.tglLahir = tglLahir;
        this.waliMhs = waliMhs;
//        this.jurusan = jurusan;
    }

    public String getMhs() {
        return Mhs;
    }
    
     public String getTglLahir() {
        return tglLahir;
    }

    public String getWaliMhs() {
        return waliMhs;
    }

//    public String getJurusan() {
//        return jurusan;
//    }
    
    public void ViewDaftar(){
    
    }
}

