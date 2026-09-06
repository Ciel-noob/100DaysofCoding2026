public class Day5 {
    public static void main(String[] args) {
        //Double 
        double hargaVeneno = 150_000_000_000.;
        double berat = 1_450.;

        System.out.printf("Harga Veneno: Rp%,.0f%n", hargaVeneno);
        System.out.printf("Berat Veneno: %.0f kg%n", berat);

        //Float
        float jarak = 150;
        float kecepatan = 50;
        float waktu = jarak / kecepatan;

        System.out.println("Jarak: " + jarak + " m");
        System.out.println("Kecepatan: " + kecepatan + " m/s");
        System.out.println("Waktu: " + waktu + " s");

    }
}