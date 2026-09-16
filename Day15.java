import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka Pertama: ");
        int a = input.nextInt();
        System.out.println("Masukkan Angka Kedua: ");
        int b = input.nextInt();

        System.out.println("Hasil: ");
        int c = a * b;
        System.out.printf("%15s%s\n","Angka Pertama x Angka Kedua = ", c);
        int d = a / b;
        System.out.printf("%15s%s\n", "Angka Pertama / Angka Kedua = ", d);
        input.close();
    }
}
