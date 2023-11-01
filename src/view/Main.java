package view;

//import model.ModelJurusan;
//import model.ModelMahasiswa;
//import model.ModelPembayaran;
//import model.ModelOrtuMhs;
import model.ModelAkun;
import model.ModelPendaftaran;

import controller.ControllerAkun;
import controller.ControllerPendaftaran;


import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    public void pendaftaranmhs (){
    }
    public static void main(String[] args) {
//        ModelJurusan jurus = new ModelJurusan();
//        ModelMahasiswa siswa = new ModelMahasiswa();
//        ModelPembayaran bayar = new ModelPembayaran();
//        ModelOrtuMhs wali = new ModelOrtuMhs();
        ControllerAkun akun = new ControllerAkun();
        ControllerPendaftaran daftarmahasiswa = new ControllerPendaftaran();

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
                                        daftarmahasiswa.getDaftarMahasiswa();
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
                                            System.out.println();
                                        }
                                        break;
                                    case 3:
                                        break;

                                    default:
                                        System.out.println("Opsi tidak valid. Silakan pilih opsi yang benar.");
                                }
                            }
                            break;
                        }else {
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