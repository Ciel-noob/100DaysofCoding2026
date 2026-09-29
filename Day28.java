import java.util.Scanner;

public class Day28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a>=b){
            System.out.println("Gedehh");
        }else{
            System.out.println("Kecilll");
        }
        System.out.printf("Hasil == :%b\n",(a==b));
        System.out.printf("Hasil != :%b\n",(a!=b));
        in.close();
    }
}
