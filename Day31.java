import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nilai Pertama: ");
        int a = in.nextInt();
        System.out.print("Masukkan Nilai Kedua: ");
        int b = in.nextInt();
        System.out.print("Masukkan Nilai Ketiga: ");
        int c = in.nextInt();
        
        System.out.printf("Kedua angka lebih besar dari ketiga? (AND): %B\n", (a > c && b > c));
        System.out.printf("Salah satu angka lebih besar dari ketiga? (OR): %B\n", (a > c || b > c));
        System.out.printf("Nilai Not && : %B\n",!(a>c&&b>c));
        System.out.printf("Nilai Not || : %B\n",!(a>c||b>c));
        in.close();
    }
}
