import java.util.Scanner;

public class Points5_Booléen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//stdin stdout
        System.out.print("Entrez une valeur : ");
        int nombre=input.nextInt();
//        String nombre="45";
        boolean estPair=nombre%2==0;

//        Sans opérateur ternaire
//        String parite="";
//        if(estPair){
//            parite="pair";
//        }else{
//            parite="impair";
//        }
//
//        Avec opérateur ternaire
        String parite=estPair?"pair":"impair";

        if(nombre>0){
            System.out.printf("%d est positif et %s",nombre,parite);
        } else if (nombre<0) {
            System.out.printf("%d est negatif et %s",nombre,parite);
        }else{
            System.out.println("0 et pair.");
        }
    }
}
