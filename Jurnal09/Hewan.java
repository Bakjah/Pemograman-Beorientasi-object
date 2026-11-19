public abstract class Hewan implements Perawatan {
    protected String nama;
    private long stokPakan;

    public Hewan(String nama, long stokPakanAwal) {
        this.nama = nama;
        this.stokPakan = stokPakanAwal;
    }

    @Override
    public void tambahPakan(long jumlahKg) {
        if (jumlahKg <= 0) {
            System.out.println("Penambahan pakan " + nama + " tidak dapat dilakukan: jumlah tidak valid.");
            return;
        }
        stokPakan += jumlahKg;
        System.out.println("Pakan " + nama + " ditambah " + jumlahKg + " kg. Stok sekarang: " + stokPakan + " kg.");
    }

    @Override
    public boolean beriPakan(long jumlahHari) {
        if (jumlahHari <= 0) {
            System.out.println("Pemberian pakan " + nama + " tidak dapat dilakukan: jumlah hari tidak valid.");
            return false;
        }
        long kebutuhan = kebutuhanPakanHarian() * jumlahHari;
        if (kebutuhan > stokPakan) {
            System.out.println("Pemberian pakan " + nama + " tidak dapat dilakukan: stok pakan tidak cukup (butuh "
                    + kebutuhan + " kg, tersedia " + stokPakan + " kg).");
            return false;
        }
        stokPakan -= kebutuhan;
        System.out.println("Siapkan pakan " + nama + ": " + kebutuhan + " kg pakan buat "
                + jumlahHari + " hari. Sisa stok: " + stokPakan + " kg.");
        return true;
    }

    @Override
    public long getStokPakan() {
        return stokPakan;
    }

    public abstract long kebutuhanPakanHarian();

    public abstract String getJenis();

    public void tampilkanInfo() {
        System.out.println("[" + getJenis() + "] " + nama
                + " | Pakan harian: " + kebutuhanPakanHarian() + " kg"
                + " | Stok pakan: " + getStokPakan() + " kg");
    }
}
