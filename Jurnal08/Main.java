public class Main{
    public static void main(String[] args) {
        MobilSport car1 = new MobilSport("BMW M4", 80, 1.5);
        PesawatJet plane1 = new PesawatJet("Ford Mustang", 1000, 3);
        KapalSelam submarine1 = new KapalSelam("Mazda RX8", 60, false);
        KapalSelam submarine2 = new KapalSelam("Ninja", 40, true);
        Kendaraan moge = new Kendaraan("Lamborghini", 200);

        car1.move();
        plane1.move();
        submarine1.move();
        submarine2.move();
        moge.move();

        System.out.println();

        car1.move("Scandanavian Flick");
        plane1.move("Barrel Roll");
        submarine1.move("Deep Dive");
        submarine2.move("Stealth Dive");
        moge.move("High Speed Wheelie");
    }
}