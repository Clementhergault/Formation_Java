package Tableau_Liste;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
public class TP5_HashMapCorrection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tabInitial = new ArrayList<>();
        ArrayList<String> tab = new ArrayList<>();
        System.out.println("entrez votre list de langages, entrez \'done\' pour finir");
        while (true) {
            String langage = input.nextLine().toLowerCase();
            if (langage.equals("done")){
                break;
            }
            tab.add(langage);
        }
        for(String a:tab){
            tabInitial.add(a);
        }
        System.out.println("entrez les langages que vous voulez retirer, entrez \'done\' pour finir");
        while (true){
            String remove = input.nextLine().toLowerCase();
            if (remove.equals("done")){
                break;
            }
            tab.remove(remove);
        }
        System.out.println(tabInitial);
        System.out.println(tab);
    }
}
