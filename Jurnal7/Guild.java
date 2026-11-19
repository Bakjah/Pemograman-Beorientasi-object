public class Guild {
    private String nama;
    private String wilayahAsal;

    public Guild(String nama, String wilayahAsal) {
        this.nama = nama;
        this.wilayahAsal = wilayahAsal;
    }

    public void infoGuild() {
        System.out.println("=== INFO GUILD ===");
        System.out.println("  Nama Guild: " + nama);
        System.out.println("  Wilayah Asal: " + wilayahAsal);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
