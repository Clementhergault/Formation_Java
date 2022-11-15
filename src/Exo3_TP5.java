import java.util.Scanner;

public class Exo3_TP5 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre entier : ");
        int nb = keyboardInput.nextInt();

        if ((nb % 2 == 0) && (nb > 0)) {
            System.out.println("Le nombre est pair.");
        } else if ((nb % 2 == 0) && (nb < 0)){
            System.out.println("Le nombre est négatif et pair.");
        } else if (nb == 0){
            System.out.println("Le nombre est 0 et pair.");
        }else if((nb % 2 != 0) && (nb > 0)){
            System.out.println("Le nombre est impair.");
        }else if((nb % 2 !=0) && (nb<0)){
            System.out.println("Le nombre est négatif et impair.");
        }else{
            System.out.println("Le nombre n'est pas entier");
        }
    }
}

