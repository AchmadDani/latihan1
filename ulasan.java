import java.util.Scanner;

public class ulasan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int diskon = 0;
        int hargaTotal = n;
        int ppn = hargaTotal * 11/100;
        if (n > 200000) {
            diskon = n * 10/100;
            System.out.println("Transaksi : " + n);
            System.out.println("Total : " + hargaTotal + "" + "-" + "" + (hargaTotal - diskon));
            System.out.println("Ppn 11% :" + ppn);
        }
    }
    
}
