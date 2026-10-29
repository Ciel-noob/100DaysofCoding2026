import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n<=0){
            System.out.println("Aku Ngelag :))");
            return;
        }
        System.out.print("Bilangan Ganjil N-1\t: ");
        for (int i = n-1;i>=1;i--){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Bilangan Genap N-1\t: ");
        for (int i = n-1;i>=1;i--){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
