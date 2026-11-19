public interface PenghasilWol {
    double produksiWolPerCukur();

    default String getLabelWol() {
        return "Perkiraan wol: " + produksiWolPerCukur() + " kg per pencukuran";
    }
}
