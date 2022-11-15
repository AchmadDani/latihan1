import java.util.Scanner;

public class Perpangkatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        int pangkat = input.nextInt();
        System.out.println(pangkat(angka, pangkat));
    }
    private static int pangkat(int angka, int pangkat) {
        if (pangkat == 1) {
            return angka;
        } else {
            return pangkat(angka, pangkat-1) * angka;
        }
    }
}