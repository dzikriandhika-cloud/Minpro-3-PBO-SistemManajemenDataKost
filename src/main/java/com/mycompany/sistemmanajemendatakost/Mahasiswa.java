/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmanajemendatakost;

public class Mahasiswa extends PenghuniKost {

    private String nim;

    public Mahasiswa(String id, String nama, String nim) {
        super(id, nama);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("NIM : " + nim);
    }
}
