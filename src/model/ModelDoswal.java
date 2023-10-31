package model;

public class ModelDoswal{
    int nip;
    String nama;
    String jurusan;
    String contact;

    public ModelDoswal(int nip , String nama , String jurusan , String contact){
        this.nip = nip;
        this.nama = nama;
        this.jurusan = jurusan;
        this.contact = contact;
    }
    public void ViewDataDoawal (){
        System.out.println("No NIP : " + this.nip);
        System.out.println("Nawa Dosen Wali : " + this.nama);
        System.out.println("Jurusan : "+ this.jurusan);
        System.out.println("contact : " + this.contact);
    }
}
