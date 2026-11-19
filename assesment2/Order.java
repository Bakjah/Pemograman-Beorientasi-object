public class Order implements Pembayaran{
    protected String idOrder;
    protected String namaPembeli;
    protected String item;
    protected int jumlah;
    protected String harga;
    protected String alamatKirim;

    public Order(String idOrder, String namaPembeli, String item, int jumlah, String harga, String alamatKirim) {
        this.idOrder = idOrder;
        this.namaPembeli = namaPembeli;
        this.item = item;
        this.jumlah = jumlah;
        this.harga = harga;
        this.alamatKirim = alamatKirim;
    }

    public String getIdOrder() {
        return idOrder;
    }

    public void invoice() {
        System.out.println("INVOICE\nPT Sumber Makmur");        
        System.out.println("Pembelian Barang " + item);
        System.out.println("Jumlah: " + jumlah);
    }

    public void invoicePO() {
        System.out.println("INVOICE\nPT Sumber Makmur");        
        System.out.println("Pre-order Item: " + item);
        System.out.println("Jumlah: " + jumlah);
    }

    public int totalBayar(int jumlah, int harga) {
        return harga * jumlah;
    }
}
