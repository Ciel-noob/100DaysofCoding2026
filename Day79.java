import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Angka: ");
        int jumlah = in.nextInt();
        int[] angka = new int[jumlah];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan Angka ke-"+(i + 1)+": ");
            angka[i] = in.nextInt();
            System.out.println("Indeks " + i + ": " + angka[i]);
        }
        in.close();
    }
}
