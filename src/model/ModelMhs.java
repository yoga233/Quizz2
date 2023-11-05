package model;

public class ModelMhs {
    String nama;
    String npm;
    String telp;
    
    public ModelMhs(String nama ,String npm , String telp, String wKtp, String wNama, String wAlamat, String wTelp){
        this.nama = nama;
        this.npm = npm;
        this.telp = telp;
        
        
    }
    public void ViewDataMhs(){
        System.out.println("Nama Mahasiswa : " + this.nama);
        System.out.println("NPM Mahasiswa : " + this.npm);
        System.out.println("NO Telfon Mahasiswa : " + this.telp);
    }

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public String getTelp() {
        return telp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
