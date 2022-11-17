package Boucle;

import java.util.Scanner;
import java.util.Random;

public class Boucle_TP5Correction {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        var random=new Random();
        var randomNumber=random.nextInt(100);
        var numberToGuess=0;
        while (true){
            System.out.print("Dévinez le nombre généré(entre 1 et 100) : ");
            numberToGuess=input.nextInt();
            if(numberToGuess==randomNumber){
                System.out.printf("Trouvé!! Le nombre était %d",numberToGuess);
                break;
            }
            if(randomNumber>numberToGuess){
                System.out.println("Plus haut!!");
            }else{
                System.out.println("Plus petit!!");
            }
        }

    }
}
