import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Soal 1
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if (y > x) {
            x++;
        }
        if (z > x) {
            x += 2;
        }
        if (y < x) {
            x--;
        }
        if (z < x) {
            x -= 2;
        }
        System.out.println(x);

        double iAmAFool = in.nextDouble();
        if(iAmAFool%1==0){
            if(iAmAFool%2==0){
                System.out.println("Bulat Genap");
            }else{
                System.out.println("Bulat Ganjil");
            }
        }else{
            System.out.println("Pecahan");
        }
        if(iAmAFool>0){
            System.out.println("Positif");
        }else if(iAmAFool<0){
            System.out.println("Negatif");
        }
        if(iAmAFool>=0 && iAmAFool%1==0){
            System.out.println("Natural/Cacah");
        }

        int dumbHeadFailure = in.nextInt();
        for(int suchAFool=1; suchAFool<=dumbHeadFailure; suchAFool++){
            if((suchAFool%3==0||suchAFool%4==0)
                && !(suchAFool%3==0&&suchAFool%4==0)){
            System.out.print(suchAFool+" ");
            }
        }
    }
}
