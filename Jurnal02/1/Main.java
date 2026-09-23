import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Balok");
            System.out.println("2. Bola");
            System.out.println("3. Kerucut");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Panjang: ");
                    double p = scanner.nextDouble();
                    System.out.print("Lebar: ");
                    double l = scanner.nextDouble();
                    System.out.print("Tinggi: ");
                    double t = scanner.nextDouble();

                    Balok balok = new Balok(p, l, t);
                    System.out.printf("Luas Permukaan: %.2f%n", balok.hitungLuasPermukaan());
                    System.out.printf("Volume: %.2f%n", balok.hitungVolume());
                    break;

                case 2:
                    System.out.print("Jari-jari: ");
                    double r1 = scanner.nextDouble();

                    Bola bola = new Bola(r1);
                    System.out.printf("Luas Permukaan: %.2f%n", bola.hitungLuasPermukaan());
                    System.out.printf("Volume: %.2f%n", bola.hitungVolume());
                    break;

                case 3:
                    System.out.print("Jari-jari alas: ");
                    double r2 = scanner.nextDouble();
                    System.out.print("Tinggi: ");
                    double t2 = scanner.nextDouble();

                    Kerucut kerucut = new Kerucut(r2, t2);
                    System.out.printf("Luas Permukaan: %.2f%n", kerucut.hitungLuasPermukaan());
                    System.out.printf("Volume: %.2f%n", kerucut.hitungVolume());
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 4);

        scanner.close();
    }
}