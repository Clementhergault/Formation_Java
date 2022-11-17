package Boucle;

import java.util.Scanner;

public class Boucle_TP4Correction {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        String definedEmail="jochri3@gmail.com";
        String definedPassword="123456789";
        int counts=0;
        String email="";
        String password="";
        while (true){
            System.out.print("Email : ");
            email=keyboard.nextLine();
            System.out.print("Password : ");
            password=keyboard.nextLine();
            counts++;

            if(!email.equals(definedEmail) || !password.equals(definedPassword)){
                if(counts==5){
                    System.out.printf("Vous avez saisi %d fois des mauvais identifiants\nVotre compte est bloqué\n",counts);
                    break;
                }
                System.out.println("Email et/ou Mot de passe incorrects.\n\n");
                System.out.printf("Il vous reste %d tentatives.\n",5-counts);
                continue;
            }
            System.out.println("Bienvenue");
            break;
        }
    }
}
