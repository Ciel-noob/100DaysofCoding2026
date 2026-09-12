import java.util.Scanner;
public class Day11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==== Biodata ====");
        System.out.println("Nama...");
        String nama = input.nextLine();
        System.out.println("Umur...");
        int umur = input.nextInt();
        System.out.println("Tinggi...");
        double tinggi = input.nextDouble();
        input.nextLine();
        System.out.println("Nama Your Bini My Kisah...");
        String istri = input.nextLine();
        System.out.println("Apakah Saya Kim Dokja? (true/false): ");
        boolean iAmMc = input.nextBoolean();

        System.out.printf("Nama saya %s,%nUmur saya %d tahun,%nTinggi saya %.2f cm,%n%s adalah My BINI GWEHH,%nGWEHH adalah Kim Dokja : %B\n", nama, umur, tinggi, istri, iAmMc);
        
    }
}
