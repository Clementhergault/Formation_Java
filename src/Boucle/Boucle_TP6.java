package Boucle;//TP6.
//        Ecrivez un programme qui affiche en console les nombres de 1 à n:
//        pour les multiples de trois, il affiche “fizz” à la place du nombre
//        et pour les multiples de cinq de cinq, imprimez “buzz”.
//        Pour les nombres qui sont des multiples multiples
//        à la fois de trois et de cinq, imprimez “fizzbuzz”.
//        Sinon, il affiche le nombre
//        Exemple
//        Si n = 5
//        1
//        2
//        fizz
//        4
//        Buzz
import java.util.Scanner;

public class Boucle_TP6 {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre entier supérieur à 0 : ");
        int n = keyboardInput.nextInt();
        int i;

        System.out.printf("n = %d\n",n);

        for(i=1;i<=n;i++){

            if ((i%3!=0)&&(i%5!=0)){
                System.out.println(i);
                continue;
            }
            
            if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            }else if (i%5==0){
                System.out.println("buzz");
            } else{
                System.out.println("fizz");
            }
        }
    }
}
