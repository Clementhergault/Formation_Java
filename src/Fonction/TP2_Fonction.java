package Fonction;
//TP2.
//Écrire une méthode Java qui prend en paramètre un tableau 2D, et un nombre.
//La méthode devrait nous retourner la valeur correspond au nombre de fois
//que ce nombre se trouve dans le tableau et ses différentes positions.
//Ex :
//maMethode({
//{1, 4, 2, 1},
//{6, 3, 8, 9},
//{1, 5, 1, 0}
//},1)
//> 1 se retrouve 4 fois dans les emplacements suivants : (0,0),(0,3),(2,0),(2,2)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TP2_Fonction {
    public static String matrice(int[][] arg1,int arg2){
        int count = 0;
        ArrayList<String> location = new ArrayList<>();
        for(int i=0; i<arg1.length;i++){
            for(int j=0; j<arg1[i].length;j++){
                if(arg1[i][j]==arg2){
                    count++;
                    String loc = "("+i+","+j+")";
                    location.add(loc);
                }
            }
        }return String.format("%d se retrouve %d fois dans les emplacement suivants: %s",arg2,count,location);

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Veuillez saisir la dimension x (abscisse) du tableau : ");
        int x = input.nextInt();

        System.out.print("Veuillez saisir la dimension y (ordonnée) du tableau : ");
        int y = input.nextInt();

        int[][] tableau=new int[y][x];
        int i=0;
        int j=0;
        for(i=0;i<x;i++){
            System.out.printf("\nVeuillez saisir la %dième ligne du tableau :\n",i+1);
            for(j=0;j<y;j++){
                tableau[j][i]=input.nextInt();
            }
        }
        System.out.println(Arrays.toString(tableau));

        System.out.println("Veuillez saisir un nombre : ");
        int nombre=input.nextInt();

        matrice(tableau,nombre);
    }
}
