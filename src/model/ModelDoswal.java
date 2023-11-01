package model;

public class ModelDoswal{
    String nip;
    String nama;
    String jurusan;
    String contact;

    public ModelDoswal(  String nama ,String nip, String jurusan , String contact){
        this.nama = nama;
        this.nip = nip;
        this.jurusan = jurusan;
        this.contact = contact;
    }
    public void ViewDataDoswal (){
        System.out.println("No NIP : " + this.nip);
        System.out.println("Nawa Dosen Wali : " + this.nama);
        System.out.println("Jurusan : "+ this.jurusan);
        System.out.println("contact : " + this.contact);
    }
}
