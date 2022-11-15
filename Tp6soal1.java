import java.util.Scanner;

public class Tp6soal1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double suhuMin = s.nextDouble();
        double suhuAvrg = s.nextDouble();
        double suhuMax = s.nextDouble();

        suhuC(suhuMin);
        suhuC(suhuAvrg);
        suhuC(suhuMax);
    }

    private static void suhuC(Double suhu) {
        suhu = ((suhu - 32) * 5/9);
        System.out.println(suhu);
    }
}
