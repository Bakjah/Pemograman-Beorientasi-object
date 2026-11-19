public interface PenghasilSusu {
    double ProduksiSusuHarian();

    default String getLabelSusu() {
        return "Perkiraan susu: " + ProduksiSusuHarian() + " liter per hari";
    }
}
