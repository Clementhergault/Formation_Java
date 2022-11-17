package Tableau_Liste;

//        Ecrire un programme Java qui déclare une matrice carrée(3x3)
//        Et qui ensuite va calculer la somme et la différence des 2 diagonales
public class Exo_MatriceCorrection {
    public static void main(String[] args) {
        int[][] matrice={
                {1,4,9},
                {2,6,8},
                {3,5,7}
        };

        int d1=0;
        int d2=0;
        for(int i=0;i<matrice.length;i++){
            d1 +=matrice[i][i];
            d2 +=matrice[i][matrice.length-i-1];
        }
        int sommeDiagonales=d1+d2;
        int differenceDiagonales=d1-d2;
        System.out.printf("Somme : %d\nDifférence : %d\n",sommeDiagonales,differenceDiagonales);
    }
}
