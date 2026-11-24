import java.util.Scanner;

public class Day84 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int nilai [] = new int[a];
        int tg = nilai[0];
        System.out.println("=== INPUTAN ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukan Angka ke-"+(i+1)+": ");
            nilai[i]=in.nextInt();
        }
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > tg) {
                tg = nilai[i];  
            }
            
        }
        System.out.println("\n=== OUTPUT ===");
        System.out.println("Angka Maksimal adalah: "+tg);
        in.close();
    }
}
