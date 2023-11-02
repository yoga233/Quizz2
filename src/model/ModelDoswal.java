package model;

public class ModelDoswal extends Manusia {
    String nip;
    String jurusan;
    String contact;
    private ModelDoswal dosenWali;

    public ModelDoswal(String nama, String nip, String jurusan, String contact) {
        this.nama = nama;
        this.telp = telp;// Set telp ke null karena tidak diperlukan di sini
        this.nip = nip;
        this.jurusan = jurusan;
        this.contact = contact;
    }
    public ModelDoswal(){
        
    }

    public void ViewDataDoswal() {
        System.out.println("No NIP : " + this.nip);
        System.out.println("Nawa Dosen Wali : " + this.nama);
        System.out.println("Jurusan : " + this.jurusan);
        System.out.println("contact : " + this.contact);
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
    public void setDosenWali(ModelDoswal dosenWali){
        this.dosenWali = dosenWali;
    }

    public ModelDoswal getDosenWali() {
        return dosenWali;
    }

    public void getViewDataDoswal() {
    }
}
