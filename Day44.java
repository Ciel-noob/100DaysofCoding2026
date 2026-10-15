import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai (0-100): ");
        int a = in.nextInt();

        if (a < 0 || a > 100) {
            System.out.println("Nilai harus berada di antara 0 dan 100.");
        } else if (a >= 80) {
            System.out.println("Predikat: A");
        } else if (a >= 70) {
            System.out.println("Predikat: B");
        } else if (a >= 60) {
            System.out.println("Predikat: C");
        } else if (a >= 50) {
            System.out.println("Predikat: D");
        } else {
            System.out.println("Predikat: E");
        }

        in.close();
    }
}
