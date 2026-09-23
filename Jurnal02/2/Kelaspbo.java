import java.util.ArrayList;

public class Kelaspbo {
    private String namaKelas;
    private ArrayList<Double> daftarNilai = new ArrayList<>();

    public Kelaspbo(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public ArrayList<Double> getDaftarNilai() {
        return daftarNilai;
    }

    public void tambahNilai(double nilai) {
        daftarNilai.add(nilai);
    }

    public double hitungRataRata() {
        double total = 0;
        for (double n : daftarNilai) total += n;
        return daftarNilai.isEmpty() ? 0 : total / daftarNilai.size();
    }

    public double cariTertinggi() {
        double tertinggi = daftarNilai.get(0);
        for (double n : daftarNilai) if (n > tertinggi) tertinggi = n;
        return tertinggi;
    }

    public double cariTerendah() {
        double terendah = daftarNilai.get(0);
        for (double n : daftarNilai) if (n < terendah) terendah = n;
        return terendah;
    }
}