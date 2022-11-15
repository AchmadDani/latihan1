import java.util.Scanner;

public class rekursif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        int pangkat = input.nextInt();
        System.out.println(perkalian(angka, pangkat));
    }
    private static int perkalian(int angka, int pangkat) {
        if (pangkat == 1) {
            return angka;
        } else {
            return perkalian(angka, pangkat-1) *angka;
        }
    }
}

// 2, 3
/* 3^5
 * (3, 5-1) * 3
 * (3, 4) * 3
 * (3 3 3 3 ) * 3

/* 3^0 = 1 Base Case
 * 3^1 = 3x1
 * 3^2 = 3x3
 * 3^3 = 3x3x3
 * 3^4 = 3x3x3 x3
 * a^b = a^b-1 * a  recursif
 * 
 * a = angka
 * b = pangkat
 * 
 * 3^5 = 3^5-1 * 3
       = 3^4 * 3
       = 243
 */

 /* 1 * 1 = 1 base case
 * 1 * 2 = 2   1+1
 * 1 * 3 = 3   2+1
 * a * b = b   b+a
 * 
 * 3 * 1 = 3  3+1
 * 3 * 2 = 6  3+3
 * 3 * 3 = 9  3+3+3
 * 3 * 4 = 12 3*3 + 3
 * a * b = a(b-1) + a
 */