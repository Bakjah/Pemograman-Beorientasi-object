import java.util.ArrayList;

public class Penitipan {
    private String kode;
    private int lamaTitip;
    private int jumlahMakan;
    private TipeKamar tipeKamar;
    private ArrayList<Perawatan> listRawat;

    public Penitipan(String kode, int lamaTitip, int jumlahMakan, TipeKamar tipeKamar) {
        if (lamaTitip < 1) {
            throw new IllegalArgumentException("Lama penitipan minimal 1 hari");
        }
        if (jumlahMakan < 1) {
            throw new IllegalArgumentException("Minimun jumlah makan adalah 1 kali");
        }
        if (tipeKamar == null) {
            throw new IllegalArgumentException("Tipe kamar tidak boleh null");
        }
        this.kode = kode;
        this.lamaTitip = lamaTitip;
        this.jumlahMakan = jumlahMakan;
        this.tipeKamar = tipeKamar;
        this.listRawat = new ArrayList<>();
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getLamaTitip() {
        return lamaTitip;
    }

    public void setLamaTitip(int lamaTitip) {
        if (lamaTitip < 1) {
            throw new IllegalArgumentException("Lama penitipan minimal 1 hari");
        }
        this.lamaTitip = lamaTitip;
    }

    public int getJumlahMakan() {
        return jumlahMakan;
    }

    public void setJumlahMakan(int jumlahMakan) {
        if (jumlahMakan < 1) {
            throw new IllegalArgumentException("Minimun jumlah makan adalah 1 kali");
        }
        this.jumlahMakan = jumlahMakan;
    }

    public TipeKamar getTipeKamar() {
        return tipeKamar;
    }

    public void setTipeKamar(TipeKamar tipeKamar) {
        this.tipeKamar = tipeKamar;
    }

    public ArrayList<Perawatan> getListRawat() {
        return listRawat;
    }

    public void tambahPerawatan(Perawatan perawatan) {
        listRawat.add(perawatan);
    }

    public double hitungBiayaTitip(KategoriKucing kategori) {
        return tipeKamar.getTarifPerHari() * lamaTitip
                + kategori.getBiayaMakan() * jumlahMakan;
    }

    public double hitungBiayaPerawatan() {
        double total = 0;
        for (Perawatan p : listRawat) {
            total += p.getBiaya();
        }
        return total;
    }
}
