public class Kucing {
    private String id;
    private String nama;
    private KategoriKucing kategori;
    private double berat;
    private Penitipan penitipan;

    public Kucing(String id, String nama, KategoriKucing kategori, double berat) {
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.berat = berat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public KategoriKucing getKategori() {
        return kategori;
    }

    public void setKategori(KategoriKucing kategori) {
        this.kategori = kategori;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public Penitipan getPenitipan() {
        return penitipan;
    }

    public void setPenitipan(Penitipan penitipan) {
        this.penitipan = penitipan;
    }

    public boolean sudahDititipkan() {
        return penitipan != null;
    }

    public double hitungBiayaTitip() {
        if (penitipan == null) {
            throw new IllegalStateException("Kucing " + nama + " belum dititipkan di hotel");
        }
        return penitipan.hitungBiayaTitip(kategori);
    }

    public double hitungBiayaPerawatan() {
        if (penitipan == null) {
            throw new IllegalStateException(
                    "Biaya perawatan tidak bisa dihitung: kucing " + nama + " belum dititipkan di hotel");
        }
        return penitipan.hitungBiayaPerawatan();
    }

    public double hitungTotalBiaya() {
        return hitungBiayaTitip() + hitungBiayaPerawatan();
    }
}
