package Introduction;

import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;

public class Exo_TP7 {
    public static void main(String[] args) {
        Scanner keyboardINPUT = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre entier entre 1 et 12 : ");
        int mois = keyboardINPUT.nextInt();

        switch (mois){
            case 1:
                System.out.println("Le mois est JANVIER");
                break;
            case 2:
                System.out.println("Le mois est FEVRIER");
                break;
            case 3:
                System.out.println("Le mois est MARS");
                break;
            case 4:
                System.out.println("Le mois est AVRIL");
                break;
            case 5:
                System.out.println("Le mois est MAI");
                break;
            case 6:
                System.out.println("Le mois est JUIN");
                break;
            case 7:
                System.out.println("Le mois est JUILLET");
                break;
            case 8:
                System.out.println("Le mois est AOUT");
                break;
            case 9:
                System.out.println("Le mois est SEPTEMBRE");
                break;
            case 10:
                System.out.println("Le mois est OCTOBRE");
                break;
            case 11:
                System.out.println("Le mois est NOVEMBRE");
                break;
            case 12:
                System.out.println("Le mois est DECEMBRE");
                break;
            default:
                System.out.println("Le nombre doit être compris entre 1 et 12");
        }
    }
}
