import java.util.Scanner;

public class LatihanFungsi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float suhuMin = s.nextFloat();
        float suhuAvrg = s.nextFloat();
        float suhuMax = s.nextFloat();

        System.out.println(suhuC(suhuMin));
        System.out.println(suhuC(suhuAvrg));
        System.out.println(suhuC(suhuMax));
    }

    private static float suhuC(float celcius) {
       return celcius = (celcius * 9/5 + 32);
    }
}
