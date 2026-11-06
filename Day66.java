import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah Garis: ");
        int n = in.nextInt();
        for (int i= 1; i<=n; i++){
            System.out.print("_");
        }
        in.close();
    }
}
