import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int lama = Integer.parseInt(sc.nextLine().trim());
            int makan = Integer.parseInt(sc.nextLine().trim());
            TipeKamar kamar = TipeKamar.dariString(sc.nextLine());

            Pemilik pemilik1 = new Pemilik("12345", "Agus", "Bandung");
            Pemilik pemilik2 = new Pemilik("12346", "Tita", "Bandung");

            Kucing mio = new Kucing("001", "Mio", KategoriKucing.KITTEN, 1.0);
            Penitipan p1 = new Penitipan("001", lama, makan, kamar); 
            p1.tambahPerawatan(new Perawatan("Grooming", 50000));
            p1.tambahPerawatan(new Perawatan("Grooming", 100000));
            p1.tambahPerawatan(new Perawatan("Grooming", 150000));
            mio.setPenitipan(p1);

            Kucing Cuking = new Kucing("002", "Cuking", KategoriKucing.SENIOR, 2.0);
            Penitipan p2 = new Penitipan("002", lama, makan, kamar);
            p2.tambahPerawatan(new Perawatan("Vaksin", 75000));
            Cuking.setPenitipan(p2);

            pemilik1.tambahKucing(mio);
            pemilik2.tambahKucing(Cuking);

            pemilik1.tampilkanKucing();
            pemilik2.tampilkanKucing();
        } catch (NumberFormatException e) {
            System.out.println("Error: Masukan harus berupa bilangan bulat");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: ada data yang null - " + e.getMessage());
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Error: input tidak lengkap");
        } catch (Exception e) {
            System.out.println("Error tak terduga: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
