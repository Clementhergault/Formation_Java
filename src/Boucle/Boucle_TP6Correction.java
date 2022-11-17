package Boucle;

import java.util.Scanner;

public class Boucle_TP6Correction {
    public static void main(String[] args) {
        System.out.print("Entrer la valeur de n : ");
        var n=new Scanner(System.in).nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.println("Fizzbuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
