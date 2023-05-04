abstract class BangunDatar {
    abstract double hitungLuas();
}

class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }
}

public class BangunDatar1 {
    public static void main(String[] args) {
        BangunDatar[] bangunDatar = new BangunDatar[1];
        bangunDatar[0] = new Persegi(5);

        for (BangunDatar bangun : bangunDatar) 
            System.out.println("Luas: " + bangun.hitungLuas());
        
    }
}
