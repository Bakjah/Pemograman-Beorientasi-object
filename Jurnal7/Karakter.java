public class Karakter {
    private String nama;
    private int level;
    private Guild guild;
    
    public Karakter(String nama, int level, Guild guild) {
        this.nama = nama;
        this.level = level;
        this.guild = guild;
    }

    public void infoDasar() {
        System.out.println("=== INFO DASAR KARAKTER ===");
        System.out.println("  Nama: " + nama);
        System.out.println("  Level: " + level);
    }

    public Guild getGuild() {
        return guild;
    }
}
