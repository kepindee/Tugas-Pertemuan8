import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Panjang: ");
        double panjang = sc.nextDouble();

        System.out.print("Masukkan Lebar: ");
        double lebar = sc.nextDouble();

        BangunDatar pp = new PersegiPanjang(panjang, lebar);
        System.out.println(pp.nama() + " " + pp.luas());

        System.out.print("Masukkan Panjang (alas segitiga): ");
        double alas = sc.nextDouble();

        System.out.print("Masukkan Tinggi: ");
        double tinggi = sc.nextDouble();

        BangunDatar segitiga = new Segitiga(alas, tinggi);
        System.out.println(segitiga.nama() + " " + segitiga.luas());

        System.out.print("Masukkan Sisi Persegi: ");
        double sisi = sc.nextDouble();

        BangunDatar persegi = new Persegi(sisi);
        System.out.printf("%s %.2f%n", persegi.nama(), persegi.luas());

        sc.close();
    }
}
