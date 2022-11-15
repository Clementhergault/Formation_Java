import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Saisir le nom : ");
        String nom = keyboardInput.nextLine();

        System.out.print("Saisir le prénom : ");
        String prenom = keyboardInput.nextLine();

        System.out.print("Saisir l'age : ");
        int age = keyboardInput.nextInt();

        System.out.print("Saisir le poids : ");
        double poids = keyboardInput.nextDouble();//Saisir le poids avec une ","

        System.out.printf("Nom : %s\nPrénom : %s\nAge : %d ans"+
                "\nPoids : %.1f kg",nom,prenom,age,poids);
    }
}
