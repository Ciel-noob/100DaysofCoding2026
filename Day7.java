public class Day7 {
    public static void main(String[] args) {
        String k1 = "\"Reader\"";
        String k2 ="This Story is For That One";
        String k3 = "A Reader remains A ";

        System.out.println("The Best Line in ORV: " + k2 + " " + k1);

        String gabung = k2 + " " + k1;
        System.out.println(gabung);
        String gabung2 = k3 + k1;
        System.out.println(gabung2);

        int panjang = gabung.length();
        System.out.println("Panjang string: " + panjang);

        char hurufPertama = k3.charAt(0);
        System.out.println("Huruf pertama: " + hurufPertama);
    }
}
