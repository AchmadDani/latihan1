import java.util.Scanner;

public class Assesment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kelamin = sc.nextLine();
        int beratBadan = sc.nextInt();
        double tinggiBadan = sc.nextDouble() / 100;

        double bmi = beratBadan / (tinggiBadan * tinggiBadan);

        switch (kelamin) {
            case "Pria" :
            if (bmi < 20.50) {
                System.out.printf("%.2f, Kurus", bmi);
            } else if (bmi >= 20.50 && bmi <= 26.99) {
                System.out.printf("%.2f, Ideal", bmi);
            } else if (bmi >= 27.00) {
                System.out.printf("%.2f, Gemuk", bmi);
            }
        }
    }
    
}
