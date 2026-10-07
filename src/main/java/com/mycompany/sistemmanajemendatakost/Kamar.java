/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmanajemendatakost;
import java.util.Scanner;
import java.util.ArrayList;

public class Kamar {
    static ArrayList<Kamar> daftarKamar = new ArrayList<>();
    private String idKamar;
    private String nomorKamar;
    private int harga;
    private String status;

    public Kamar(String idKamar, String nomorKamar, int harga, String status) {
        this.idKamar = idKamar;
        this.nomorKamar = nomorKamar;
        this.harga = harga;
        this.status = status;
    }

    public String getIdKamar() {
        return idKamar;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public int getHarga() {
        return harga;
    }

    public String getStatus() {
        return status;
    }

    public void tampilData() {
        System.out.println("ID Kamar : " + idKamar);
        System.out.println("Nomor    : " + nomorKamar);
        System.out.println("Harga    : " + harga);
        System.out.println("Status   : " + status);
    }
    public static void menuKamar() {
    Scanner input = new Scanner(System.in);
    int pilihan;

    do {
        System.out.println("\n=== DATA KAMAR ===");
        System.out.println("1. Tambah Kamar");
        System.out.println("2. Lihat Kamar");
        System.out.println("3. Kembali");
        System.out.print("Pilih: ");

        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
               System.out.print("ID Kamar: ");
    String id = input.next();

    System.out.print("Nomor Kamar: ");
    String nomor = input.next();

    System.out.print("Harga: ");
    int harga = input.nextInt();

    System.out.print("Status: ");
    String status = input.next();

    daftarKamar.add(new Kamar(id, nomor, harga, status));

    System.out.println("Data kamar berhasil ditambahkan");
    break;

            case 2:
                 System.out.println("--- Daftar Kamar ---");

    for (Kamar k : daftarKamar) {
        System.out.println(
            k.getIdKamar() + " | " +
            k.getNomorKamar() + " | " +
            k.getHarga() + " | " +
            k.getStatus()
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
    

