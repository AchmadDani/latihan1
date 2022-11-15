import java.util.Scanner;

public class PraLatihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama : ");
        String nama = input.nextLine();

        System.out.print("Masukan golongan : ");
        String golongan = input.nextLine();

        System.out.print("Masukan jam kerja : ");
        int jam = input.nextInt();

        int upah, gaji, lembur, totalGaji;

        switch (golongan) {
            case "A":
                upah = 5000;
                gaji = jam * upah;
                if (jam > 48) {
                    lembur = (jam - 48) * 4000;
                    totalGaji = gaji + lembur;
                    System.out.println("Nama karyawan : " + nama + "\n" + "Gaji : " + totalGaji);
                    // System.out.println("Gaji : " + totalGaji);
                } else {
                    System.out.println("Nama karyawan : " + nama + "Gaji :" + gaji);
                }
                break;

            case "B":
                upah = 7000;
                gaji = jam * upah;
                if (jam > 48) {
                    lembur = (jam - 48) * 4000;
                    totalGaji = gaji + lembur;
                    System.out.println("Nama karyawan :" + nama);
                    System.out.println("Gaji : " + totalGaji);
                } else {
                    System.out.println("Nama karyawan " + nama + " Gaji : " + gaji);
                }
                break;

            case "C":
                upah = 8000;
                gaji = jam * upah;
                if (jam > 48) {
                    lembur = (jam - 48) * 4000;
                    totalGaji = gaji + lembur;
                    System.out.println("Nama karyawan :" + nama);
                    System.out.println("Gaji : " + totalGaji);
                } else {
                    System.out.println("Nama karyawan " + nama + " Gaji : " + gaji);
                }
                break;

            case "D":
                upah = 10000;
                gaji = jam * upah;
                if (jam > 48) {
                    lembur = (jam - 48) * 4000;
                    totalGaji = gaji + lembur;
                    System.out.println("Nama karyawan :" + nama);
                    System.out.println("Gaji : " + totalGaji);
                } else {
                    System.out.println("Nama karyawan " + nama + " Gaji : " + gaji);
                }
                break;
        }
    }

}
