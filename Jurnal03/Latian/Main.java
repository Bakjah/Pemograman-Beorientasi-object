import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Buku bk = new Buku();
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        
        Buku bk1 = new Buku("Buku A", "Pengarang A", "1234567890");
        System.out.println(bk1);
    }
}
