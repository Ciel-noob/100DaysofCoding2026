import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka Pertama: ");
        int a = input.nextInt();
        System.out.println("Masukkan Angka Kedua: ");
        int b = input.nextInt();

        int c = a + b;
        System.out.printf("%-15s: %s\n", "Angka Pertama + Angka Kedua = ", c);
        int d = a - b;
        System.out.printf("%-15s: %s\n", "Angka Pertama - Angka Kedua = ", d);
    }
}
