
public class Kurir extends Pegawai {
    private String WilayahAntar;

    public Kurir(String nama, String alamat, String telepon, String WilayahAntar) {
        super(nama, alamat, telepon);
        this.WilayahAntar = WilayahAntar;
    }

    public void addOrder(String idOrder) {
        super.addOrder(idOrder);
    }

    public void displayOrder() {
        System.out.println("Kurir: " + getNama());
        System.out.println("Wilayah antar: " + getWilayahAntar());
        System.out.println("Data order yang dikirim:");
        for (String idOrder : getIdOrders()) {
            System.out.println("ID order : " + idOrder);
        }
    }

    public String getWilayahAntar() {
        return WilayahAntar;
    }

    public void setWilayahAntar(String WilayahAntar) {
        this.WilayahAntar = WilayahAntar;
    }
    
}
