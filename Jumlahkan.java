import java.util.Scanner;

public class Jumlahkan {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = jumlahkan(a, b);
        System.out.println(c);
    }
    private static int jumlahkan(int a, int b) {
        return a + b;
    }
}
