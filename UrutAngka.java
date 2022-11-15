import java.util.Scanner;

public class UrutanAngka{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka1 = input.nextInt();
        int angka2 = input.nextInt();
        int angka3 = input.nextInt();

        if (angka1 > angka2 && angka1 > angka3) {
            if (angka3 > angka2)
            System.out.println(angka1 + " > " + angka3 + " > " + angka2);
            else 
            System.out.println(angka1 + " > " + angka2 + " > " + angka3);
        }
        else if (angka2 > angka1 && angka2 > angka3) {
            if (angka1 > angka3)
            System.out.println(angka2 + " > " + angka1 + " > " + angka3);
            else 
            System.out.println(angka2 + " > " + angka3 + " > " + angka1);
        }
        else if (angka3 > angka1 && angka3 > angka2) {
            if (angka1 > angka2)
            System.out.println(angka3 + " > " + angka1 + " > " + angka2);
            else
            System.out.println(angka3 + " > " + angka2 + " > " + angka1);
        }
    }
}
