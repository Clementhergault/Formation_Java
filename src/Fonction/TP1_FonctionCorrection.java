package Fonction;

import java.util.Scanner;

public class TP1_FonctionCorrection {
    public static boolean isPrefix(String premier, String check) {

        //Et si on dépasse -> erreur out of bound. Gérer ou non.

        for (int i = 0; i < check.length(); i++) {
            if(premier.charAt(i)!=check.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String fin = "";
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Veuillez saisir votre 1er mot : ");
            String mot1=input.nextLine();
            System.out.print("Veuillez saisir votre 2eme mot : ");
            String mot2=input.nextLine();
            System.out.printf("IsPrefix(%s , %s)\n",mot1,mot2);
            System.out.printf("> %b\n",isPrefix(mot1,mot2));
            fin=input.nextLine();
        }while (!fin.equals("done"));

    }
}
