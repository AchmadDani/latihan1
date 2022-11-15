import java.util.Scanner;

public class Loopfor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    // Scanner s = new Scanner(System.in);
    // looping for
    // for (int i = 1; i <= 5; i++) {
    //     System.out.println(i);
    // }

    // Array dan Loopfor
    // String[] teman = {"zakky" , "dhafa" , "kafaby" , "hafizh"}; 
    // for (int i = 0; i < teman.length; i++) {
    //     System.out.println("Nama teman di asrama = " + teman[i]);
    // }
    
    // lebih singkat
    // String[] teman = {"zakky" , "dhafa" , "kafaby" , "hafizh"}; 
    // for (String name: teman) {
    //     System.out.println(name + " adalah teman asrama ku");
    // }

    int bulan = s.nextInt();
    switch (bulan) {
        case 1: System.out.println("janvier");
        break;
        case 2: System.out.println("fevrier");
        break;
        case 3: System.out.println("mars");
        break;
        case 4: System.out.println("avri");
        break;
        case 5: System.out.println("mai");
        break;
        case 6: System.out.println("juin");
        break;
        case 7: System.out.println("juliet");
        break;
        case 8: System.out.println("aout");
        break;
        case 9: System.out.println("septembre");
        break;
        case 10: System.out.println("octobre");
        break;
        case 11: System.out.println("novembre");
        break;
        case 12: System.out.println("decembre");
        break;
    }

    int Hari = s.nextInt();
	// s.close();


	if (Hari > 28) {
		Hari -= 28;
	} else if (Hari > 21) {
		Hari -= 21;
	} else if (Hari > 14) {
		Hari -= 14;
	} else if (Hari > 7) {
		Hari -= 7;
	}

	Hari += 1;

	switch (Hari) {
		case 1:
		//system.out.println("Jumat");
		System.out.println("vendredi");
		break;
		
		case 2:
		System.out.println("samedi");
		break;

		case 3:
		System.out.println("dimanche");
		break;

		case 4:
		System.out.println("lundi");
		break;

		case 5:
		System.out.println("mardi");
		break;

		case 6:
		System.out.println("mercredi");
		break;

		case 7:
		System.out.println("jeudi");
		break;
	}
	// s.close();



}
}