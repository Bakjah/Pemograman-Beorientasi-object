import java.util.ArrayList;

public class Pegawai {
    private String nama;
    private String alamat;
    private String telepon;
    private ArrayList<String> idOrders = new ArrayList<>();

    public Pegawai(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public void addOrder(String idOrder) {
        idOrders.add(idOrder);
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public ArrayList<String> getIdOrders() {
        return idOrders;
    }

    public void setIdOrders(ArrayList<String> idOrders) {
        this.idOrders = idOrders;
    }
}