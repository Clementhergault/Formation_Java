package Fonction;
//TP1.
//Écrire une méthode Java qui prend en paramètre 2 string
//et qui ensuite retourne un booléen(true/false) selon
//que le 2ème string est le préfixe du premier ou pas.
//Ex :
//isPrefix(“banner”, “bang”)
//> false
//isPrefix(“hugging”, “hug”)
//> true


import java.util.Scanner;

public class TP1_Fonction {

    public static boolean isPrefix(String str1, String str2) {
        String[] splittedString1=str1.split("");
        String[] splittedString2=str2.split("");
        int compteur =0;
        for (int i=0;i<splittedString2.length;i++){
            if (splittedString2[i].equals(splittedString1[i])){
                compteur++;
            }
        }
        boolean vrai = compteur == splittedString2.length;
        return vrai;
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
