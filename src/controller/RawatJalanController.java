package controller;

import entity.AdminEntity;
import entity.PasienEntity;
import entity.RawatJalanEntity;
import models.RawatJalanModels;
import view.MenuView;

import java.util.ArrayList;

public class RawatJalanController {
    public ArrayList<AdminEntity> pubArrayAdmin(){
        return RawatJalanModels.pubArrayAdmin();
    }

    public ArrayList<RawatJalanEntity> pubArrayRJalan(){
        return RawatJalanModels.pubArrayRJalan();
    }

    public ArrayList<PasienEntity> pubArrayPasien(){
        return RawatJalanModels.pubArrayPasien();
    }

    public void keluarKontrol(RawatJalanEntity rawat){
        RawatJalanModels.keluarKontrol(rawat);
    }
    public RawatJalanEntity kunjunganPasienRJalan(String nama, String poli){
        return RawatJalanModels.kunjunganPasienRJalan(nama, poli);
    }
    public void daftarPasien(int nik, String nama, int umur, String alamat){
        RawatJalanModels.dataPasien(nik, nama, umur, alamat);
    }

    public boolean loginAdmin(String username , String password){
        return RawatJalanModels.loginAdmin(username, password);
    }

    public void menu(){
        MenuView objMenu = new MenuView();
        objMenu.menu();
    }
}
