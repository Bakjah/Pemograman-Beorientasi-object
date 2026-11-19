public class Pahlawan {
    private String nama;
    private int health;
    private int level;
    private Senjata senjata;
    public Pahlawan(String nama, int health, int level, Senjata senjata) {
        this.nama = nama;
        this.health = health;
        this.level = level;
        this.senjata = senjata;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public Senjata getSenjata() {
        return senjata;
    }
    public void setSenjata(Senjata senjata) {
        this.senjata = senjata;
    }
    public void menyerang() {
        System.out.println(this.nama + 
            " menyerang dengan " + 
            senjata.getNama() + 
            " (Power: " + senjata.getPower() + ")");
    }
}