package view;

import controller.RawatJalanController;

import java.util.Scanner;

public class MenuView {
    Scanner input = new Scanner(System.in);
    RawatJalanController objRawat = new RawatJalanController();
    RawatJalanView rawatView = new RawatJalanView();

    public void menu() {
        String pilih;
        do {
            System.out.println("""
                    1. Login
                    2. Exit
                    """);
            System.out.print("Masukkan Pilihan Anda = ");
            pilih = input.nextLine();
            switch (pilih) {
                case "1" -> login();
                case "2" -> System.out.println();
                default -> System.out.println("Inputan Tidak Ada");
            }
        } while (!pilih.equals("2"));
    }

    private void menuAdmin() {
        String pilih;
        do {
            System.out.println("""
                    1. Rawat Jalan
                    2. Daftar Data Pasien
                    3. Daftar Rawat Jalan Poli
                    4. Rawat Jalan
                    5. Exit
                    """);
            System.out.print("Masukkan Pilihan Anda = ");
            pilih = input.nextLine();
            switch (pilih) {
                case "1" -> rawatView.rawatJalan();
                case "2" -> rawatView.cetakData();
                case "3" -> rawatView.rawatJalanKontrol();
                //case "4" -> rawatView.rawatJalan();
                case "4" -> System.out.println();
                default -> System.out.println("Inputan Tidak Ada");
            }
        } while (!pilih.equals("5"));
    }

    private void login() {
        try {
            boolean status = false;
            System.out.print("Masukkan Nama Pegawai = ");
            String username = input.nextLine();
            System.out.print("Masukkan Password         = ");
            String password = input.nextLine();
            status = objRawat.loginAdmin(username, password);
            if (status) {
                System.out.println("Berhasil Login");
                menuAdmin();
            } else {
                System.out.println("Kartu Pegawai Atau Password Salah");
            }
        } catch (Exception e) {
            input.nextLine();
        }
    }
}
