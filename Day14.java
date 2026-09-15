import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka 1: ");
        int a = input.nextInt();
        System.out.println("Masukkan Angka 2: ");
        int b = input.nextInt();

        int c = a + b;
        System.out.printf("%-15s: %s\n", "Angka 1 + Angka 2 = ", c);
        int d = a - b;
        System.out.printf("%-15s: %s\n", "Angka 1 - Angka 2 = ", d);
    }
}
