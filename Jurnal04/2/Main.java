public class Main {
    public static void main(String[] args) {
        Penginapan kourindou = new Penginapan("Penginapan Kourindou", "Gensokyo");

        Tamu reimu = new Tamu("Reimu", 3);
        Tamu marisa = new Tamu("Marisa", 2);

        kourindou.catatMasuk(reimu);
        kourindou.catatMasuk(marisa);

        kourindou.tampilkanDaftarTamu();

        kourindou.catatKeluar(reimu);

        kourindou.tampilkanDaftarTamu();
    }
}