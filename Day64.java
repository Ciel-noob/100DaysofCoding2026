import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan batas bilangan (0-20): ");
        int b = in.nextInt();
        if (b<=0||b>20) {
            System.out.println("Batas di rentang 0-20.");
            in.close();
            return;
        }
        for (int i = 1; i <= b; i++) {
            long faktorial = 1;
            for (int pengali = 1; pengali <= i; pengali++) {
                faktorial *= pengali;
            }
            System.out.println(i + "! = " + faktorial);
        }
        in.close();
    }
}

