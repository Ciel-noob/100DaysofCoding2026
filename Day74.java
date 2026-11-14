import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Teks: ");
        String teks = in.nextLine();

        System.out.println("Panjang Teks: " + teks.length());
        System.out.println("Huruf Kapital: " + teks.toUpperCase());
        System.out.println("Huruf Kecil: " + teks.toLowerCase());
        in.close();
    }
}
