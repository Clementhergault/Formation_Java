package Introduction;

import java.util.Scanner;

public class Exo3_TP1 {
    public static void main(String[] args) {
        Scanner keyboardInput= new Scanner(System.in);
        System.out.print("Veuillez saisir la valeur du diamètre : ");
        double diametre=keyboardInput.nextDouble();

        double rayon = diametre/2;
        double surface=Math.pow(rayon,2)*Math.PI;
        System.out.printf("La surface est de %.1f m²",surface);
    }
}
