/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmanajemendatakost;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MahasiswaKost {

    static ArrayList<String> daftarMahasiswa = new ArrayList<>();

    public static void menuMahasiswa() {

        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
           System.out.println("1. Tambah Mahasiswa");
           System.out.println("2. Lihat Mahasiswa");
           System.out.println("3. Ubah Mahasiswa");
           System.out.println("4. Hapus Mahasiswa");
           System.out.println("5. Kembali");

           while (!input.hasNextInt()) {
    System.out.println("Input harus berupa angka!");
    input.next();
}

pilihan = input.nextInt();
input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = input.nextLine();
                    daftarMahasiswa.add(nama);
                    System.out.println("Data berhasil ditambahkan");
                    break;

                case 2:
                    System.out.println("--- Daftar Mahasiswa ---");
                    for (String mhs : daftarMahasiswa) {
                        System.out.println("- " + mhs);
                    }
                    break;

              case 3:
          System.out.print("Masukkan nomor data yang ingin diubah: ");
    int indexUbah = input.nextInt();
    input.nextLine();

    if (indexUbah >= 0 && indexUbah < daftarMahasiswa.size()) {
        System.out.print("Masukkan nama baru: ");
        String namaBaru = input.nextLine();

        daftarMahasiswa.set(indexUbah, namaBaru);

        System.out.println("Data berhasil diubah");
    } else {
        System.out.println("Data tidak ditemukan");
    }
    break;

               case 4:
             System.out.print("Masukkan nomor data yang ingin dihapus: ");
    int hapus = input.nextInt();

    if (hapus > 0 && hapus <= daftarMahasiswa.size()) {
        daftarMahasiswa.remove(hapus - 1);
        System.out.println("Data berhasil dihapus");
    } else {
        System.out.println("Data tidak ditemukan");
    }
    break;
                case 5:
                      System.out.println("Kembali");
                 break;

                default:
                    System.out.println("Pilihan salah");
            }

        } while (pilihan != 5);
    }
}