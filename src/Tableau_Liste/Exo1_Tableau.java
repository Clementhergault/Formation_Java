package Tableau_Liste;// 1. Permettre à l'utilisateur de définir le nombres des notes à stocker
//        - La valeur doit toujours être > 0
// 2. Permettre à l'utilisateur d'entrer les notes du tableau à partir du clavier
//        - Les valeurs ne doivent être qu'entre 0 et 20
// 3. Calculer et afficher la moyenne


import java.util.Scanner;

public class Exo1_Tableau {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        int tailleTableau;

        do {
            System.out.print("Veuillez saisir le nombre de notes à saisir : ");
            tailleTableau=keyboardInput.nextInt();
            if (tailleTableau==0){
                System.out.println("Le nombre doit être supérieur à 0");
            }
        }while (tailleTableau==0);

        double notes[]=new double[tailleTableau];
        double somme =0;
        double moyenne=0;

        for(int i=0;i<notes.length;i++){
            do {
            System.out.printf("Note %d (entre 0 et 20): ",i+1);
            notes[i]=keyboardInput.nextDouble();//utiliser ","

                if (notes[i]>20 || notes[i]<0){
                    System.out.println("Les notes doivent être coprises entre 0 et 20");
                }
            }while(notes[i]>20 || notes[i]<0);
            somme=somme+notes[i];
            //System.out.println(somme);
        }
        moyenne=somme/(notes.length);
        System.out.printf("La moyenne de la classe est : %.1f/20",moyenne);
    }
}
