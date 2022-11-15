import java.util.Scanner;

public class Points6_Scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//stdin stdout
        System.out.println(input.nextInt());
        System.out.println(input.nextInt());
        System.out.println(input.nextInt());
        System.out.println(input.nextInt());


        String nomComplet1=input.next();// Va lire tous les caractères avant
        // l'espace
        String nomComplet2=input.nextLine();// Va lire toute la ligne
        System.out.println(nomComplet1);// si on écrit chris lis => chris
        System.out.println(nomComplet2);// si on écrit chris lis => chris lis
    }
}
