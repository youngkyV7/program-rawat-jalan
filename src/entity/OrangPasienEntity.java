package entity;

public class OrangPasienEntity {
    private int nik;
    private String nama;

    public OrangPasienEntity(int nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public int getNik() {
        return this.nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
