public class MainOverload {

    public static void main(String[] args) {
        System.out.println("main(String[] args) dipanggil oleh JVM");

        main(12);
        main("Halo", "Dunia");
        main(3.14);
    }

    public static void main(int angka) {
        System.out.println("main(int) dipanggil dengan angka = " + angka);
    }

    public static void main(String s1, String s2) {
        System.out.println("main(String, String) dipanggil dengan: " + s1 + " " + s2);
    }

    public static void main(double d) {
        System.out.println("main(double) dipanggil dengan double = " + d);
    }
}