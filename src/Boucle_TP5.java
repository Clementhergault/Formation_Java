//TP5.
//   Écrire un programme Java qui génère un nombre(entier)
//   aléatoire entre 1 et 100 et qui ensuite demandera à l’utilisateur
//   de deviner le nombre jusqu’à ce que la réponse convienne.
//   En cas de réponse supérieure à la valeur générée,
//   le programme affichera “Entrer un plus petit nombre”.
//   En cas de valeur inférieur, le programme affichera “Entrer un plus grand nombre”.
import java.util.Scanner;


public class Boucle_TP5 {
        public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        int min = 1;
        int max = 100;
        int getRandomValue = (int) (Math.random()*(max-min)) + min;
        //System.out.println(getRandomValue); //à afficher pour le test du programme
        System.out.printf("Veuillez saisir un nombre entre %d et %d : ",min,max);

        do {

            double test=keyboardInput.nextDouble();
            if((test<1)||(test>100)){
                System.out.println("Veuillez saisir un nombre entre 1 et 100 : ");
                continue;
            }

            if (test==getRandomValue){
                System.out.println("Bonne réponse !");
                break;
            } else if (test<getRandomValue) {
                System.out.println("Entrer un nombre plus grand");
            }else {
                System.out.println("Entrer un nombre plus petit");
            }


        }while(true);

    }
}
