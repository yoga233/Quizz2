package view;

import controller.*;
import model.*;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    public void pendaftaranmhs (){
    }
    public static void main(String[] args) {
        ControllerAkun akun = new ControllerAkun();
        ControllerPendaftaran daftarmahasiswa = new ControllerPendaftaran();
        ControllerAdmin admin = new ControllerAdmin(); // Inisialisasi objek ControllerAdmin
        ControllerDoswal wali = new ControllerDoswal();
        ControllerPembayaran bayar = new ControllerPembayaran();
  

        Scanner input = new Scanner(System.in);

       int pilihan = 0;

        while (pilihan != 3){
            System.out.println("=== Menu ===");
            System.out.println("1. Buat akun");
            System.out.println("2. Login");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = input.nextInt();

            switch (pilihan){
                case 1:
                    System.out.println("Masukan Username Anda : ");
                    String username = input.next();
                    System.out.println("Masukan Password Anda : ");
                    String password = input.next();
                   akun.Insertpassword(username,password);
                   break;

                case 2:
                    int choice = 0;
                    while (true) {
                        System.out.println("Masukan Username anda ");
                        String user = input.next();
                        System.out.println("Masukan Passworld anda ");
                        String pass = input.next();
                        menu:
                        if (akun.cekLogin(user, pass)) {
                            System.out.println("Berhasil");
                            
                            while (choice != 3) {
                                System.out.println("=== Menu ===");
                                System.out.println("1. Daftar");
                                System.out.println("2. Data Mahasiswa");
                                System.out.println("3. Kembali ke menu sebelumnya");
                                System.out.print("Pilih opsi: ");
                                choice = input.nextInt();

                                switch (choice) {
                                    case 1:
                                        // Kode untuk mendaftar mahasiswa
                                        System.out.println("Masukkan Nama Mahasiswa: ");
                                        String nama = input.next();
                                        System.out.println("Masukkan Tanggal Lahir: ");
                                        String tanggalLahir = input.next();
                                        System.out.println("Masukkan Nama Wali Mahasiswa: ");
                                        String waliMhs = input.next();
                                        System.out.println("Masukkan Jurusan: ");
                                        String jurusan = input.next();
                                        
                                        ModelPendaftaran mahasiswaBaru = new ModelPendaftaran(nama, tanggalLahir, waliMhs, jurusan);
                                        daftarmahasiswa.daftarMahasiswa(nama,tanggalLahir,waliMhs,jurusan);
                                        System.out.println("Pendaftaran mahasiswa berhasil.");
                                        break;

                                    case 2:
                                        // Kode untuk menampilkan data mahasiswa
                                        System.out.println("Data Mahasiswa yang Telah Mendaftar:");
                                        for (ModelPendaftaran mahasiswa : daftarmahasiswa.getDaftarMahasiswa()) {
                                            System.out.println("Nama: " + mahasiswa.getMhs());
                                            System.out.println("Tanggal Lahir: " + mahasiswa.getTglLahir());
                                            System.out.println("Wali Mahasiswa: " + mahasiswa.getWaliMhs());
                                            System.out.println("Jurusan: " + mahasiswa.getJurusan());
//                                            System.out.println(" Dosen wali : " + mahasiswa.);
                                            System.out.println();
                                        }
                                            if (!wali.isDoswalEmpty()) {
                                                System.out.println("Data Dosen Wali:");
                                                wali.ViewallMhs();
                                            } else {
                                                System.out.println("Dosen Wali belum ada.");
                                            }
                                            if (!bayar.isbayarEmpty()) {
                                                System.out.println("Data Dosen Wali:");
                                                bayar.ViewStrukall();
                                            } else {
                                                System.out.println("Dosen Wali belum ada.");
                                            }
                                            break;
                                            
                                      
                                    case 3:
                                        break;

                                    default:
                                        System.out.println("Opsi tidak valid. Silakan pilih opsi yang benar.");
                                }
                            }
                            break;
                        
                        }else if (admin.cekLogin(user, pass)) {
                            int Pilwali = 0;
                            while (Pilwali !=4 ) {
                                System.out.println("berhasil");
                                System.out.println("==================");
                                System.out.println("1. Dosen Wali ");
                                System.out.println("2. bayat her ");
                                System.out.println("3. Menu Edit Mahasiswa ");
                                System.out.println("3. kembali ");
                                System.out.println("Masukan Pilihan Anda");
                                Pilwali = input.nextInt();
                                switch (Pilwali) {
                                    case 1:
                                        System.out.println("Masukan Nama Dosen : ");
                                        String namadoswal = input.next();
                                        System.out.println("Masukan NIP Dosen  : ");
                                        String NIPdoswal = input.next();
                                        System.out.println("Jurusan Dosen : ");
                                        String JurusanDoswal = input.next();
                                        System.out.println("Masukan Contact Dosen : ");
                                        String Contdoswal = input.next();
                                        wali.InsertDoswal(namadoswal, NIPdoswal, JurusanDoswal, Contdoswal);
                                        System.out.println("daftar wali berhasil");
                                        continue;
                                    case 2:
                                        System.out.println("Menu pembayaran her");
                                        System.out.println("Masukan Pemnbayaran Her : ");
                                        String her = input.next();
                                        System.out.println("Masuka Kasir : ");
                                        String kasir = input.next();
                                        bayar.InsertPembayaran(her,kasir);
                                        continue;
                                    case  3:
                                        int pilihanadmin = 0;
                                        while (pilihanadmin != 3) {
                                            System.out.println("==================");
                                            System.out.println("1. Ganti Jurusan ");
                                            System.out.println("2. Ganti Dosen ");
                                            System.out.println("Masukan pilihan ");
                                            pilihanadmin = input.nextInt();
                                            switch (pilihanadmin){
                                                
                                                case 1 :
                                                    if (daftarmahasiswa.ifEmpty()){
                                                        System.out.println("Mahasiswa Tidak Ada");
                                                    }else {
                                                        System.out.println(" Masukan Nama Dosen wali :");
                                                        String gantiDoswal =input.next();
                                                        wali.getDoswal(namadoswal,gantiDoswal);
                                                        wali.UpadateDoswal(,gantiDoswal);
                                                    }
                                                case 2:
                                                    wali.DeleteDoswal(namadoswal);
                                            }
                                            break;
                                        }
                                            case 4 :
                                                break ;
                                    default:
                                        System.out.println("yang bener ");
                                        break;

                                }
                                break;
                            }
                            break ;
                        }
                        else {
                            System.out.println("pasword salah ");
                            
                        }
                            continue;
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih! Keluar dari program.");
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan pilih opsi yang benar.");
            }
        }
        input.close();
    }
}