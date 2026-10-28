import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n<=0){
            System.out.println("Gagal");
            return;
        }

        for (int i = 1; i<=n; i++){
            if (n%2==0&&i%2==0){
                System.out.print(i+" ");
            }else if (n%2!=0&&i%2!=0){
                System.out.print(i+" ");
        }
    }
}
}
