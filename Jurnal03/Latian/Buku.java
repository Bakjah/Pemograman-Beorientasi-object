public class Buku {
    private String judul;
    private String pengarang;
    private String isbn;
    
    public Buku() {

    }

    public Buku(String judul, String pengarang, String isbn) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override 
    public String toString() {
        return "Buku{" +
                "judul='" + judul + '\'' +
                ", pengarang='" + pengarang + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}