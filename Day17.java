import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         // Membuat Operator Penugasan
         int a = 49;
         System.out.printf("%-15s: %d\n","Nilai A ", a);
         int b = 51;
         System.out.printf("%-15s: %d\n","Nilai B ", b);

         // (+=)
         System.out.printf("%-15s: ","Masukkan Nilai ");
         a+= input.nextInt();
         System.out.printf("%-15s: %d\n","Hasil Nilai A ", a);
         System.out.printf("%-15s: ","Masukkan Nilai ");
         b+= input.nextInt();
         System.out.printf("%-15s: %d\n","Hasil Nilai B ", b);
         System.out.printf("Nilai A = %d | B = %d \n\n", a, b);

         // (-=)
         System.out.printf("%-15s: ","Masukkan Nilai ");
         a-= input.nextInt();
         System.out.printf("%-15s: %d\n","Hasil Nilai A ", a);
         System.out.printf("%-15s: ","Masukkan Nilai ");
         b-= input.nextInt();
         System.out.printf("%-15s: %d\n","Hasil Nilai B ", b);
         System.out.printf("Nilai A = %d | B = %d \n\n", a, b);

         // (*=)
         System.out.printf("%-15s: ","Masukkan Nilai ");
         a*= input.nextInt();
         System.out.printf("%-15s: %d\n","Hasil Nilai A ", a);
         System.out.printf("%-15s: ","Masukkan Nilai ");
         b*= input.nextInt();
         System.out.printf("%-15s: %d\n","Hasil Nilai B ", b);
         System.out.printf("Nilai A = %d | B = %d \n\n", a, b);

         // (/=)
         System.out.printf("%-15s: ","Masukkan Nilai ");
         a/= input.nextInt();
         System.out.printf("%-15s: %d\n","Hasil Nilai A ", a);
         System.out.printf("%-15s: ","Masukkan Nilai ");
         b/= input.nextInt();
         System.out.printf("%-15s: %d\n","Hasil Nilai B ", b);
         System.out.printf("Nilai A = %d | B = %d \n\n", a, b);

         // (%=)
         System.out.printf("%-15s: ","Masukkan Nilai ");
         a%= input.nextInt();
         System.out.printf("%-15s: %d\n","Hasil Nilai A ", a);
         System.out.printf("%-15s: ","Masukkan Nilai ");
         b%= input.nextInt();
         System.out.printf("%-15s: %d\n","Hasil Nilai B ", b);
         System.out.printf("Nilai A = %d | B = %d \n\n", a, b);

        System.out.printf("%-15s: %d\n","Nilai akhir a ", a);
        System.out.printf("%-15s: %d\n","Nilai akhir b ", b);
        input.close();
    }
}
