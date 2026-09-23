import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%-20s: ", "Masukkan int A");
        int a = in.nextInt();
        System.out.printf("%-20s: ", "Masukkan int B");
        int b = in.nextInt();

        System.out.printf("\n");
        System.out.printf("%-20s: %d\n", "Nilai Int A", a);
        System.out.printf("%-20s: %d\n", "Nilai Int B", b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("\n");
        System.out.printf("%-20s: %d\n", "Setelah swap A", a);
        System.out.printf("%-20s: %d\n", "Setelah swap B", b);

        in.close();
    }
}