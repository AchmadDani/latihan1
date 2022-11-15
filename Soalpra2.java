import java.util.Scanner;

public class Soalpra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int berat = sc.nextInt();
        double tinggi = sc.nextDouble() / 100;

        double bmi = berat / (tinggi * tinggi);

        if (bmi >= 18.5) {
            System.out.printf("Bmi anda adalah %.2f. termasuk kategori normal", bmi);
        }
    }
    
}
