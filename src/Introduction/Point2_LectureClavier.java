package Introduction;

import java.util.Scanner;

public class Point2_LectureClavier {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Saisir la longueur : ");
        double longueur=keyboardInput.nextDouble();

        System.out.print("Saisir la largeur : ");
        double largeur=keyboardInput.nextDouble();

        double Surface=longueur*largeur;
        double Perimetre=2*(longueur+largeur);

        System.out.printf("longueur : %.1f m\nlargeur : %.1f m\nSurface : %.1f m²" +
                "\nPerimetre : %.1f m",longueur,largeur,Surface,Perimetre);

    }
}
