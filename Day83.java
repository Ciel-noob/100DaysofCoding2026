import java.util.Scanner;

public class Day83 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan jumlah array: ");
        int a = in.nextInt();
        int b [] = new int[a];
        int total=0;

        System.out.println("=== INPUT ANGKA ===");
        for (int i = 0; i < b.length; i++) {
            System.out.print("Masukan angka ke-"+ (i + 1)+": ");
            b[i] = in.nextInt();
            
        }
        System.out.println("\n=== DATA ARRAY ===");
        for (int i = 0; i < b.length; i++) {
            System.out.println("Index ke-"+i+" = "+b[i]);
            total+=b[i];
            
        }
        System.out.println("Total: "+total);
        in.close();
    }
}
