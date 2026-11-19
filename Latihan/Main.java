public class Main {
    public static void main(String[] args) {
        Film film1 = new Film("The Shawshank Redemption", "USA", 142, 1994);
        film1.tambahAktor("Tim Robbins");
        film1.tambahAktor("Morgan Freeman");
        System.out.println("Nama Film: " + film1.getNama());
        System.out.println("Negara: " + film1.getNegara());
        System.out.println("Durasi: " + film1.getDurasi());
        System.out.println("Tahun Rilis: " + film1.getTahunRilis());
        System.out.println("Aktor:");
        for (String aktor : film1.getDaftarAktor()) {
            System.out.println("- " + aktor);
        }

        System.out.println();
        System.out.println("================================");
        System.out.println();

        Film film2 = new Film("The Godfather", "USA", 175, 1972);
        film2.tambahAktor("Marlon Brando");
        film2.tambahAktor("Al Pacino");
        System.out.println("Nama Film: " + film2.getNama());
        System.out.println("Negara: " + film2.getNegara());
        System.out.println("Durasi: " + film2.getDurasi());
        System.out.println("Tahun Rilis: " + film2.getTahunRilis());
        System.out.println("Aktor:");
        for (String aktor : film2.getDaftarAktor()) {
            System.out.println("- " + aktor);
        }
    }

    
}