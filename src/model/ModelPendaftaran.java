package model;

public class ModelPendaftaran {
    String Mhs;
    String tglLahir;
    String waliMhs;
    ModelWaliMhs mWali;
//    String jurusan;
    String username;
    public ModelPendaftaran(String Mhs, String tglLahir, ModelWaliMhs waliMhs, String username) {
        this.Mhs = Mhs;
        this.tglLahir = tglLahir;
        this.mWali = waliMhs;
        this.username = username;
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
    public String getUsername(){
        return username.toString();
    }

//    public String getJurusan() {
//        return jurusan;
//    }
    
    public void ViewDaftar(){
    
    }

    public void setDosenWali(ModelDoswal doswal) {
    }

    public ModelWaliMhs getmWali() {
        return mWali;
    }
    
}

