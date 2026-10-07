/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmanajemendatakost;
import java.util.Scanner;
import java.util.ArrayList;

public class Pembayaran {
static ArrayList<Pembayaran> daftarPembayaran = new ArrayList<>();

    private String idPembayaran;
    private String idMahasiswa;
    private int jumlahBayar;
    private String tanggal;

    public Pembayaran(String idPembayaran, String idMahasiswa, int jumlahBayar, String tanggal) {
        this.idPembayaran = idPembayaran;
        this.idMahasiswa = idMahasiswa;
        this.jumlahBayar = jumlahBayar;
        this.tanggal = tanggal;
    }
    public static void menuPembayaran() {
    Scanner input = new Scanner(System.in);
    int pilihan;

    do {
        System.out.println("\n=== DATA PEMBAYARAN ===");
        System.out.println("1. Tambah Pembayaran");
        System.out.println("2. Lihat Pembayaran");
        System.out.println("3. Kembali");
        System.out.print("Pilih: ");

        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
              
                System.out.print("ID Pembayaran: ");
                String idPembayaran = input.next();

                System.out.print("ID Mahasiswa: ");
                String idMahasiswa = input.next();

                System.out.print("Jumlah Bayar: ");
                int jumlahBayar = input.nextInt();

                System.out.print("Tanggal: ");
                String tanggal = input.next();

                daftarPembayaran.add(new Pembayaran(idPembayaran, idMahasiswa, jumlahBayar, tanggal));

                System.out.println("Data pembayaran berhasil ditambahkan");
                break;
            case 2:

                System.out.println("--- Daftar Pembayaran ---");

                for (Pembayaran bayar : daftarPembayaran) {
                    System.out.println(
                        bayar.idPembayaran + " | " +
                        bayar.idMahasiswa + " | " +
                        bayar.jumlahBayar + " | " +
                        bayar.tanggal
                    );
                }

                break;

            case 3:
                System.out.println("Kembali");
                break;

            default:
                System.out.println("Pilihan salah");
        }

    } while (pilihan != 3);
}

}



