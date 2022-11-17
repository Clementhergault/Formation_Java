package Introduction;

public class Exo1 {
    public static void main(String[] args) {
        int longueur=250;
        int largeur=140;
        int Surface;
        int Perimetre;

        Surface=longueur*largeur;
        Perimetre=2*(longueur+largeur);

        System.out.printf("longueur : %d m\nlargeur : %d m\nSurface : %d m²\nPerimetre : %d m",longueur,largeur
                ,Surface,Perimetre);
    }
}