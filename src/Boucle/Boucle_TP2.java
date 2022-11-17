package Boucle;//TP2.
//        Écrivez un programme Java qui demande à l’utilisateur d’entrer
//        un nombre et qui ensuite va calculer et afficher la factorielle de ce nombre:
//        Ex:
//        Nombre : 3
//        Factorielle de 3 : 3x2x1 = 6
import java.util.Scanner;


public class Boucle_TP2 {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre : ");
        int nombre = keyboardInput.nextInt();
        int resultat=1;
        int i;
        int j;


        for(i=nombre;i>=1;i--){
            if(nombre==0){
                System.out.println("0! = 0");
            }
            resultat=resultat*i;

        }
        System.out.printf("%d! = %d",nombre,resultat);
    }
}
