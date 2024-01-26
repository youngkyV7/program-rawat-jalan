package models;

import entity.AdminEntity;
import entity.PasienEntity;
import entity.RawatJalanEntity;
import utils.DateUtils;

import java.util.ArrayList;

public class RawatJalanModels {
    private static ArrayList<AdminEntity> arrayAdmin = new ArrayList<>();
    private static ArrayList<RawatJalanEntity> arrayRawatJalan = new ArrayList<>();
    private static ArrayList<PasienEntity> arrayPasien = new ArrayList<>();

    public static ArrayList<AdminEntity> pubArrayAdmin () {
        return arrayAdmin;
    }

    public static ArrayList<RawatJalanEntity> pubArrayRJalan () {
        return arrayRawatJalan;
    }

    public static ArrayList<PasienEntity> pubArrayPasien () {
        return arrayPasien;
    }

    public static void dataAdmin () {
        arrayAdmin.add(new AdminEntity(1,"yongky","Yongky", "yongky08"));
    }

    public static void keluarKontrol(RawatJalanEntity rawat){
        rawat.setTanggalKeluar(DateUtils.now());
        rawat.getPoli().setStatus(true);
    }

    public static RawatJalanEntity kunjunganPasienRJalan(String nama, String poli) {
        for (RawatJalanEntity objRawatJalan : arrayRawatJalan) {
            if (objRawatJalan.getPasien().getNama().equals(nama) && objRawatJalan.getPoli().equals(poli)) {
                return objRawatJalan;
            }
        }
        return null;
    }

    public static void dataPasien(int nik, String nama, int umur, String alamat){
        PasienEntity objPasien = new PasienEntity(nik, nama, umur, alamat);
        arrayPasien.add(objPasien);
//        RawatJalanEntity objRawatJalan = new RawatJalanEntity(objPasien, );
    }

    public static boolean loginAdmin (String username, String password) {
        for (AdminEntity objAdmin : arrayAdmin) {
            if (objAdmin.getUsername().equals(username) && objAdmin.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
