public class MobilSport extends Kendaraan {
    private double nitroBonus;
    
    public MobilSport(String nama, int speed, double nitroBonus){
        super(nama, speed);
        this.nitroBonus = nitroBonus;
    }

    @Override 
    public void move(){
        System.out.printf("Mobil sport %s melaju dengan kecepatan %d km/jam\n", nama, speed);
    }

    @Override 
    public void move(String manuver){
        System.out.printf("Mobil sport %s melakukan manuver %s dengan kecepatan %.1f km/jam\n", nama, manuver, speed * nitroBonus);
    }
}
