package view;

import controller.RawatJalanController;
import entity.RawatJalanEntity;

import java.util.Scanner;

public class RawatJalanView {
    Scanner input =new Scanner(System.in);
    RawatJalanController objRawatJalan = new RawatJalanController();

    public void rawatJalan() {
        try {
            System.out.print("Masukkan Nik Pasien        = ");
            int nik = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan Nama Pasien      = ");
            String nama = input.nextLine();
            System.out.print("Masukkan Umur Pasien      = ");
            int umur = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan Alamat Pasien    = ");
            String alamat = input.nextLine();
            objRawatJalan.daftarPasien(nik, nama, umur, alamat);
        } catch (Exception e) {
            input.nextLine();
        }
    }

    public void rawatJalanKontrol(){
        System.out.print("Masukkan Nama Pasien = ");
        String nama = input.nextLine();
        System.out.print("Masukkan Poli = ");
        String poli = input.nextLine();
        RawatJalanEntity rawat = objRawatJalan.kunjunganPasienRJalan(nama, poli);
        if(rawat != null){
            if(rawat.getTanggalKeluar() == null ){
                objRawatJalan.keluarKontrol(rawat);
            } else {
                System.out.println("Pasien Telah Kontrol");
            }
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
    }

    public void cetakData() {
        if (objRawatJalan.pubArrayRJalan() != null) {
            for (RawatJalanEntity objRawat : objRawatJalan.pubArrayRJalan()) {
                System.out.println();
                System.out.println("NIK Pasien           = " + objRawat.getPasien().getNik());
                System.out.println("Nama Pasien         = " + objRawat.getPasien().getNama());
                System.out.println("Umur Pasien         = " + objRawat.getPasien().getUmur());
                System.out.println("Alamat Pasien       = " + objRawat.getPasien().getAlamat());
                System.out.println();
            }
        } else {
            System.out.println("Data Masih Kosong");
        }
    }
}
