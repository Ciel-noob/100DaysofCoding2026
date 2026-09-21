import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-20s: ","Masukkan Nilai ");
        int a = input.nextInt();
        String b = String.valueOf(a);
        System.out.printf("%-20s: ","Masukkan Nilai ");
        double c = input.nextDouble();
        String d = String.valueOf(c);
        System.out.printf("%-20s: ","Am I Kim Dokja? ");
        boolean status = input.nextBoolean();
        System.out.printf("\n\n");
        
        System.out.printf("%-20s: %s\n","Nilai Int ", a);
        System.out.printf("%-20s: %s\n","Nilai String", b);
        System.out.printf("%-20s: %.1f\n","Nilai Double", c);
        System.out.printf("%-20s: %s\n","Nilai ", d);
        if (status) {
            System.out.println("You Have An Interesting Opinion My Brotherr");
        } else {
            System.out.println("What Makes You To Think Like That My Brotherr");
        }
        input.close();
    }
}
