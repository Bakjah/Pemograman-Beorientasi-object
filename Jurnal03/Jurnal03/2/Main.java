import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Produk> daftarProduk = new ArrayList<>();

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("1. Tambah Produk");
            System.out.println("2. Edit Produk");
            System.out.println("3. Hapus Produk");
            System.out.println("4. Tampilkan Semua Produk");
            System.out.println("5. Tampilkan Produk Berdasarkan Jenis");
            System.out.println("6. Tampilkan Produk Berdasarkan Rentang Harga");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahProduk();
                    break;

                case 2:
                    editProduk();
                    break;

                case 3:
                    hapusProduk();
                    break;

                case 4:
                    tampilkanSemua();
                    break;

                case 5:
                    tampilkanBerdasarkanJenis();
                    break;

                case 6:
                    tampilkanBerdasarkanHarga();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
    }

    public static void tambahProduk() {

        System.out.print("ID          : ");
        String id = input.nextLine();

        System.out.print("Nama        : ");
        String nama = input.nextLine();

        System.out.print("Produsen    : ");
        String produsen = input.nextLine();

        System.out.print("Berat (gram): ");
        double berat = input.nextDouble();
        input.nextLine();

        String jenis;

        do {
            System.out.print("Jenis (Makanan/Minuman/Kosmetik): ");
            jenis = input.nextLine();

            if (!jenis.equalsIgnoreCase("Makanan") &&
                !jenis.equalsIgnoreCase("Minuman") &&
                !jenis.equalsIgnoreCase("Kosmetik")) {

                System.out.println("Jenis hanya Makanan, Minuman, atau Kosmetik!");
            }

        } while (!jenis.equalsIgnoreCase("Makanan") &&
                 !jenis.equalsIgnoreCase("Minuman") &&
                 !jenis.equalsIgnoreCase("Kosmetik"));

        System.out.print("Harga       : ");
        double harga = input.nextDouble();
        input.nextLine();

        System.out.print("Lokasi Rak  : ");
        String lokasiRak = input.nextLine();

        System.out.print("Stok        : ");
        int stok = input.nextInt();
        input.nextLine();

        Produk produk = new Produk(
            id,
            nama,
            produsen,
            berat,
            jenis,
            harga,
            lokasiRak,
            stok
        );

        daftarProduk.add(produk);

        System.out.println("Produk berhasil ditambahkan!");
    }

    public static void editProduk() {
        System.out.print("Masukkan ID produk: ");
        String id = input.nextLine();

        Produk produk = cariProduk(id);

        if (produk == null) {
            System.out.println("Produk tidak ditemukan!");
            return;
        }

        System.out.print("Nama baru       : ");
        produk.setNama(input.nextLine());

        System.out.print("Produsen baru   : ");
        produk.setProdusen(input.nextLine());

        System.out.print("Berat baru      : ");
        produk.setBerat(input.nextDouble());
        input.nextLine();

        System.out.print("Jenis baru      : ");
        produk.setJenis(input.nextLine());

        System.out.print("Harga baru      : ");
        produk.setHarga(input.nextDouble());
        input.nextLine();

        System.out.print("Lokasi rak baru : ");
        produk.setLokasiRak(input.nextLine());

        System.out.print("Stok baru       : ");
        produk.setStok(input.nextInt());
        input.nextLine();

        System.out.println("Produk berhasil diedit!");
    }

    public static void hapusProduk() {

        System.out.print("Masukkan ID produk: ");
        String id = input.nextLine();

        Produk produk = cariProduk(id);

        if (produk == null) {
            System.out.println("Produk tidak ditemukan!");
            return;
        }

        daftarProduk.remove(produk);

        System.out.println("Produk berhasil dihapus!");
    }

    public static void tampilkanSemua() {

        if (daftarProduk.isEmpty()) {
            System.out.println("Belum ada produk.");
            return;
        }

        for (Produk produk : daftarProduk) {
            System.out.println("------------------------");
            System.out.println(produk);
        }
    }

    public static void tampilkanBerdasarkanJenis() {

        System.out.print("Masukkan jenis: ");
        String jenis = input.nextLine();

        boolean ditemukan = false;

        for (Produk produk : daftarProduk) {

            if (produk.getJenis().equalsIgnoreCase(jenis)) {

                System.out.println("------------------------");
                System.out.println(produk);

                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Produk dengan jenis tersebut tidak ditemukan.");
        }
    }

    public static void tampilkanBerdasarkanHarga() {

        System.out.print("Harga terendah : ");
        double hargaMin = input.nextDouble();

        System.out.print("Harga tertinggi: ");
        double hargaMax = input.nextDouble();
        input.nextLine();

        boolean ditemukan = false;

        for (Produk produk : daftarProduk) {

            if (produk.getHarga() >= hargaMin &&
                produk.getHarga() <= hargaMax) {

                System.out.println("------------------------");
                System.out.println(produk);

                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada produk dalam rentang harga tersebut.");
        }
    }

    public static Produk cariProduk(String id) {

        for (Produk produk : daftarProduk) {

            if (produk.getId().equalsIgnoreCase(id)) {
                return produk;
            }
        }

        return null;
    }
}