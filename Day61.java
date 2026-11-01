import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n<=0){
            System.out.println("Gagal");
            return;
        }
        long fak = 1;
        for (int i = 1; i <= n; i++) {
            fak*=i;
            System.out.print(fak+" ");
        }System.out.println();
        System.out.println("Faktorial: "+fak);
        in.close();
    }
}
