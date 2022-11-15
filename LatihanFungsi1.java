import java.util.Scanner;

public class LatihanFungsi1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama1 = input.nextLine();
        String nama2 = input.nextLine();
        greeting(nama1);
        greeting(nama2);
    }
    private static void greeting(String nama) {
        System.out.println("Hai, " + nama + ". Semangat pagi");
    }
}
