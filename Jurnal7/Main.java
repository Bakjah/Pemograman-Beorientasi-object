public class Main {
    public static void main(String[] args) {
        Guild silverMoon = new Guild("Silver Moon", "Kerajaan Utara");
        Guild goldenMerchants = new Guild("Golden Merchants", "Lembah Timur");

        System.out.println("=== KARAKTER ===");
        Karakter bram = new Karakter("Bram sang Pandai Besi", 12, goldenMerchants);
        bram.infoDasar();
        bram.getGuild().infoGuild();

        System.out.println();
        Penyihir aldebaran = new Penyihir("Aldebaran", 45, silverMoon, 250);
        aldebaran.infoPenyihir();
        aldebaran.setKetinggianTerbang(40);
        aldebaran.setKetinggianTerbang(30);
        aldebaran.rapalMantra(30);
        aldebaran.rapalMantra(220);
        aldebaran.rapalMantra(10);
        aldebaran.meditasi(40);
        aldebaran.setKetinggianTerbang(0);
        aldebaran.meditasi(40);


        System.out.println();
        Pemanah sylvanas = new Pemanah("Sylvanas", 50, silverMoon, 85, 1);
        sylvanas.infoPemanah();
        sylvanas.memanah();
        sylvanas.memanah();                 
        sylvanas.putarBidik(30);
        sylvanas.putarBidik(60);
        sylvanas.putarBidik(-180);
        sylvanas.putarBidik(90);
        sylvanas.putarBidik(-45);
        sylvanas.tambahAnakPanah(45);
        sylvanas.memanah();

        System.out.println();
        silverMoon.setNama("Crimson Dawn");
        sylvanas.getGuild().infoGuild();
    }
}
