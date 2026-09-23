public class Kerucut {
    private double jariJari, tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double hitungLuasPermukaan() {
        double s = Math.sqrt(jariJari * jariJari + tinggi * tinggi);
        return Math.PI * jariJari * (jariJari + s);
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * tinggi;
    }
}