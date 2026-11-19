import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> products = new ArrayList<>();
    
    public static void main(String[] args) {

        int choice = 0; 

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Hapus Produk");
            System.out.println("3. Update Produk");
            System.out.println("4. Lihat Produk");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    removeProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    viewProducts();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 5);
    }

    public static void addProduct() {
        System.out.print("Masukkan ID Produk: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Produk: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Produsen: ");
        String produsen = scanner.nextLine();
        System.out.print("Masukkan Berat (gram): ");
        int berat = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan Jenis Produk: ");
        String jenis = scanner.nextLine();
        System.out.print("Masukkan Harga: ");
        int harga = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan Lokasi Rak: ");
        String lokasiRak = scanner.nextLine();
        System.out.print("Masukkan Stok: ");
        int stok = scanner.nextInt();
        scanner.nextLine();

        Product product = new Product(id, nama, produsen, berat, jenis, harga, lokasiRak, stok);
        products.add(product);
        System.out.println("Produk berhasil ditambahkan.");
    }

    public static void removeProduct() {
        System.out.print("Masukkan ID Produk yang ingin dihapus: ");
        String id = scanner.nextLine();
        boolean removed = products.removeIf(product -> product.getId().equals(id));
        if (removed) {
            System.out.println("Produk berhasil dihapus.");
        } else {
            System.out.println("Produk dengan ID tersebut tidak ditemukan.");
        }
    }   

    public static void updateProduct() {
        System.out.print("Masukkan ID Produk yang ingin diupdate: ");
        String id = scanner.nextLine();
        Product productToUpdate = null;

        for (Product product : products) {
            if (product.getId().equals(id)) {
                productToUpdate = product;
                break;
            }
        }

        if (productToUpdate != null) {
            System.out.print("Masukkan Nama Produk baru: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Produsen baru: ");
            String produsen = scanner.nextLine();
            System.out.print("Masukkan Berat baru (gram): ");
            int berat = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character
            System.out.print("Masukkan Jenis Produk baru: ");
            String jenis = scanner.nextLine();
            System.out.print("Masukkan Harga baru: ");
            int harga = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character
            System.out.print("Masukkan Lokasi Rak baru: ");
            String lokasiRak = scanner.nextLine();
            System.out.print("Masukkan Stok baru: ");
            int stok = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            productToUpdate.setNama(nama);
            productToUpdate.setProdusen(produsen);
            productToUpdate.setBerat(berat);
            productToUpdate.setJenis(jenis);
            productToUpdate.setHarga(harga);
            productToUpdate.setLokasiRak(lokasiRak);
            productToUpdate.setStok(stok);

            System.out.println("Produk berhasil diupdate.");
        } else {
            System.out.println("Produk dengan ID tersebut tidak ditemukan.");
        }
    }

    public static void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("Tidak ada produk yang tersedia.");
        } else {
            System.out.println("Daftar Produk:");
            for (Product product : products) {
                System.out.println("ID: " + product.getId());
                System.out.println("Nama: " + product.getNama());
                System.out.println("Produsen: " + product.getProdusen());
                System.out.println("Berat: " + product.getBerat() + " gram");
                System.out.println("Jenis: " + product.getJenis());
                System.out.println("Harga: " + product.getHarga());
                System.out.println("Lokasi Rak: " + product.getLokasiRak());
                System.out.println("Stok: " + product.getStok());
                System.out.println("---------------------------");
            }
        }
    }
}