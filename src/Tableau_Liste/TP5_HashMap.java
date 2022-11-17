package Tableau_Liste;//TP5.
//Écrire un programme Java demande à l’utilisateur de saisir
//liste de langages de programmations à partir du clavier.
//Une fois le tableau rempli, l’utilisateur sera appelé à saisir
//les noms des langages qu’il souhaite retirer de liste.
//Le programme devra ensuite retirer ces langages et afficher
// l’état du tableau avant et après la suppression.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class TP5_HashMap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Combien de langage souhaitez-vous saisir : ");
        int tailleTable= input.nextInt();

        HashMap<String,Integer> tableLangage=new HashMap<>();
        for(int i=1;i<=tailleTable;i++){
            System.out.printf("Langage n°%d : \n",i);
            String langageASaisir=input.nextLine();

            if(tableLangage.containsKey(langageASaisir)){
                int indexMisAJour= tableLangage.get(langageASaisir)+1;
                tableLangage.replace(langageASaisir,indexMisAJour);
            }else{
                tableLangage.put(langageASaisir,1);
            }
        }
        System.out.println("Veuillez saisir les langages à retirer de la liste : ");
        do {
            String langage=input.nextLine();
            if (langage.equals("") || langage.equals("aucun") || langage.equals("non") || langage.equals("fin")){
                break;
            }else {
                if (tableLangage.containsKey(langage)) {
                    tableLangage.remove(langage);
                }
            }
        }while(true);
        System.out.println(tableLangage);
    }
}
