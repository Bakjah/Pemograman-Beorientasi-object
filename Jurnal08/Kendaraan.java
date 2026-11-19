public class Kendaraan{
    protected String nama;
    protected int speed;

    public Kendaraan(String nama, int speed) {
        this.nama = nama;
        this.speed = speed;
    }

    public void move(){
        System.out.printf("Kendaraan %s bergerak dengan kecepatan %d km/jam.\n", nama, speed);
    }

    public void move(String manuver){
        System.out.printf("Kendaraan %s melakukan manuver %s dengan kecepatan %d km/jam\n", nama, manuver, speed * 2);
    }
}