public class PesawatJet extends Kendaraan {
    private int machLevel;

    public PesawatJet(String nama, int speed, int machLevel){
        super(nama, speed);
        this.machLevel = machLevel;
    }

    @Override 
    public void move(){
        System.out.printf("Pesawat jet %s berterbang dengan kecepatan %d km/jam\n", nama, speed);
    }

    @Override 
    public void move(String manuver){
        System.out.printf("Pesawat jet %s melakukan manuver %s dengan kecepatan %d km/jam\n", nama, manuver, speed * machLevel);
    }
}
