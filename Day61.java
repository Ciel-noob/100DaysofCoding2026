import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = 1;
        for (int i = 1; i <= n; i++) {
            t*=i;
            System.out.print(t+" ");
        }System.out.println();
        System.out.println("Faktorial: "+t);
        in.close();
    }
}
