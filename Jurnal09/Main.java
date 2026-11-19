public class Main {
    public static void main(String[] args) {
        Peternakan peternakan = new Peternakan("Susu Segar Bahagia");

        Hewan sapi = new Sapi("Siti", 100, 15);
        Hewan kambing = new Kambing("Jefri", 30, 2);
        Hewan domba = new Domba("Watame", 30, 1, 3.5);

        peternakan.tambahHewan(sapi);
        peternakan.tambahHewan(kambing);
        peternakan.tambahHewan(domba);

        System.out.println("=== Penghuni Kandang ===");
        peternakan.tampilkanSemua();

        System.out.println("\n=== Siapkan Pakan ===");
        sapi.beriPakan(2);
        kambing.beriPakan(2);
        domba.beriPakan(2);

        System.out.println("\n=== Perkiraan Hasil Ternak ===");
        peternakan.cetakProduksiSusu();
        peternakan.cetakProduksiWol();

        System.out.println("\n=== Sisa Stok Pakan ===");
        peternakan.tampilkanStokPakan();
    }
}
