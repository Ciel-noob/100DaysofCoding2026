import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah array: ");
        int jumlah = in.nextInt();
        int[] angka = new int[jumlah];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            angka[i] = in.nextInt();
        }

        System.out.println("\nIsi array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + angka[i]);
        }

        in.close();
        }
}
