import java.util.ArrayList;

public class Penginapan {
    private String nama;
    private String alamat;
    private ArrayList<Tamu> daftarTamu;

    public Penginapan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.daftarTamu = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Method operasional
    public void catatMasuk(Tamu tamu) {
        daftarTamu.add(tamu);
        System.out.println(tamu.getNama() + " masuk ke penginapan " + this.nama);
    }

    public void catatKeluar(Tamu tamu) {
        if (daftarTamu.remove(tamu)) {
            System.out.println(tamu.getNama() + " keluar dari penginapan " + this.nama);
        }
    }

    public void tampilkanDaftarTamu() {
        System.out.println("Daftar tamu di " + this.nama + ":");
        for (Tamu t : daftarTamu) {
            System.out.println("- " + t.getNama() + " (" + t.getDurasiMenginap() + " hari)");
        }
    }
}