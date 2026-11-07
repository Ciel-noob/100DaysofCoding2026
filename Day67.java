import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Ukuran Persegi: ");
        int uk = in.nextInt();

        if (uk <= 0) {
            System.out.println("Ukuran Harus Lebih Besar dari 0.");
            in.close();
            return;
        }

        for (int i = 1; i <= uk; i++) {
            for (int j = 1; j <= uk; j++) {
                System.out.print("_ ");
            }
            System.out.println();
        }
        in.close();
    }
}
