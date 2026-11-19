public interface Pembayaran {
    void invoice();

    int totalBayar(int jumlah, int harga);
}
