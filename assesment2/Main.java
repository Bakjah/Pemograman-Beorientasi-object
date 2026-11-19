public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("A001", "Asep", "Hand Sanitizer", 10, "20000", "Sukajadi");
        Order order2 = new Order("A002", "Ita", "Masker Wangi", 100, "1500", "Setiabudi");
        PreOrder order3 = new PreOrder("B001", "Rina", "Hair Mask", 2, "50000", "Cikoneng", "1 Desember 2023", "25000");

        order1.invoice();
        System.out.println("Total Bayar: " + order1.totalBayar(order1.jumlah, Integer.parseInt(order1.harga)));
        System.out.println();

        order2.invoice();
        System.out.println("Total Bayar: " + order2.totalBayar(order2.jumlah, Integer.parseInt(order2.harga)));
        System.out.println();

        order3.invoicePO();
        System.out.println("DP yang sudah dibayar: " + order3.getUangMuka());
        System.out.println("Sisa Bayar: " + order3.totalBayar(order3.jumlah, Integer.parseInt(order3.harga)));
        System.out.println("Tanggal kirim: " + order3.getTanggalKirim());
        System.out.println();

        Penjaga penjaga = new Penjaga("Rita", "Jl. Toko No. 1", "081200000001", "Pagi");
        penjaga.addOrder(order1.getIdOrder());
        penjaga.addOrder(order2.getIdOrder());
        penjaga.addOrder(order3.getIdOrderPO());
        penjaga.displayOrder();
        System.out.println();

        Kurir kurir1 = new Kurir("Dudi", "Jl. Kurir No. 789", "08123456789", "Cikoneng-ciwastra");
        kurir1.addOrder(order1.getIdOrder());
        kurir1.addOrder(order2.getIdOrder());
        kurir1.displayOrder();
        System.out.println();

        Kurir kurir2 = new Kurir("Riki", "Jl. Kurir No. 101", "08234567890", "Sitabudi");
        kurir2.addOrder(order3.getIdOrder());
        kurir2.displayOrder();
    }
}
