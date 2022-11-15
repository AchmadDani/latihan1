import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // //Soal 1
        // String nama = s.nextLine();
        // switch (nama) {
        //     case "A": System.out.println("Excellent");
        //     break;
        //     case "B": System.out.println("Good");
        //     break;
        //     case "C": System.out.println("Avarage");
        //     break;
        //     case "D": System.out.println("Fail");
        //     break;
        // }

        // //Soal 2
        // int angka = s.nextInt();
        // switch (angka) {
        //     case 1: System.out.println("satu");
        //     break;
        //     case 2: System.out.println("dua");
        //     break;
        //     case 3: System.out.println("tiga");
        //     break;
        //     case 4: System.out.println("empat");
        //     break;
        //     case 5: System.out.println("lima");
        //     break;
        //     case 6: System.out.println("enam");
        //     break;
        //     case 7: System.out.println("tujuh");
        //     break;
        //     case 8: System.out.println("delapan");
        //     break;
        //     case 9: System.out.println("sembilan");
        //     break;
        //     case 10: System.out.println("sepuluh");
        //     break;
        //     default: System.out.println("ini berapa ya?");
        // }

    //     // //Soal 3
        System.out.println("Daftar harga tiket dari bandung ke kota tujuan:");
        System.out.println("1. Jakarta Rp 145.000");
        System.out.println("2. Bogor Rp 200.000");
        System.out.println("3. Garut Rp 75.000");
        System.out.println("4. Purwakarta Rp 75.000");
        System.out.println("Masukan pilihan anda : 1/2/3/4");

        String pilih = s.nextLine();
        System.out.println("Masukan jumlah penumpang:");
        int penumpang = s.nextInt();
        int total = penumpang * 200000;
        
        switch (pilih) {
            case "1": System.out.println("Total harga tiket dari Bandung ke Jakarta:");
            System.out.println(penumpang * 145000);
            break;

            case "2": System.out.println("Total harga tiket dari Bandung ke Bogor:");
            if (penumpang >= 2) {
                System.out.println(total - (10*total / 100));
            } else {
                System.out.println(penumpang * 200000);
            }
            break;

            case "3": System.out.println("Total harga tiket dari Bandung ke Garut:");
            System.out.println(penumpang * 75000);
            break;
            case "4": System.out.println("Total harga tiket dari Bandung ke Purwakarta:");
            System.out.println(penumpang * 75000);
            break;
       }


    
    }
    
}
