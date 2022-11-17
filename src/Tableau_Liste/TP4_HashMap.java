package Tableau_Liste;//TP4.
//Écrire un programme Java demande à l’utilisateur de saisir
//un texte et qui ensuite, renseigne si celui
//est un palindrome(mot qui se lit de la même dans les 2 sens).
//Ex :
//Entrez un test : non
//Résultat : non est un palindrome
//Entrez un text : oui
//Résultat : oui n’est pas un palindrome
//C’est quoi un palindrome?: https://www.larousse.fr/dictionnaires/francais/palindrome/57418
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class TP4_HashMap {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Veuillez saisir un mot : ");
        String mot=keyboardInput.nextLine();
        int compteur=0;

        ArrayList<Character> resultat=new ArrayList<>();

        for (int i = mot.length()-1;i>=0;i--){
            resultat.add(mot.charAt(i));
        }
        for (int i =0; i<mot.length();i++){
            if(resultat.get(i).equals(mot.charAt(i))){
                compteur++;
                if(compteur == mot.length()){
                    System.out.printf("Le mot %s est un palindrome",mot);
                }
                continue;
            }else {
                System.out.printf("Le mot %s n'est pas un palindrome",mot);
                break;
            }
        }

    }
}
