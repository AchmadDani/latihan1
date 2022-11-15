import java.util.Scanner;

public class SapaNama {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nama1 = s.nextLine();
        String nama2 = s.nextLine();

        // System.out.println("Hai, " + nama1 + ". Semangat pagi");
        // System.out.println("Hai, " + nama2 + ". Semangat pagi");
    
        hai(nama1);
        hai(nama2);
    }
    
    private static void hai(String name) {
        System.out.println("Hai, " + name + ". Semangat pagi");
    }
}
