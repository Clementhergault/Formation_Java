package Tableau_Liste;//TP2.
//Écrire un programme Java demande à l’utilisateur de saisir
// un texte et qui ensuite, retourne la chaîne inverse.
//Ex:
//Votre chaine : mamy
//Résultat : ymam
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class TP2_HashMap {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Veuillez saisir un texte : ");
        String texte=keyboardInput.nextLine();
        String reverse="";

        ArrayList<Character> resultat=new ArrayList<>();
        System.out.printf("Votre chaine : %s\n",texte);
        System.out.print("Résultat : ");

        for (int i = texte.length()-1;i>=0;i--){
            char chaine=texte.charAt(i);
            reverse+=chaine;
        }
        System.out.println(reverse);
    }
}
