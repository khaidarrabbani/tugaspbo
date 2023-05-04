import java.util.Scanner;

class Segitiga {
   private double alas;
   private double tinggi;

   public void setAlas(double alas) {
      this.alas = alas;
   }

   public void setTinggi(double tinggi) {
      this.tinggi = tinggi;
   }

   public double hitungLuas() {
      return (alas * tinggi) / 2;
   }
}

public class segi3 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Masukkan panjang alas: ");
      double alas = input.nextDouble();

      System.out.print("Masukkan tinggi: ");
      double tinggi = input.nextDouble();

      Segitiga segitiga = new Segitiga();
      segitiga.setAlas(alas);
      segitiga.setTinggi(tinggi);

      double luas = segitiga.hitungLuas();

      System.out.println("Luas segitiga adalah " + luas);
   }
}
