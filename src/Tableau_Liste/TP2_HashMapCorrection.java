package Tableau_Liste;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class TP2_HashMapCorrection {
    public static void main(String[] args) {
        String text="papy";
        String reversed="";
        var splittedString=text.split("");//["p","a","p","y"]
        for(String lettre:splittedString){
            // rversed=p+"" => p
            // reversed = a+p => ap
            // reversed = p + ap => pap
            // reversed = y+pap => ypap
            reversed = lettre + reversed;
        }
        System.out.printf("Résultat : %s",reversed);
    }
}
