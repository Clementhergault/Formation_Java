package Tableau_Liste;

import java.util.Scanner;
import java.util.HashMap;

public class Point15_HashMapRecherche {
    public static void main(String[] args) {
        var nombres=new int[]{2,7,5,6,7,1,6,2,1,7,1,32,1};
        // 1. Créer un HashMap vide
        // {2 : 2 , 7 : 3}
        HashMap<Integer,Integer> occurences=new HashMap<>();
        System.out.println(occurences);
        // 2. Remplir le hashMap avec les nombres et leurs occurences
        for(int nombre:nombres){
            if(occurences.containsKey(nombre)){
                int nombreMisAJour= occurences.get(nombre)+1;
                occurences.replace(nombre,nombreMisAJour);
            }else{
                occurences.put(nombre,1);
            }
        }

        var input=new Scanner(System.in);
        System.out.print("Entrez le nombre à rechercher : ");
        var nombreARechercher=input.nextInt();

        if(occurences.containsKey(nombreARechercher)){
            System.out.printf("%d se retrouve %d fois dans la liste",
                    nombreARechercher,occurences.get(nombreARechercher));
        }else{
            System.out.printf("%d n'existe pas dans la liste.",nombreARechercher);
        }
    }
}
