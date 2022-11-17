package Tableau_Liste;//        Ecrire un programme Java qui déclare une matrice carrée(3x3)
//        Et qui ensuite va calculer la somme et la différence des 2 diagonales

public class Exo_Matrice {
    public static void main(String[] args) {
        int tab[][]={
                {5,18,47},
                {46,7,71},
                {26,2,15}
        };
        int sommeD1=0;
        int sommeD2=0;
        double milieu = Math.floor(tab.length/2);

        //System.out.println(tab.length);

        for(int i=0;i< tab.length;i++){
            for (int j=0;j<tab[i].length;j++){
                if(j==i){
                    sommeD1=sommeD1+tab[i][j];
                }//Math.floor(), arrondi inférieur
                if(i+j==2*milieu){
                    sommeD2=sommeD2+tab[i][j];
                    System.out.println(sommeD2);
                }
            }
        }
        int sommeDiagonale=sommeD1+sommeD2;
        int differenceDiagnole=sommeD1-sommeD2;
        System.out.printf("La somme de la première diagonale est : %d et la deuxième : %d.\n" +
                "Le total des 2 est : %d\n",sommeD1,sommeD2,sommeDiagonale);
        System.out.printf("La différence des diagnoale (D1-D2) est : %d\n",differenceDiagnole);
    }
}
