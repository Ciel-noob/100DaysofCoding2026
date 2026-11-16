import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String teks = in.nextLine();
        System.out.print("Masukkan indeks awal substring: ");
        int awal = in.nextInt();
        System.out.print("Masukkan indeks akhir substring: ");
        int akhir = in.nextInt();
        in.nextLine();

        System.out.print("Masukkan teks yang ingin diganti: ");
        String teksLama = in.nextLine();
        System.out.print("Masukkan teks pengganti: ");
        String teksBaru = in.nextLine();

        System.out.println();
        if (awal >= 0 && awal <= akhir && akhir <= teks.length()) {
            System.out.println("Hasil substring: " + teks.substring(awal, akhir));
        } else {
            System.out.println("Indeks substring tidak valid.");
        }
        
        System.out.println("Hasil replace: " + teks.replace(teksLama, teksBaru));
        System.out.println("Hasil trim: " + teks.trim());

        in.close();
    }
}
