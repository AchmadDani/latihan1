import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String kotaTujuan = s.nextLine();
        int penumpang = s.nextInt();

        // int hargaTiket = 0;
        // switch (kotaTujuan) {
        //     case "Jakarta": hargaTiket = 145000; break;
        //     case "Bogor": hargaTiket = 200000; break;
        //     case "Garut":
        //     case "Purwakarta": hargaTiket = 75000; break;
        // }
        // int totalHarga = penumpang * hargaTiket;
        // System.out.println(totalHarga);

        int hargaTiket = 0;
        switch (kotaTujuan) {
            case "Jakarta": hargaTiket = 145000; break;
            case "Bogor": hargaTiket = 200000; break;
            case "Garut":
            case "Purwakarta": hargaTiket = 75000; break;
        }

        int totalHarga = penumpang * hargaTiket;
        if (totalHarga >= 250000 && kotaTujuan.equals("Bogor")) {
            totalHarga *= 0.9;
        }
        System.out.println(totalHarga);
    }
    
}
