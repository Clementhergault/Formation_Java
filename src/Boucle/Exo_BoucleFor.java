package Boucle;

import java.util.Scanner;

public class Exo_BoucleFor {
    public static void main(String[] args) {
        Scanner keyBoardInput=new Scanner(System.in);
        System.out.print("Saisir la table à afficher : ");
        int factor=keyBoardInput.nextInt();

        System.out.print("Départ de la table : ");
        int depart=keyBoardInput.nextInt();

        System.out.print("Arrêt de la table : ");
        int stop=keyBoardInput.nextInt();

        for (int number = depart;number<=stop;number++){// pour nombre = 2, tant que nombre inférieur égale à 13 alors nombre = nombre +1
            System.out.printf("Le résultat de %d*%d est %d\n",factor,number,factor*number);
        }
    }
}
