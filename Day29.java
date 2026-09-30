import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int a = in.nextInt();
        System.out.print("Masukkan Nilai: ");
        int b = in.nextInt();
        System.out.printf("Nilai Angka Pertama > Dari Angka Kedua? : %B\n",(a>b));
        System.out.printf("Nilai Angka Pertama < Dari Angka Kedua? : %B\n",(a<b));
    }
}
