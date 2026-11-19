import java.util.ArrayList;

public class Pemilik {
    private String noKtp;
    private String nama;
    private String alamat;
    private ArrayList<Kucing> listKucing;

    public Pemilik(String noKtp, String nama, String alamat) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.alamat = alamat;
        this.listKucing = new ArrayList<>();
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public ArrayList<Kucing> getListKucing() {
        return listKucing;
    }

    public void tambahKucing(Kucing kucing) {
        if (kucing == null) {
            throw new NullPointerException("Data kucing tidak boleh null");
        }
        listKucing.add(kucing);
    }

    public void tampilkanKucing() {
        System.out.println("Pemilik : " + nama + " (" + noKtp + ")");
        System.out.println("Alamat  : " + alamat);
        System.out.println("========================================");
        for (Kucing k : listKucing) {
            System.out.println(" Data kucing");
            Penitipan p = k.getPenitipan();
            if (p == null) {
                System.out.println("Nama Kucing : " + k.getNama());
                System.out.println("Kategori : " + k.getKategori());
                System.out.println("Berat : " + k.getBerat());
                System.out.println("Status : belum dititipkan");
                try {
                    k.hitungBiayaPerawatan();
                } catch (IllegalStateException e) {
                    System.out.println("Error : " + e.getMessage());
                }
            } else {
                System.out.println("kode penitipan : " + p.getKode());
                System.out.println("Nama Kucing : " + k.getNama());
                System.out.println("Kategori : " + k.getKategori());
                System.out.println("Berat : " + k.getBerat());
                System.out.println("Tipe Kamar : " + p.getTipeKamar());
                System.out.println("Lama Titip : " + p.getLamaTitip() + " hari");
                System.out.println("Jumlah Makan : " + p.getJumlahMakan() + " porsi");
                System.out.println("biaya titip : " + (long) k.hitungBiayaTitip());
            }
            System.out.println();
            
        }
    }
}