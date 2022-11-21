package TP_Souris;

public class TP_Souris {
    public static void main(String[] args) {
        Souris_maVersion sourisBlanche=new Souris_maVersion(50,"blanche",2,36);
        //Souris souris2=new Souris(); // Constructeur par défaut
        //System.out.println(souris.toString()); //Méthode ToString
        //Souris souris3=new Souris(souris); // Constructeur de copie
        //System.out.println(souris3.toString()); //Méthode ToString du Constructeur de copie
        //System.out.println(souris3.vieillir()); //Méthode vieillir du Constructeur de copie
        Souris_maVersion sourisGrise=new Souris_maVersion(45,"grise",0,36);
        Souris_maVersion sourisClonee=new Souris_maVersion(sourisGrise);
        System.out.println(sourisBlanche.toString());
        System.out.println(sourisGrise.toString());
        System.out.println(sourisClonee.toString());
        sourisBlanche.evolue();
        System.out.println(sourisBlanche.toString());
        sourisGrise.evolue();
        System.out.println(sourisGrise.toString());
        sourisClonee.evolue();
        System.out.println(sourisClonee.toString());
    }
}
