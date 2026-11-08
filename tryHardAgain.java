import java.util.Scanner;

public class tryHardAgain {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
     int a = in.nextInt();
     int b = in.nextInt();
     int c = 0;

     for (int i = a+1; i<b;i++){
        if(i%2==0 && i%3==0){
            System.out.print(i+" ");
            c++;

        }
        
    }if(c==0){
        System.out.println("Tidak ada angka yang memenuhi syarat");
    }
    System.out.println("\n"+c);
}
}

