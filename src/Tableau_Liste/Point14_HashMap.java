package Tableau_Liste;

import java.util.HashMap;

public class Point14_HashMap {
    public static void main(String[] args) {
        HashMap<String,String> identite=new HashMap<>();
        // nom : Lisangola
        // prenom : Christian
        // pays : Belgique
        identite.put("nom","Lisangola");
        identite.put("prenom","Christian");
        identite.put("pays","Belgique");
//        System.out.println(identite);
        identite.remove("nom");
        System.out.println(identite);
    }
}

