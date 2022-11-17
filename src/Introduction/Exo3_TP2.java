package Introduction;

import java.util.Scanner;

public class Exo3_TP2 {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Veuillez saisir votre nom : ");
        String nom=keyboardInput.nextLine();

        System.out.print("Veuillez saisir votre prenom : ");
        String prenom=keyboardInput.nextLine();

        System.out.print("Veuillez saisir votre age : ");
        int age=keyboardInput.nextInt();

        System.out.printf("Vous vous appelez %s %s, et vous avez %d ans",nom,prenom,age);


    }
}
