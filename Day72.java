import java.util.Scanner;
public class Day72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = 0;

        for (;;) {
            System.out.print("Masukkan angka (angka negatif untuk berhenti): ");
            int angka = in.nextInt();

            if (angka < 0) {
                break;
            }

            for (int i = 0; i < angka; i++) {
                b++;
            }
        }

        System.out.println("Jumlah: " + b);
        in.close();
    }
}
