import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.printf("%-25s: ","Masukkan Nilai Pertama ");
        int a = in.nextInt();
        System.out.printf("%-25s: ","Masukkan Nilai Kedua ");
        int b = in.nextInt();
        System.out.println("Nilai Angka Pertama > Dari Angka Kedua? : " + (a>=b));
        System.out.println("Nilai Angka Pertama < Dari Angka Kedua? : " + (a<=b));
    }
}
