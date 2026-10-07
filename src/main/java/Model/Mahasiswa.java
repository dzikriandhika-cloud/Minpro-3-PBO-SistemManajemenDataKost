/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Mahasiswa extends PenghuniKost {
    private String nim;
    private String universitas;

    public Mahasiswa(String id, String nama, String noHp, String noKamar,
                     String nim, String universitas) {
        super(id, nama, noHp, noKamar);
        this.nim = nim;
        this.universitas = universitas;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getUniversitas() {
        return universitas;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }

    @Override
    public String getJenisPenghuni() {
        return "Mahasiswa";
    }

    @Override
    public void tampilData() {
        System.out.println("ID          : " + getId());
        System.out.println("Nama        : " + getNama());
        System.out.println("No. HP      : " + getNoHp());
        System.out.println("No. Kamar   : " + getNoKamar());
        System.out.println("Status      : " + getJenisPenghuni());
        System.out.println("NIM         : " + getNim());
        System.out.println("Universitas : " + getUniversitas());
    }
}