import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 1;

        do {
            System.out.println("Lakukan Dulu, If Kondisi Sesuai, Loop");
            b++;
        } while (b <= a);

        b = 1;
        do {
            System.out.println("Zhong Li Last Contract At 7.2 GI!!!!");
            b++;
        } while (b <= a);

        in.close();
    }
}
