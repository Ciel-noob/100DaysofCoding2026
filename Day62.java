import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int b = in.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int k = in.nextInt();

        if (b <= 0 || k <= 0) {
            System.out.println("Jumlah baris dan kolom harus lebih dari 0.");
            in.close();
            return;
        }

        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        in.close();
    }
}
