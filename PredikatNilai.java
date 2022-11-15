import java.util.Scanner;

public class PredikatNilai {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nilai = s.nextLine();

        switch (nilai) {
            case "A": System.out.println("Excellen"); break;
            case "B": System.out.println("Good");
            case "C": System.out.println("Avarage"); break;
            case "D": System.out.println("Fail"); break;
        }
        
    }
}
