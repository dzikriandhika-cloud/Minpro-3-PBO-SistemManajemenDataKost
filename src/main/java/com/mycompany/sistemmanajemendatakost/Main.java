
 
 
package com.mycompany.sistemmanajemendatakost;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> daftarMahasiswa = new ArrayList<>();
        ArrayList<String> daftarKamar = new ArrayList<>();
        ArrayList<String> daftarPembayaran = new ArrayList<>();

        int pilihan;
        do {
    System.out.println("=== SISTEM MANAJEMEN DATA KOST ===");
    System.out.println("1. Data Mahasiswa");
    System.out.println("2. Data Kamar");
    System.out.println("3. Data Pembayaran");
    System.out.println("4. Keluar");
    System.out.print("Pilih menu: ");

    pilihan = input.nextInt();

    switch (pilihan) {
    case 1:
        MahasiswaKost.menuMahasiswa();
        break;

    case 2:
        Kamar.menuKamar();
        break;

    case 3:
        Pembayaran.menuPembayaran();
        break;

    case 4:
        System.out.println("Program selesai");
        break;

    default:
        System.out.println("Pilihan tidak ada");
}
    

} while (pilihan != 4);

}
}