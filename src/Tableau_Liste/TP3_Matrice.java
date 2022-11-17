package Tableau_Liste;//TP3.
//Écrire un programme Java qui permet à l’utilisateur de déclarer 3 tableaux d’entiers.
//Ces tableaux ne doivent pas forcément avoir la même taille
//Le programme doit ensuite fournir afficher les 3 tableaux en
// format [element1, element2,...,élémentS] et la somme de tous
// les éléments multiples 3 dans les 3 tableaux.
//Ex :
//T1 : [ 2, 6, 8, 15,39,11 ]
//T2 : [ 21, 33, 12, 19,0 ]
//T3 : [ 17, 18, 46 ]
//S = 6+15+39+21+33+12+18 = 144
import java.util.Scanner;
import java.util.Arrays;

public class TP3_Matrice {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int tailleT4 = 0;
        int indexT4 = 0;
        int total = 0;

        System.out.print("Veuillez saisir la taille du tableau 1 : ");
        int tailleT1 = keyboardInput.nextInt();
        int[] T1 = new int[tailleT1];

        System.out.print("Veuillez saisir les données du tableau 1 : ");

        for (int i = 0; i < tailleT1; i++) {
            int entiers = keyboardInput.nextInt();
            T1[i] = entiers;
            if (T1[i] % 3 == 0) {
                tailleT4++;
            }
        }

        System.out.print("Veuillez saisir la taille du tableau 2 : ");
        int tailleT2 = keyboardInput.nextInt();
        int[] T2 = new int[tailleT2];

        System.out.print("Veuillez saisir les données du tableau 2 : ");

        for (int i = 0; i < tailleT2; i++) {
            int entiers = keyboardInput.nextInt();
            T2[i] = entiers;
            if (T2[i] % 3 == 0) {
                tailleT4++;
            }
        }

        System.out.print("Veuillez saisir la taille du tableau 3 : ");
        int tailleT3 = keyboardInput.nextInt();
        int[] T3 = new int[tailleT3];

        System.out.print("Veuillez saisir les données du tableau 3 : ");

        for (int i = 0; i < tailleT3; i++) {
            int entiers = keyboardInput.nextInt();
            T3[i] = entiers;
            if(T3[i] % 3 == 0) {
                tailleT4++;
            }
        }

        System.out.println("T1 : " + Arrays.toString(T1) + "\nT2 : " + Arrays.toString(T2) + "\nT3 : " + Arrays.toString(T3));
        int[] T4= new int[tailleT4];
        for (int i = 0; i < tailleT1; i++) {
            if (T1[i] % 3 == 0) {
                total = total + T1[i];
                T4[indexT4] = T1[i];
                indexT4++;
            }
        }
        for (int i = 0; i < tailleT2; i++) {
            if (T2[i] % 3 == 0) {
                total = total + T2[i];
                T4[indexT4] = T2[i];
                indexT4++;
            }
        }
        for (int i = 0; i < tailleT3; i++) {
            if (T3[i] % 3 == 0) {
                total = total + T3[i];
                T4[indexT4] = T3[i];
                indexT4++;
            }
        }
        System.out.print("S = ");
        for (int multiple3 = 0; multiple3 < tailleT4; multiple3++) {
            if (multiple3 == tailleT4 - 1) {
                System.out.printf("%d = %d", T4[multiple3], total);
            } else {
                System.out.printf("%d+", T4[multiple3]);
            }
        }
    }
}
