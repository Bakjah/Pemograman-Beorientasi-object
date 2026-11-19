public class Penyihir extends Karakter {
    private int ketinggianTerbang;
    private int jumlahMana;

    public Penyihir(String nama, int level, Guild guild, int jumlahMana) {
        super(nama, level, guild);
        this.jumlahMana = jumlahMana;
        this.ketinggianTerbang = 0;
    }

    public void infoPenyihir() {
        infoDasar();
        getGuild().infoGuild();
        System.out.println("=== INFO PENYIHIR ===");
        System.out.println("  Jumlah Mana: " + jumlahMana + " poin");
        System.out.println("  Ketinggian Terbang: " + ketinggianTerbang + " meter");
    }

    public void setKetinggianTerbang(int ketinggianTerbang) {
        this.ketinggianTerbang = Math.max(0, ketinggianTerbang);
        System.out.println("Mengubah ketinggian terbang ke: " + this.ketinggianTerbang + " meter");
    }

    public void rapalMantra(int mana) {
        if (jumlahMana <= 0) {
            System.out.println("Mana sudah habis, tidak bisa merapalkan mantra.");
            return;
        }
        if (mana > jumlahMana) {
            System.out.println("Mana tidak cukup untuk merapalkan mantra sebesar " + mana + " poin mana.");
            return;
        }

        jumlahMana -= mana;
        System.out.println("Penyihir merapalkan mantra sebesar " + mana + " poin mana");
        if (jumlahMana == 0) {
            System.out.println("Mana sudah digunakan semua");
        } else {
            System.out.println("Sisa Mana: " + jumlahMana + " poin");
        }
    }

    public void meditasi(int jumlahMana) {
        if (ketinggianTerbang != 0) {
            System.out.println("Tidak bisa meditasi, Penyihir belum mendarat");
            return;
        }
        this.jumlahMana += jumlahMana;
        System.out.println("Memulihkan Mana sebanyak " + jumlahMana + " poin");
        System.out.println("Jumlah Mana Sekarang: " + this.jumlahMana + " poin");
    }
}
