import java.util.ArrayList;

public class Peternakan {
    private String nama;
    private ArrayList<Hewan> daftar;

    public Peternakan(String nama) {
        this.nama = nama;
        this.daftar = new ArrayList<>();
    }

    public void tambahHewan(Hewan h) {
        daftar.add(h);
    }

    public void tampilkanSemua() {
        System.out.println("Peternakan: " + nama);
        for (Hewan h : daftar) {
            h.tampilkanInfo();
        }
    }

    public void tampilkanStokPakan() {
        for (Hewan h : daftar) {
            System.out.println(h.nama + ": " + h.getStokPakan() + " kg");
        }
    }

    public void cetakProduksiSusu() {
        for (Hewan h : daftar) {
            if (h instanceof PenghasilSusu) {
                System.out.println(h.nama + ": " + ((PenghasilSusu) h).getLabelSusu());
            }
        }
    }

    public void cetakProduksiWol() {
        for (Hewan h : daftar) {
            if (h instanceof PenghasilWol) {
                System.out.println(h.nama + ": " + ((PenghasilWol) h).getLabelWol());
            }
        }
    }
}
