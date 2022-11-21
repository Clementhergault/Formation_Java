package Jeux_Fonctions;

public class Sorcier {
    private String name;
    private int dureeDeVie;
    private String baguetteMagique;
    private String batonMagique;

    public Sorcier(String name, int dureeDeVie, String baguetteMagique, String batonMagique) {
        this.name = name;
        this.dureeDeVie = dureeDeVie;
        this.baguetteMagique = baguetteMagique;
        this.batonMagique = batonMagique;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }

    public String getBaguetteMagique() {
        return baguetteMagique;
    }

    public void setBaguetteMagique(String baguetteMagique) {
        this.baguetteMagique = baguetteMagique;
    }

    public String getBatonMagique() {
        return batonMagique;
    }

    public void setBatonMagique(String batonMagique) {
        this.batonMagique = batonMagique;
    }
}
