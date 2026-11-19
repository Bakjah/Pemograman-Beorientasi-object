public class KapalSelam extends Kendaraan {
    private boolean isStealthActive;

    public KapalSelam(String nama, int speed, boolean isStealthActive) {
        super(nama, speed);
        this.isStealthActive = isStealthActive;

    }
    @Override 
    public void move(){
        System.out.printf("Kapal selam %s menyelam dengan kecepatan %d km/jam\n", nama, speed);
    }

    @Override 
    public void move(String manuver){
        System.out.printf("Kapal selam %s melakukan manuver %s dengan kecepatan %.1f km/jam | Mode senyap? %s\n", nama, manuver, speed * ((isStealthActive) ? 10 : 0.5), ((isStealthActive) ? "Ya" : "Tidak"));
    }
}
