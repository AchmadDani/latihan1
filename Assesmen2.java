import java.util.Scanner;

public class Assesmen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int hasil = A + B;
        int ratusan = ((hasil / 100) % 10);
        int puluhan = ((hasil / 10) % 10);
        int satuan = ((hasil / 1) % 10);
        
        switch (ratusan) {
            case 1 : System.out.print("seratus ");
            break;
            case 2 : System.out.print("dua ratus ");
            break;
            case 3 : System.out.print("tiga ratus ");
            break;
            case 4 : System.out.print("empat ratus ");
            break;
            case 5 : System.out.print("lima ratus ");
            break;
            case 6 : System.out.print("enam ratus ");
            break;
            case 7 : System.out.print("tujuh ratus ");
            break;
            case 8 : System.out.print("delapan ratus ");
            break;
            case 9 : System.out.print("sembilan ratus ");
            break;
        }
        
        switch (puluhan) {
            case 1 : System.out.print("sepuluh ");
            break;
            case 2 : System.out.print("dua puluh ");
            break;
            case 3 : System.out.print("tiga puluh ");
            break;
            case 4 : System.out.print("empat puluh ");
            break;
            case 5 : System.out.print("lima puluh ");
            break;
            case 6 : System.out.print("enam puluh ");
            break;
            case 7 : System.out.print("tujuh puluh ");
            break;
            case 8 : System.out.print("delapan puluh ");
            break;
            case 9 : System.out.print("sembilan puluh ");
            break;
        }

        switch (satuan) {
            case 1 : System.out.print("satu");
            break;
            case 2 : System.out.print("dua");
            break;
            case 3 : System.out.print("tiga");
            break;
            case 4 : System.out.print("empat");
            break;
            case 5 : System.out.print("lima");
            break;
            case 6 : System.out.print("enam");
            break;
            case 7 : System.out.print("tujuh");
            break;
            case 8 : System.out.print("delapan");
            break;
            case 9 : System.out.print("sembilan");
            break;
        }

        }

    }
