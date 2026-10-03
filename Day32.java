import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nilai Pertama: ");
        int a = in.nextInt();
        System.out.print("Masukkan Nilai Kedua: ");
        int b = in.nextInt();
        System.out.println();

        System.out.printf("Nilai pertama sama dengan nilai kedua? : %B\n", a == b);
        System.out.printf("Nilai pertama tidak sama dengan nilai kedua? : %B\n", a != b);
        System.out.printf("Nilai pertama lebih besar dari nilai kedua? : %B\n", a > b);
        System.out.printf("Nilai pertama lebih kecil dari nilai kedua? : %B\n", a < b);
        System.out.printf("Nilai pertama lebih besar atau sama dengan nilai kedua? : %B\n", a >= b);
        System.out.printf("Nilai pertama lebih kecil atau sama dengan nilai kedua? : %B\n", a <= b);
        System.out.println();

        System.out.printf("Kedua nilai sama dan nilai pertama positif? : %B\n", a == b && a > 0);
        System.out.printf("Nilai pertama negatif atau kedua nilai berbeda? : %B\n", a < 0 || a != b);
        System.out.printf("Nilai pertama tidak lebih kecil atau sama dengan nilai kedua? : %B\n", !(a <= b));

        in.close();
    }
}
