package Introduction;

import java.util.Locale;
import java.util.Scanner;

public class Point3_Conditionsmultiples {
    public static void main(String[] args) {
        Scanner keybpardInput=new Scanner(System.in);
        System.out.print("Veuillez choisir une langue : ");
        String langue=keybpardInput.nextLine();
        langue=langue.toLowerCase(Locale.ROOT); //Met la chaîne de caractère en miniscule

        if (langue.equals("français")) { //si on veut tester la négation (différence) sur un string il aurait
            System.out.println("Bonjour");// fallut écrire : !langue.equals("français"), qui se traduit par:
        }else if(langue.equals("anglais")) {// est-ce que langue est différent de français
            System.out.println("Hello");
        }else if (langue.equals("espagnol")) {
            System.out.println("Holà");
        } else if (langue.equals("allemand")) {
            System.out.println("Guten tag");
        }else {
            System.out.println("Langue non supportée");
        }
        }


    }
