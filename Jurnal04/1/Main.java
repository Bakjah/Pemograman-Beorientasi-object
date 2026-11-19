public class Main {
    public static void main(String[] args) {
        Senjata gohei = new Senjata("Gohei", 50);
        Pahlawan reimu = 
        new Pahlawan("Reimu", 100, 1, gohei);

        reimu.menyerang();
        reimu.getSenjata().upgrade(20);
        reimu.menyerang();
    }
}