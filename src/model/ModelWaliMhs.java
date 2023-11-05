package model;

public class ModelWaliMhs{
    String noktp;
    String nama;
    String alamat;
    String notelp;

    public ModelWaliMhs(String noktp , String nama , String alamat , String notelp){
        this.noktp = noktp;
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
    }
    public void ViewDataWaliMhs (){
        System.out.println("No KTP : " + this.noktp);
        System.out.println("Nawa Wali : " + this.nama);
        System.out.println("Alamat : "+ this.alamat);
        System.out.println("No Telp Wali : " + this.notelp);
    }

    public String getNama() {
        return nama;
    }

    public String getNoktp() {
        return noktp;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNotelp() {
        return notelp;
    }
}
