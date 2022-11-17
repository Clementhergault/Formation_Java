package Boucle;

import java.util.Scanner;

public class Exo_DoWhile {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Définir le code PIN : ");
        int codePin=keyboardInput.nextInt(); //Configuration du code PIN

        int tryPin=5; //Nombre de tentatives avant bloquage
        int tentative=0; //Nombre de tentative de l'utilisateur
        int codePinATester; //Code PIN saisi par l'utilisateur
        int reste; //Tentatives restantes

        do {
            System.out.print("Veuillez saisir le code PIN pour déverouiller l'appareil : ");
            codePinATester=keyboardInput.nextInt();
            tentative=tentative+1;
            reste=tryPin-tentative;

                    if (codePinATester==codePin){
                        System.out.println("L'appareil est déverouillé");
                    }else if ((reste<=3)&&(reste>0)){
                        System.out.printf("Code PIN incorrect, il vous reste %d tentative\n",reste);
                    }else if (reste==0){
                        System.out.println("Vous avez bloqué l'appareil");
                    }else {
                        System.out.println("Code PIN incorrect veuillez essayer à nouveau");
                    }

        }while((codePinATester!=codePin) && (reste!=0));
    }
}
