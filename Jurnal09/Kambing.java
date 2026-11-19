public class Kambing extends Hewan implements PenghasilSusu {
    private int produksiSusuHarian;

    public Kambing(String nama, long stokPakanAwal, int produksiSusuHarian) {
        super(nama, stokPakanAwal);
        this.produksiSusuHarian = produksiSusuHarian;
    }

    @Override
    public long kebutuhanPakanHarian() {
        return 3;
    }

    @Override
    public String getJenis() {
        return "Kambing";
    }

    @Override
    public double ProduksiSusuHarian() {
        return produksiSusuHarian;
    }

    @Override
    public String getLabelSusu() {
        return "Perkiraan susu kambing: " + ProduksiSusuHarian() + " liter per hari";
    }
}
