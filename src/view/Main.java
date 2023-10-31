package view;

//import model.ModelJurusan;
//import model.ModelMahasiswa;
//import model.ModelPembayaran;
//import model.ModelOrtuMhs;
import model.ModelAkun;
import controller.ControllerAkun;

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
                            System.out.println("1. pendaftran Mahasiswa");
                            System.out.println("2. view data mahasiswa");
                            System.out.println("3. Kembali ke menu");
                            choice = input.nextInt();
                            if (choice == 1){
                                System.out.print("Masukkan Jurusan Anda : ");
                                String namaJurusan = input.next();
                                System.out.println("Masukan Nama Fakultas Dari jurusan Anda : ");
                                String namafakultas = input.next();
                                System.out.print("Masukkan Nama Anda: ");
                                String namaMahasiswa = input.next();
                                System.out.print("Masukkan NPM Anda: ");
                                String npmMahasiswa = input.next();
                                System.out.print("Masukkan No. Telepon Anda: ");
                                String telpMahasiswa = input.next();
                                System.out.print("Masukkan Harga Pembayaran: ");
                                String hargaPembayaran = input.next();
                                System.out.print("Masukkan Nama Kasir: ");
                                String namaKasir = input.next();
                                System.out.print("Masukkan No. KTP Orang Tua: ");
                                String noKTP = input.next();
                                System.out.print("Masukkan Nama Orang Tua: ");
                                String namaOrangTua = input.next();
                                System.out.print("Masukkan Alamat Orang Tua: ");
                                String alamatOrangTua = input.next();
                                System.out.print("Masukkan No. Telepon Orang Tua: ");
                                String noTelpOrangTua = input.next();
                                wali.InsertWali(noKTP, namaOrangTua, alamatOrangTua, noTelpOrangTua);
                                bayar.InsertPembayaran(hargaPembayaran, namaKasir);
                                siswa.InsertMahasiswa(namaMahasiswa,npmMahasiswa,telpMahasiswa);
                                jurus.InsertJurusan(namaJurusan,namafakultas);
                            }else if (choice == 2){
                                jurus.ViewallJurusan();
                                siswa.ViewallMahasiswa();
                                wali.ViewDataDiriOrtu();
                                bayar.ViewStrukall();
                            }else {

                            }

                            break;
                        } else {
                            System.out.println("pasword salah ");
                            continue;
                        }
                    }
                    break;
                case 3:
                    jurus.ViewallJurusan();
                    siswa.ViewallMahasiswa();
                    wali.ViewDataDiriOrtu();
                    bayar.ViewStrukall();
                    System.out.println("Terima kasih! Keluar dari program.");
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan pilih opsi yang benar.");
            }
        }
        input.close();
    }
}