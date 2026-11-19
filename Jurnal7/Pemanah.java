public class Pemanah extends Karakter {
    private int kekuatanBusur;
    private int derajatBidik;
    private int anakPanah;

    public Pemanah(String nama, int level, Guild guild, int kekuatanBusur, int anakPanah) {
        super(nama, level, guild);
        this.kekuatanBusur = kekuatanBusur;
        this.anakPanah = anakPanah;
        this.derajatBidik = 0;
    }

    private String getArahBidik() {
        switch (derajatBidik) {
            case 0:   return "Depan";
            case 90:  return "Kanan";
            case 180: return "Belakang";
            case 270: return "Kiri";
        }
        if (derajatBidik < 90)  return "Depan Kanan";
        if (derajatBidik < 180) return "Belakang Kanan";
        if (derajatBidik < 270) return "Belakang Kiri";
        return "Depan Kiri";
    }

    public void infoPemanah() {
        infoDasar();
        getGuild().infoGuild();
        System.out.println("=== INFO BUSUR PEMANAH ===");
        System.out.println("  Kekuatan Busur: " + kekuatanBusur + " lbs");
        System.out.println("  Jumlah Anak Panah: " + anakPanah + " buah");
        System.out.println("  Derajat Bidik: " + derajatBidik + " derajat");
        System.out.println("  Arah Bidikan : " + getArahBidik());
    }

    public void putarBidik(int derajat) {
        derajatBidik = Math.floorMod(derajatBidik + derajat, 360);
        System.out.println("Memutar bidikan ke " + derajatBidik + " derajat");
        System.out.println("Arah Bidikan : " + getArahBidik());
    }

    public void memanah() {
        if (anakPanah <= 0) {
            System.out.println("Anak panah habis, tidak bisa memanah.");
            return;
        }
        anakPanah--;
        System.out.println("Pemanah Memanah...");
        System.out.println("Sisa Anak Panah: " + anakPanah + " buah");
    }

    public void tambahAnakPanah(int anakPanah) {
        this.anakPanah += anakPanah;
        System.out.println("Menambah Anak Panah sebanyak " + anakPanah + " buah");
        System.out.println("Jumlah Anak Panah Sekarang: " + this.anakPanah + " buah");
    }
}
