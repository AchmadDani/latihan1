import java.util.Scanner;

public class Assesment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka1 = sc.nextInt();
        int angka2 = sc.nextInt();
        int angka3 = sc.nextInt();

        int ribuan = (angka1 / 1000) % 10;
        int ratusan = (angka1 / 100) % 10;
        int puluhan = (angka1 / 10) % 10;
        int satuan = (angka1 / 1) % 10;

        int ribuan2 = (angka2 / 1000) % 10;
        int ratusan2 = (angka2 / 100) % 10;
        int puluhan2 = (angka2 / 10) % 10;
        int satuan2 = (angka2 / 1) % 10;

        int ribuan3 = (angka3 / 1000) % 10;
        int ratusan3 = (angka3 / 100) % 10;
        int puluhan3 = (angka3 / 10) % 10;
        int satuan3 = (angka3 / 1) % 10;

        System.out.print((ribuan + 5) % 10);
        System.out.print((satuan + 5) % 10);
        System.out.print((puluhan + 5) % 10);
        System.out.println((ratusan + 5) % 10);

        System.out.print((ribuan2 + 5) % 10);
        System.out.print((satuan2 + 5) % 10);
        System.out.print((puluhan2 + 5) % 10);
        System.out.println((ratusan2 + 5) % 10);

        System.out.print((ribuan3 + 5) % 10);
        System.out.print((satuan3 + 5) % 10);
        System.out.print((puluhan3 + 5) % 10);
        System.out.print((ratusan3 + 5) % 10);

    }

}
