import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        ArrayList<Mahasiswa> listMhs = new ArrayList<>();

        Mahasiswa mhs1 = new Mahasiswa("12345", "John Doe", "D3IF-49-01", "Informatika");
        mhs1.getProdi();

        System.out.println(mhs1.toString());
    }
}
