public enum KategoriKucing {
    KITTEN(20000),
    ADULT(30000),
    SENIOR(50000);

    private final double biayaMakan;

    KategoriKucing(double biayaMakan) {
        this.biayaMakan = biayaMakan;
    }

    public double getBiayaMakan() {
        return biayaMakan;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
