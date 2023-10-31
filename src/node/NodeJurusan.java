package node;

public class NodeJurusan{
    int kodeJurusan;
    String namaJurusan;
    String namaFakultas;
    
    public NodeJurusan(int kodeJurusan, String namaJurusan, String namaFakultas){
        this.kodeJurusan = kodeJurusan;
        this.namaJurusan = namaJurusan;
        this.namaFakultas = namaFakultas;
        //test
    }
    public void viewJurusan(){
        System.out.println("Kode Jurusan : " + this.kodeJurusan);
        System.out.println("Nama Jurusan : "+ this.namaJurusan); 
        System.out.println("Nama Fakultas : " + this.namaFakultas);
    }
    public String getNama(){
        return namaJurusan;
    }
    public void setNamaFakultas(String namaFakultas){
        this.namaFakultas = namaFakultas;
    }
}