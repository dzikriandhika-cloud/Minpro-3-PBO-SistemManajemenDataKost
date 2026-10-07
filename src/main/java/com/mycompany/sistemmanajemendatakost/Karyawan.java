/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmanajemendatakost;

public class Karyawan extends PenghuniKost {

    private String jabatan;

    public Karyawan(String id, String nama, String jabatan) {
        super(id, nama);
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Jabatan : " + jabatan);
    }
}
