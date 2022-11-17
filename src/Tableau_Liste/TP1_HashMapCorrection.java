package Tableau_Liste;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;


public class TP1_HashMapCorrection {
    public static void main(String[] args) {
        String phrase="Je suis dans une joie immence.Et je sais que vous aussi.";
        String formattedPhrase=phrase.replaceAll("[^A-Z-a-z]","").toLowerCase();
        //replaceAll("[^A-Z-a-z]","") siginifi que tout les caractères
        //en dehors de A à Z et de a à z est remplacé par ""
        HashMap<Character,Integer> charMap=new HashMap<>();
        for(String lettre:formattedPhrase.split("")){
            char lettreToChar=lettre.charAt(0);
            if(charMap.containsKey(lettreToChar)){
                charMap.replace(lettreToChar,charMap.get(lettreToChar)+1);
            }else{
                charMap.put(lettreToChar,1);
            }
        }

        for(Map.Entry<Character,Integer> entry:charMap.entrySet()){
            char key=entry.getKey();
            int value=entry.getValue();
            System.out.printf("%s : %d fois\n",key,value);
        }

    }
}
