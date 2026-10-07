package View;

import Controler.KostController;
import Model.Karyawan;
import Model.Mahasiswa;
import Model.PenghuniKost;
import java.util.Scanner;

public class MainView {

    private final Scanner input = new Scanner(System.in);
    private final KostController controller = new KostController();

    public void jalankanProgram() {
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = inputAngka("Pilih menu: ");

            switch (pilihan) {
                case 1:
                    tambahPenghuni();
                    break;

                case 2:
                    controller.tampilkanSemuaData();
                    break;

                case 3:
                    cariPenghuni();
                    break;

                case 4:
                    ubahPenghuni();
                    break;

                case 5:
                    hapusPenghuni();
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilihan != 0);
    }

    private void tampilkanMenu() {
        System.out.println("\n================================");
        System.out.println("   SISTEM MANAJEMEN DATA KOST");
        System.out.println("================================");
        System.out.println("1. Tambah Data Penghuni");
        System.out.println("2. Tampilkan Semua Data");
        System.out.println("3. Cari Data Penghuni");
        System.out.println("4. Ubah Data Penghuni");
        System.out.println("5. Hapus Data Penghuni");
        System.out.println("0. Keluar");
        System.out.println("================================");
    }

    private void tambahPenghuni() {
        System.out.println("\n===== TAMBAH DATA PENGHUNI =====");

        String id = inputTeks("ID Penghuni   : ");

        if (controller.idSudahAda(id)) {
            System.out.println("ID sudah digunakan.");
            return;
        }

        String nama = inputTeks("Nama          : ");
        String noHp = inputTeks("Nomor HP      : ");
        String noKamar = inputTeks("Nomor Kamar   : ");

        if (controller.nomorKamarTerpakai(noKamar)) {
            System.out.println("Nomor kamar sudah ditempati.");
            return;
        }

        System.out.println("\nJenis Penghuni:");
        System.out.println("1. Mahasiswa");
        System.out.println("2. Karyawan");

        int jenis = inputAngka("Pilih jenis: ");

        if (jenis == 1) {
            String nim = inputTeks("NIM           : ");
            String universitas = inputTeks("Universitas   : ");

            Mahasiswa mahasiswa = new Mahasiswa(
                    id,
                    nama,
                    noHp,
                    noKamar,
                    nim,
                    universitas
            );

            controller.tambahData(mahasiswa, true);

        } else if (jenis == 2) {
            String jabatan = inputTeks("Jabatan       : ");
            String perusahaan = inputTeks("Perusahaan    : ");

            Karyawan karyawan = new Karyawan(
                    id,
                    nama,
                    noHp,
                    noKamar,
                    jabatan,
                    perusahaan
            );

            controller.tambahData(karyawan, true);

        } else {
            System.out.println("Jenis penghuni tidak valid.");
        }
    }

    private void cariPenghuni() {
        System.out.println("\n===== CARI DATA PENGHUNI =====");

        String id = inputTeks("Masukkan ID: ");
        PenghuniKost penghuni = controller.cariData(id);

        if (penghuni != null) {
            System.out.println("\nData ditemukan:");
            penghuni.tampilData();
        } else {
            System.out.println("Data penghuni tidak ditemukan.");
        }
    }

    private void ubahPenghuni() {
        System.out.println("\n===== UBAH DATA PENGHUNI =====");

        String id = inputTeks("Masukkan ID yang akan diubah: ");
        PenghuniKost penghuni = controller.cariData(id);

        if (penghuni == null) {
            System.out.println("Data penghuni tidak ditemukan.");
            return;
        }

        System.out.println("ID tetap      : " + penghuni.getId());

        String nama = inputTeks("Nama baru     : ");
        String noHp = inputTeks("Nomor HP baru : ");
        String noKamar = inputTeks("No. Kamar baru: ");

        if (!noKamar.equalsIgnoreCase(penghuni.getNoKamar())
                && controller.nomorKamarTerpakai(noKamar)) {

            System.out.println(
                    "Nomor kamar sudah ditempati penghuni lain."
            );
            return;
        }

        boolean berhasil = controller.ubahData(
                id,
                nama,
                noHp,
                noKamar
        );

        if (berhasil) {
            System.out.println("Data penghuni berhasil diubah.");
        } else {
            System.out.println("Data penghuni gagal diubah.");
        }
    }

    private void hapusPenghuni() {
        System.out.println("\n===== HAPUS DATA PENGHUNI =====");

        String id = inputTeks(
                "Masukkan ID yang akan dihapus: "
        );

        PenghuniKost penghuni = controller.cariData(id);

        if (penghuni == null) {
            System.out.println("Data penghuni tidak ditemukan.");
            return;
        }

        System.out.println("\nData yang akan dihapus:");
        penghuni.tampilData();

        String konfirmasi = inputTeks(
                "Yakin ingin menghapus? (y/n): "
        );

        if (konfirmasi.equalsIgnoreCase("y")) {
            controller.hapusData(id);
        } else {
            System.out.println("Penghapusan dibatalkan.");
        }
    }

    private int inputAngka(String pesan) {

        while (true) {
            try {
                System.out.print(pesan);

                String nilai = input.nextLine();

                return Integer.parseInt(nilai);

            } catch (NumberFormatException e) {

                System.out.println(
                        "Input tidak valid. Masukkan angka yang benar."
                );
            }
        }
    }

    private String inputTeks(String pesan) {

        while (true) {
            System.out.print(pesan);

            String teks = input.nextLine().trim();

            if (!teks.isEmpty()) {
                return teks;
            }

            System.out.println(
                    "Input tidak boleh kosong."
            );
        }
    }
}