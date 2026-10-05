import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>0&&a%2 == 0) {
            System.out.println("Positif Genap");
        } else if (a>0&&a%2 != 0) {
            System.out.println("Positif Ganjil");
        } else if (a<0&&a%2 == 0) {
            System.out.println("Negatif Genap");
        } else if (a<0&&a%2 != 0) {
            System.out.println("Negatif Ganjil");
        } else {
            System.out.println("Bukan bilangan positif atau negatif");
        }
       in.close();
    }
}
