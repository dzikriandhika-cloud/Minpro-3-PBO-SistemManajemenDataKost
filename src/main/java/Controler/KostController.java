/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Model.KelolaData;
import Model.PenghuniKost;
import java.util.ArrayList;

public class KostController implements KelolaData {
    private final ArrayList<PenghuniKost> daftarPenghuni = new ArrayList<>();

    @Override
    public void tambahData(PenghuniKost penghuni) {
        daftarPenghuni.add(penghuni);
        System.out.println("Data penghuni berhasil ditambahkan.");
    }

    // Overloading
    public void tambahData(PenghuniKost penghuni, boolean tampilkanPesan) {
        daftarPenghuni.add(penghuni);

        if (tampilkanPesan) {
            System.out.println(
                    "Data " + penghuni.getNama() + " berhasil ditambahkan."
            );
        }
    }

    @Override
    public void hapusData(String id) {
        PenghuniKost penghuni = cariData(id);

        if (penghuni != null) {
            daftarPenghuni.remove(penghuni);
            System.out.println("Data penghuni berhasil dihapus.");
        } else {
            System.out.println("Data dengan ID " + id + " tidak ditemukan.");
        }
    }

    @Override
    public PenghuniKost cariData(String id) {
        for (PenghuniKost penghuni : daftarPenghuni) {
            if (penghuni.getId().equalsIgnoreCase(id)) {
                return penghuni;
            }
        }

        return null;
    }

    public void tampilkanSemuaData() {
        if (daftarPenghuni.isEmpty()) {
            System.out.println("Belum ada data penghuni.");
            return;
        }

        System.out.println("\n===== DAFTAR PENGHUNI KOST =====");

        for (PenghuniKost penghuni : daftarPenghuni) {
            penghuni.tampilData();
            System.out.println("-------------------------------");
        }
    }

    public boolean ubahData(
            String id,
            String nama,
            String noHp,
            String noKamar
    ) {
        PenghuniKost penghuni = cariData(id);

        if (penghuni == null) {
            return false;
        }

        penghuni.setNama(nama);
        penghuni.setNoHp(noHp);
        penghuni.setNoKamar(noKamar);

        return true;
    }

    public boolean idSudahAda(String id) {
        return cariData(id) != null;
    }

    public boolean nomorKamarTerpakai(String noKamar) {
        for (PenghuniKost penghuni : daftarPenghuni) {
            if (penghuni.getNoKamar().equalsIgnoreCase(noKamar)) {
                return true;
            }
        }

        return false;
    }
}
