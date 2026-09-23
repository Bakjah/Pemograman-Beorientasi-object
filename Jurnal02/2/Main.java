import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Kelaspbo> daftarKelas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Input nilai PBO");
            System.out.println("2. Lihat nilai tersimpan");
            System.out.println("3. Lihat rata-rata");
            System.out.println("4. Lihat nilai tertinggi");
            System.out.println("5. Lihat nilai terendah");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    lihatNilai();
                    break;
                case 3:
                    lihatRataRata();
                    break;
                case 4:
                    lihatTertinggi();
                    break;
                case 5:
                    lihatTerendah();
                    break;
                case 6:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 6);

        scanner.close();
    }

    static Kelaspbo cariKelas(String nama) {
        for (Kelaspbo k : daftarKelas) {
            if (k.getNamaKelas().equalsIgnoreCase(nama)) return k;
        }
        Kelaspbo baru = new Kelaspbo(nama);
        daftarKelas.add(baru);
        return baru;
    }

    static void inputNilai() {
        System.out.print("Nama kelas: ");
        String nama = scanner.nextLine();
        Kelaspbo kelas = cariKelas(nama);

        System.out.print("Jumlah nilai: ");
        int jumlah = scanner.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Nilai ke-" + i + ": ");
            kelas.tambahNilai(scanner.nextDouble());
        }
    }

    static void lihatNilai() {
        for (Kelaspbo k : daftarKelas) {
            System.out.println("Kelas " + k.getNamaKelas() + " : " + k.getDaftarNilai());
        }
    }

    static void lihatRataRata() {
        double totalSemua = 0;
        int jumlahSemua = 0;

        for (Kelaspbo k : daftarKelas) {
            System.out.printf("Kelas %s : %.2f%n", k.getNamaKelas(), k.hitungRataRata());
            for (double n : k.getDaftarNilai()) totalSemua += n;
            jumlahSemua += k.getDaftarNilai().size();
        }
        System.out.printf("Rata-rata keseluruhan : %.2f%n", jumlahSemua == 0 ? 0 : totalSemua / jumlahSemua);
    }

    static void lihatTertinggi() {
        double tertinggi = Double.MIN_VALUE;
        for (Kelaspbo k : daftarKelas) {
            double t = k.cariTertinggi();
            System.out.printf("Kelas %s : %.2f%n", k.getNamaKelas(), t);
            if (t > tertinggi) tertinggi = t;
        }
        System.out.printf("Nilai tertinggi keseluruhan : %.2f%n", tertinggi);
    }

    static void lihatTerendah() {
        double terendah = Double.MAX_VALUE;
        for (Kelaspbo k : daftarKelas) {
            double t = k.cariTerendah();
            System.out.printf("Kelas %s : %.2f%n", k.getNamaKelas(), t);
            if (t < terendah) terendah = t;
        }
        System.out.printf("Nilai terendah keseluruhan : %.2f%n", terendah);
    }
}