import java.util.ArrayList;

public class Film {
    private String nama;
    private String negara;
    private ArrayList<String> daftarAktor;
    private int durasi;
    private int tahunRilis;

    public Film(String nama, String negara, int durasi, int tahunRilis) {
        this.nama = nama;
        this.negara = negara;
        this.durasi = durasi;
        this.tahunRilis = tahunRilis;
        this.daftarAktor = new ArrayList<>();
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public String getNegara() {
        return negara;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

    public void tambahAktor(String aktor) {
        daftarAktor.add(aktor);
    }

    public void hapusAktor(String aktor) {
        daftarAktor.remove(aktor);
    }

    public void tampilkanDaftarAktor() {
        System.out.println("Daftar Aktor:");
        
        for (String aktor : daftarAktor) {
            System.out.println("- " + aktor);
        }
    }
}