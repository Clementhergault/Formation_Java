import java.util.Scanner;

public class Point3_Conditions {
    public static void main(String[] args) {
        Scanner keybpardInput=new Scanner(System.in);
        System.out.print("Votre age : ");
        int age=keybpardInput.nextInt();
//        > = : Supérieur ou égal
//        < = : Inférieur ou égal
//        = = : Test d'égalité
//        ! = : Test de différence
        if(age>=18){
            System.out.println("Vous êtes un majeur.");
        }else{
            System.out.println("Vous êtes mineur.");
        }
    }
}
