package Model;

public class Karyawan extends PenghuniKost {
    private String jabatan;
    private String perusahaan;

    public Karyawan(String id, String nama, String noHp, String noKamar,
                    String jabatan, String perusahaan) {
        super(id, nama, noHp, noKamar);
        this.jabatan = jabatan;
        this.perusahaan = perusahaan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(String perusahaan) {
        this.perusahaan = perusahaan;
    }

    @Override
    public String getJenisPenghuni() {
        return "Karyawan";
    }

    @Override
    public void tampilData() {
        System.out.println("ID          : " + getId());
        System.out.println("Nama        : " + getNama());
        System.out.println("No. HP      : " + getNoHp());
        System.out.println("No. Kamar   : " + getNoKamar());
        System.out.println("Status      : " + getJenisPenghuni());
        System.out.println("Jabatan     : " + getJabatan());
        System.out.println("Perusahaan  : " + getPerusahaan());
    }
}