import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        System.out.print("Angka Pertama: ");
        double a1 = in.nextDouble();
        System.out.print(" Operator (+, -, *, /): ");
        char o = in.next().charAt(0);
        System.out.print("Angka Kedua: ");
        double a2 = in.nextDouble();

        switch (o) {
            case '+':
                System.out.printf("Hasil: %.0f%n", a1 + a2);
                break;
            case '-':
                System.out.printf("Hasil: %.0f%n", a1 - a2);
                break;
            case '*':
                System.out.printf("Hasil: %.0f%n", a1 * a2);
                break;
            case '/':
                if (a2 == 0) {
                    System.out.printf("Error: tidak bisa membagi dengan nol.%n");
                } else {
                    System.out.printf("Hasil: %.0f%n", a1 / a2);
                }
                break;
            default:
                System.out.printf("Operator tidak valid.%n");
        }

        in.close();
    }
}
