import java.util.ArrayList;

public class Film {
    private String nama;
    private String Negara;
    private ArrayList<String> daftarAktor;
    private int durasi;
    private int tahunRilis;

    public Film(String nama, String Negara, int durasi, int tahunRilis) {
        this.nama = nama;
        this.Negara = Negara;
        this.durasi = durasi;
        this.tahunRilis = tahunRilis;
        this.daftarAktor = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getNegara() {
        return Negara;
    }

    public ArrayList<String> getDaftarAktor() {
        return daftarAktor;
    }

    public int getDurasi() {
        return durasi;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

    public void tambahAktor(String aktor) {
        daftarAktor.add(aktor);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNegara(String Negara) {
        this.Negara = Negara;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }
}
