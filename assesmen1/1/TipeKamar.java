public enum TipeKamar {
    STANDAR(75000),
    DELUXE(100000),
    ROYAL(125000);

    private final double tarifPerHari;

    TipeKamar(double tarifPerHari) {
        this.tarifPerHari = tarifPerHari;
    }

    public double getTarifPerHari() {
        return tarifPerHari;
    }

    public static TipeKamar dariString(String teks) {
        if (teks == null) {
            throw new IllegalArgumentException("Tipe kamar tidak boleh kosong");
        }
        for (TipeKamar t : values()) {
            if (t.name().equalsIgnoreCase(teks.trim())) {
                return t;
            }
        }
        throw new IllegalArgumentException("Tipe kamar tidak dikenal: " + teks + " (pilih: standar, deluxe, royal)");
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
