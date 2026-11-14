import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = in.nextLine();

        System.out.println("Panjang teks: " + teks.length());
        System.out.println("Huruf kapital: " + teks.toUpperCase());
        System.out.println("Huruf kecil: " + teks.toLowerCase());

        in.close();
    }
}