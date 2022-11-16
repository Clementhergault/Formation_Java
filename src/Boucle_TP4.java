//TP4.
//        A l’exercice précédent, s’ajoute un nouveau requirement:
//        Le nombre de fois que l’utilisateur peut saisir des mauvais
//        identifiants est limité à 5, ensuite le programme va s’arrêter avec un message disant.
//        “Vous avez saisi des mauvais identifiants x fois, votre compte est bloqué“.
//        Il faut dire à au user le nombre de tentatives restants
import java.util.Scanner;

public class Boucle_TP4 {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Veuillez saisir votre adresse mail : ");
        String email = keyboardInput.nextLine();
        String confirmEmail;
        String confirmMdp;
        System.out.print("Veuillez saisir votre mot de passe : ");
        String mdp = keyboardInput.nextLine();
        int nombreTentatives=0;

        do {
            System.out.println("Veuillez reconfirmer l'adresse mail et le mot de passe");
            System.out.print("Adresse mail : ");
            confirmEmail=keyboardInput.nextLine();

            System.out.print("Mot de passe : ");
            confirmMdp=keyboardInput.nextLine();

            nombreTentatives++;

            if ((confirmEmail.equals(email))&&(confirmMdp.equals(mdp))){
                System.out.println("Bienvenue dans votre espace client");
                break;
            }else if (nombreTentatives<5){
                System.out.printf("Votre adresse mail et/ou mot de passe est incorrect, " +
                        "veuillez resaisir les informations. Il vous reste %d tentatives restantes.\n",5-nombreTentatives);
            }else {
                System.out.printf("Vous avez saisi des mauvais identifiants %d fois, " +
                        "votre compte est bloqué",nombreTentatives);
                break;
            }

        }while(true);

    }
}
