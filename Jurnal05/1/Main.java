import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static double hitungRataRata(Scanner scanner)
            throws ArithmeticException, InputMismatchException {
        System.out.println("Berapa banyak nilai yang ingin dimasukan?");
        int banyak = scanner.nextInt();

        if (banyak <= 0) {
            throw new ArithmeticException("Tidak ada masukan nilai!");
        }

        double total = 0;
        for (int i = 1; i <= banyak; i++) {
            System.out.println("Masukkan nilai ke-" + i + ":");
            total += scanner.nextDouble();
        }
        return total / banyak;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        try {
            double rataRata = hitungRataRata(scanner);
            System.out.printf(Locale.US, "Nilai rata-rata adalah: %.2f%n", rataRata);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input bukan angka!");
        } finally {
            scanner.close();
        }
    }
}