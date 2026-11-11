import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan Panjang Segitiga: ");
    int n = in.nextInt();
        
    for (int i = n; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            if (j == 1 || j == i || i == n) {
             System.out.print("+");
            } else {
            System.out.print(" ");
            } 
        }
        System.out.println();
    }
    in.close();
}
}

       