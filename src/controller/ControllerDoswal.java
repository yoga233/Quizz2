package controller;

import model.ModelDoswal;
import model.ModelPendaftaran;

import java.util.ArrayList;

public class ControllerDoswal {
    ArrayList<ModelDoswal> Doswal;
    ModelDoswal dosWal = new ModelDoswal();
    ControllerPendaftaran daftarmahasiswa = new ControllerPendaftaran();
    public ControllerDoswal() {
        this.Doswal = new ArrayList<>();
    }

    public void InsertDoswal(String nama, String nip, String jurusan, String contact) {
        int index = Doswal.size();
        this.Doswal.add(new ModelDoswal(nama, nip, jurusan, contact));
    }

    public void ViewallMhs() {
        for (int i = 0; i < Doswal.size(); i++) {
            this.Doswal.get(i).ViewDataDoswal();
        }
    }

    public boolean isDoswalEmpty() {
        return this.Doswal.isEmpty();
    }

    public void UpadateDoswal(String nama, String newnama) {
        for (int i = 0; i < Doswal.size(); i++) {
            if (nama.equals(Doswal.get(i).getNama())) {
                Doswal.get(i).setNama(newnama);
            }
        }
    }

    public void DeleteDoswal(String nama) {
        for (int i = 0; i < Doswal.size(); i++) {
            if (nama.equals(Doswal.get(i).getNama())) {
                Doswal.remove(i);
            }
        }
    }

    public ModelDoswal getDoswal(String nama) {
        for (ModelDoswal doswal : Doswal) {
            if (nama.equals(doswal.getNama())) {
                return doswal;
            }
        }
        return null;
    }

    public ModelDoswal searchDoswa(String namadoswal) {
        ModelDoswal doswal = null;
        for (int i = 0; i < Doswal.size(); i++) {
            if (namadoswal.equals(Doswal.get(i).getNama())) {
                doswal = Doswal.get(i);
            }
        }
        return doswal;
    }

    public ModelDoswal getDosWal() {
        return dosWal;
    }

    public ArrayList<ModelDoswal> getDoswall() {
        return Doswal;
    }
    public void AssignDosenWali(String namadoswal, String namamahasiswa) {
        ModelDoswal doswal = searchDoswa(namadoswal);
        if (doswal != null) {
            ModelPendaftaran mahasiswa = daftarmahasiswa.getmahasiswa(namamahasiswa);
            if (mahasiswa != null) {
                mahasiswa.setDosenWali(doswal);
                doswal.getViewDataDoswal();
                System.out.println(namamahasiswa + " ditetapkan sebagai mahasiswa " + doswal.getNama());
            } else {
                System.out.println("Mahasiswa dengan nama " + namamahasiswa + " tidak ditemukan.");
            }
        } else {
            System.out.println("Dosen Wali dengan nama " + namadoswal + " tidak ditemukan.");
        }
    }

}
