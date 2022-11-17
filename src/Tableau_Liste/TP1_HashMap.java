package Tableau_Liste;//TP1.
//Écrire un programme Java demande à l’utilisateur de
//saisir un texte et qui ensuite, et qui ensuite affiche
//le nombre d’occurence de chaque lettre.
//Dans cet exercice, nous allons utiliser les HashMap


import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;


public class TP1_HashMap {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);

        System.out.println("Veuillez saisir une phrase : ");
        String phrase=keyboardInput.nextLine();

        HashMap<Character,Integer> occurrences=new HashMap<>();
        for (int i =0; i<phrase.length();i++){
            if(occurrences.containsKey(phrase.charAt(i))){
                int nombreMisAJour= occurrences.get(phrase.charAt(i))+1;
                occurrences.replace(phrase.charAt(i),nombreMisAJour);
            }else{
                occurrences.put(phrase.charAt(i),1);
            }
        }
        //occurrences.remove(" ");
        System.out.println(occurrences);
    }
}
