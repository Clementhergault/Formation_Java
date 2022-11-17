//TP2.
//Écrire un programme Java qui demande à l’utilisateur de remplir
//un tableau d’entiers à partir du clavier.
//Puis le programme devra lui demander d’entrer
//un nombre à rechercher dans le tableau.
//Si nombre existe, le programme lui dira que le nombre existe
//et le nombre de fois qu’ils se retrouve dans le tableau
//Sinon le programme lui dira que le nombre recherché n’existe pas dans le tableau
//Ex : tableau saisi à partir du clavier : 12,45,6,7,12,23,33,6,22,3,6
//->Entrer un nombre à rechercher : 6
// ->6 existe et se retrouve 3 fois dans le tableau
import java.util.Scanner;
public class TP2_Matrice {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Veuillez saisir la taille du tableau d'entiers : ");
        int tailleTableau=keyboardInput.nextInt();
        int[] tableauEntiers=new int[tailleTableau];

        for (int i=0;i<tailleTableau;i++){
            int entiers=keyboardInput.nextInt();
            tableauEntiers[i]=entiers;
        }

        System.out.println("Veuillez saisir le nombre à rechercher : ");
        int nbAChercher=keyboardInput.nextInt();

        int compteur=0;

        for (int i=0;i<tableauEntiers.length;i++){
            if(tableauEntiers[i]==nbAChercher){
                    compteur++;
            }
        }
        if(compteur==0){
            System.out.println("Le nombre n'est pas présent dans la liste");
        }else {
            System.out.printf("%d est présent dans la liste et apparaît %d fois", nbAChercher, compteur);
        }
    }
}
