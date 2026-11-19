public class Main {
    public static void main(String[] args) {

        Film film1 = new Film(
            "Avengers: Endgame",
            "Amerika Serikat",
            181,
            2019
        );

        film1.tambahAktor("Robert Downey Jr.");
        film1.tambahAktor("Chris Evans");
        film1.tambahAktor("Chris Hemsworth");

        System.out.println("Nama       : " + film1.getNama());
        System.out.println("Negara     : " + film1.getNegara());
        System.out.println("Durasi     : " + film1.getDurasi() + " menit");
        System.out.println("Tahun Rilis: " + film1.getTahunRilis());
        film1.tampilkanDaftarAktor();

        Film film2 = new Film(
            "Spongebob",
            "Amerika Serikat",
            60,
            2006
        );

        film2.tambahAktor("Spongebob.");
        film2.tambahAktor("Patrick");
        film2.tambahAktor("Mr. Crab");

        System.out.println("Nama       : " + film2.getNama());
        System.out.println("Negara     : " + film2.getNegara());
        System.out.println("Durasi     : " + film2.getDurasi() + " menit");
        System.out.println("Tahun Rilis: " + film2.getTahunRilis());
        film1.tampilkanDaftarAktor();
    }
}

