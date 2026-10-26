import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan batas angka(batas<=100): ");
        int batas = in.nextInt();

        // return kembali
        if (batas <= 0) {
            System.out.println("Batas harus lebih dari 0. Program dihentikan.");
            in.close();
            return;
        }

        // continue melewati 
        System.out.println("Angka kelipatan 2 (continue):");
        for (int i = 1; i <= batas; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // break berhentikan loop 
        System.out.println("Loop berhenti saat mencapai 100 (break):");
        for (int i = 1; i <= batas; i++) {
            if (i == 100) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        in.close();
    }
}
