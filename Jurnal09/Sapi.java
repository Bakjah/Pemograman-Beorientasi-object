public class Sapi extends Hewan implements PenghasilSusu {
    private int produksiSusuHarian;

    public Sapi(String nama, long stokPakanAwal, int produksiSusuHarian) {
        super(nama, stokPakanAwal);
        this.produksiSusuHarian = produksiSusuHarian;
    }

    @Override
    public long kebutuhanPakanHarian() {
        return 20;
    }

    @Override
    public String getJenis() {
        return "Sapi";
    }

    @Override
    public double ProduksiSusuHarian() {
        return produksiSusuHarian;
    }
}
