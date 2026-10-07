/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmanajemendatakost;

import java.util.ArrayList;
import java.util.Scanner;

public class Minpro2PBOSistemManajemenDataKost {

    public static void main(String[] args) {

        ArrayList<PenghuniKost> dataKost = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        // Dummy data awal
        dataKost.add(new Mahasiswa("001", "Dzikri", "23001"));
        dataKost.add(new Karyawan("002", "Andi", "Staff"));

            while (true) {
           System.out.println("=== MENU DATA KOST ===");
           System.out.println("1. Tampilkan Data");
           System.out.println("2. Tambah Data");
           System.out.println("3. Keluar");
           System.out.print("Pilih: ");

           int pilih = input.nextInt();
           input.nextLine();
            if (pilih == 1) {
                for (PenghuniKost p : dataKost) {
                    p.tampilData();
                    System.out.println("----------------");
                }
            }
            else if (pilih == 2) {

  

                System.out.print("Masukkan ID : ");
                String id = input.nextLine();

                System.out.print("Masukkan Nama : ");
                String nama = input.nextLine();

                System.out.print("Pilih jenis (1. Mahasiswa / 2. Karyawan): ");
                int jenis = input.nextInt();
                input.nextLine();

                if (jenis == 1) {
                    System.out.print("Masukkan NIM : ");
                    String nim = input.nextLine();

                    dataKost.add(new Mahasiswa(id, nama, nim));

                } else if (jenis == 2) {
                    System.out.print("Masukkan Jabatan : ");
                    String jabatan = input.nextLine();

                    dataKost.add(new Karyawan(id, nama, jabatan));

                } else {
                    System.out.println("Pilihan tidak tersedia");
                }

                System.out.println("Data berhasil ditambahkan!");
            }
                        
                else if (pilih == 3) {
          break;
                }
    
            }
    }
}
    