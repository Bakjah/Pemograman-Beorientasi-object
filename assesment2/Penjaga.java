
public class Penjaga extends Pegawai {
    private String SesiMasuk;

    public Penjaga(String Nama, String alamat, String telepon, String SesiMasuk) {
        super(Nama, alamat, telepon);
        this.SesiMasuk = SesiMasuk;
    }

    public void setSesiMasuk(String SesiMasuk) {
        this.SesiMasuk = SesiMasuk;
    }

    public void addOrder(String idOrder) {
        super.addOrder(idOrder);
    }

    public void displayOrder() {
        System.out.println("Karyawan toko: " + getNama());
        System.out.println("Data order yang diterima:");
        for (String idOrder : getIdOrders()) {
            System.out.println("ID order: " + idOrder);
        }
    }

    public void setNamaPenjaga(String Nama) {
        setNama(Nama);
    }

    public String GetNamaPenjaga() {
        return getNama();
    }

    public String setAlamatPenjaga(String alamat) {
        setAlamat(alamat);
        return alamat;
    }

    public String getSesiMasuk() {
        return SesiMasuk;
    }
}
