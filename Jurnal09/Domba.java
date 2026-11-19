public class Domba extends Hewan implements PenghasilSusu, PenghasilWol {
    private int produksiSusuHarian;
    private double produksiWolPerCukur;

    public Domba(String nama, long stokPakanAwal, int produksiSusuHarian, double produksiWolPerCukur) {
        super(nama, stokPakanAwal);
        this.produksiSusuHarian = produksiSusuHarian;
        this.produksiWolPerCukur = produksiWolPerCukur;
    }

    @Override
    public long kebutuhanPakanHarian() {
        return 3;
    }

    @Override
    public String getJenis() {
        return "Domba";
    }

    @Override
    public double ProduksiSusuHarian() {
        return produksiSusuHarian;
    }

    @Override
    public double produksiWolPerCukur() {
        return produksiWolPerCukur;
    }
}
