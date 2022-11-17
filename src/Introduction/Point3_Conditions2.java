package Introduction;

import java.util.Scanner;

public class Point3_Conditions2 {
    public static void main(String[] args) {
        Scanner keybpardInput=new Scanner(System.in);
        System.out.print("Veuillez définir un Code PIN : ");
        int codePin=keybpardInput.nextInt();

        System.out.println("Après quelques minutes l'appareils s'est vérouillé...");
        System.out.print("Veuillez entrer le code de dévérouillage : ");
        int codePinATester=keybpardInput.nextInt();

        if (codePinATester==codePin) {
            System.out.println("Code PIN correct");
        }else{
            System.out.println("Code PIN inccorect");
        }

    }
}
