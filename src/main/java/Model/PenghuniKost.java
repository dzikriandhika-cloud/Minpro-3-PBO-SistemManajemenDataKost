/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public abstract class PenghuniKost {
    private final String id;
    private String nama;
    private String noHp;
    private String noKamar;

    public PenghuniKost(String id, String nama, String noHp, String noKamar) {
        this.id = id;
        this.nama = nama;
        this.noHp = noHp;
        this.noKamar = noKamar;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getNoKamar() {
        return noKamar;
    }

    public void setNoKamar(String noKamar) {
        this.noKamar = noKamar;
    }

    public abstract String getJenisPenghuni();

    public abstract void tampilData();
}
