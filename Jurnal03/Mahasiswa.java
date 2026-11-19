public class Mahasiswa {
    private String nim;
    private String nama;
    private String kelas;
    private static String prodi;

    public Mahasiswa() {
        
    }

    public Mahasiswa(String nim, String nama, String kls, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kls;
        this.prodi = prodi;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public static String getProdi() {
        return prodi;
    }

    @Override 
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", kelas='" + kelas + '\'' +
                ", prodi='" + prodi + '\'' +
                '}';
    }
}