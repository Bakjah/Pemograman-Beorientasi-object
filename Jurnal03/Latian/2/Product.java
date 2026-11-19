public class Product {
    private String Id;
    private String Nama;
    private String produsen;
    private int berat;
    private String jenis;
    private int harga;
    private String lokasiRak;
    private int stok;

    public Product(String Id, String Nama, String produsen, int berat, String jenis, int harga, String lokasiRak, int stok) {
        this.Id = Id;
        this.Nama = Nama;
        this.produsen = produsen;
        this.berat = berat;
        this.jenis = jenis;
        this.harga = harga;
        this.lokasiRak = lokasiRak;
        this.stok = stok;
    }

    public String getId() {
        return Id;
    }

    public String getNama() {
        return Nama;
    }

    public String getProdusen() {
        return produsen;
    }

    public int getBerat() {
        return berat;
    }

    public String getJenis() {
        return jenis;
    }

    public int getHarga() {
        return harga;
    }

    public String getLokasiRak() {
        return lokasiRak;
    }

    public int getStok() {
        return stok;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setProdusen(String produsen) {
        this.produsen = produsen;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setLokasiRak(String lokasiRak) {
        this.lokasiRak = lokasiRak;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}