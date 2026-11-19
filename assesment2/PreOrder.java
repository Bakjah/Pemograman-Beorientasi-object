public class PreOrder extends Order {
    private String tanggalKirim;
    private String uangMuka;

    public PreOrder(String idOrder, String namaPembeli, String item, int jumlah, String harga, String alamatKirim, String tanggalKirim, String uangMuka) {
        super(idOrder, namaPembeli, item, jumlah, harga, alamatKirim);
        this.tanggalKirim = tanggalKirim;
        this.uangMuka = uangMuka;
    }

    public String getTanggalKirim() {
        return tanggalKirim;
    }

    public void setTanggalKirim(String tanggalKirim) {
        this.tanggalKirim = tanggalKirim;
    }

    public String getUangMuka() {
        return uangMuka;
    }

    public void setUangMuka(String uangMuka) {
        this.uangMuka = uangMuka;
    }

    public int totalBayar(int jumlah, int harga) {
        int total = super.totalBayar(jumlah, harga);
        int uangMukaInt = Integer.parseInt(uangMuka);
        return total - uangMukaInt;
    }

    public String getIdOrderPO() {
        return idOrder;
    }

    @Override
    public void invoice() {
        super.invoice();
        System.out.println("DP yang sudah dibayar: " + uangMuka);
    }
    
}
