import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Array: ");
        int a = in.nextInt();
        int b[] = new int[a];
        System.out.println("=== INPUT ANGKA ===");
    
        for (int i = 0; i < b.length; i++) {
            System.out.print("Masukan Angka ke-"+(i+1)+": ");
            b[i]=in.nextInt();
        }
        System.out.println();
        boolean aUtama = false;
        while (!aUtama){
        System.out.print("Masukan Angka yang dicari: ");
        int cari = in.nextInt();
        
        int i = 0;
        while (i < b.length && b[i] != cari) {
            i++;
        }
        if (i < b.length) {
            System.out.println();
            System.out.println("Angka ditemukan pada Indeks:"+i);
            System.out.println("Nilai: "+b[i]);
            aUtama=true;
        }
        if (!aUtama) {
            System.out.println("Angka tidak di temukan");
            System.out.println("Silahkan coba lagi.");
            }  
        }
    in.close();
    }
}
