package Tableau_Liste;

import java.util.Scanner;

public class Point16_CharetString {
    public static void main(String[] args) {
        String nom="Christian";// [ 'C','h','r','i','s','t','i','a','n',' ','L']
//        char genre='f';
        char[] noms={'c','h','r','i','s','t','i','a','n'};
        var input=new Scanner(System.in);
//        System.out.print("Votre pays : ");
//        String pays=input.nextLine();
//
//        System.out.print("Votre genre : ");


        //masculin
//        char genre=input.next().charAt(0);
//        System.out.printf("Nom : %s\nGenre : %c\n",pays,genre);


        String monPays="France";
//        System.out.println(monPays.charAt(3));

        for(int i=0;i<monPays.length();i++){
            System.out.println(monPays.charAt(i));
        }
    }










}
