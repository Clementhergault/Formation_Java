//TP3.
//        Écrire un programme Javascript qui permet
//        à l’utilisateur de définir une adresse email et un mot de passe.
//        Ensuite dans un second temps, il sera demandé à l’utilisateur
//        de fournir l’email et le mot de passe:
//        Si l’email et le mot de passe ne correspondent pas aux valeurs définies,
//        le message “Identifiants incorrect devra s’afficher”,
//        et l’utilisateur devra recommencer la saisie des valeurs.
//        Sinon, le message “Bienvenu dans votre espace client” devra s’afficher.
import java.util.Scanner;

public class Boucle_TP3 {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Veuillez saisir votre adresse mail : ");
        String email = keyboardInput.nextLine();
        String confirmEmail;
        String confirmMdp;
        System.out.print("Veuillez saisir votre mot de passe : ");
        String mdp = keyboardInput.nextLine();

        do {
            System.out.println("Veuillez reconfirmer l'adresse mail et le mot de passe");
            System.out.print("Adresse mail : ");
            confirmEmail=keyboardInput.nextLine();

            System.out.print("Mot de passe : ");
            confirmMdp=keyboardInput.nextLine();

            if ((confirmEmail.equals(email))&&(confirmMdp.equals(mdp))){
                System.out.println("Bienvenue dans votre espace client");
                break;
            }else{
                System.out.println("Votre adresse mail et/ou mot de passe est incorrect, " +
                        "veuillez resaisir les informations");
            }

        }while(true);

    }
}
