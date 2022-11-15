import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        if (a % 1 == 0 || a % a == 0) {
            System.out.println("bilangan prima");
        } else {
            System.out.println("bukan bilangan prima");
        }
    }
    
}
