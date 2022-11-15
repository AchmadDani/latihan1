import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, n;
        a = input.nextInt();
        n = input.nextInt();
        System.out.println(faktorial(a, n));
    }
    private static int faktorial(int a, int n) {
        if (n == 1) {
            return 3;
        } else {
            return faktorial(a, n-1) * a;
        }
    }
}

/* 1! = 1 base case
 * 5! = 5x4x3x2x1
 * 6! = 6x5x4x3x2x1
 * a! = (a-1!) * 1
 * 
 */