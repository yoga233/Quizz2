package model;

public class ModelJurusan{
    int kodeJurusan;
    String namaJurusan;
    String namaFakultas;
    
    public ModelJurusan(int kodeJurusan, String namaJurusan, String namaFakultas){
        this.kodeJurusan = kodeJurusan;
        this.namaJurusan = namaJurusan;
        this.namaFakultas = namaFakultas;
        
    }
    public void viewJurusan(){
        System.out.println("Kode Jurusan : " + this.kodeJurusan);
        System.out.println("Nama Jurusan : "+ this.namaJurusan); 
        System.out.println("Nama Fakultas : " + this.namaFakultas);
    }
    public String getNamaJurusan(){
        return namaJurusan;
    }

    public String getNamaFakultas() {
        return namaFakultas;
    }

    public void setNamaFakultas(String namaFakultas){
        this.namaFakultas = namaFakultas;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }
}