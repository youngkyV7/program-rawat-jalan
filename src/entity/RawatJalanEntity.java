package entity;

import utils.DateUtils;

import java.util.Date;

public class RawatJalanEntity {
    private PasienEntity pasien;
    private PoliEntity poli;
    private String tanggalDaftar;
    private String tanggalKeluar;

    public RawatJalanEntity (PasienEntity pasien, PoliEntity poli) {
        this.pasien = pasien;
        this.poli = poli;
        this.tanggalDaftar = DateUtils.now();
    }

    public PasienEntity getPasien () {
        return this.pasien;
    }

    public void setPasien(PasienEntity pasien) {
        this.pasien = pasien;
    }

    public PoliEntity getPoli () {
        return this.poli;
    }

    public void setPoli(PoliEntity poli) {
        this.poli = poli;
    }
//    public void setPoli (String poli) {
//        this.pasien = pasien;
//    }

    public String getTanggalDaftar () {
        return this.tanggalDaftar;
    }

    public void setTanggalDaftar (String tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }

    public String getTanggalKeluar() {
        return this.tanggalKeluar;
    }

    public void setTanggalKeluar(String tanggalKeluar) {
        this.tanggalKeluar = tanggalKeluar;
    }
}
