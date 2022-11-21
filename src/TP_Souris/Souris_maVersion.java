package TP_Souris;

public class Souris_maVersion {
    int poids;//en gramme
    String couleur;
    int age;//en mois
    int esperanceVie;//en mois
    boolean clonee;

    public Souris_maVersion(int poids, String couleur, int age, int esperanceVie){
        this.poids=poids;
        this.couleur=couleur;
        this.age=age;
        this.esperanceVie=esperanceVie;
        this.clonee=false;
        System.out.println("Une nouvelle souris");

    }

    // Constructeur par défaut
    public Souris_maVersion(){
        age=0;
        esperanceVie=36;
        System.out.println("Une nouvelle souris");
    }

    // Constructeur de copie
    public Souris_maVersion(Souris_maVersion souris){
        this.poids=souris.poids;
        this.couleur=souris.couleur;
        this.age=souris.age;
        this.esperanceVie=souris.esperanceVie*4/5;
        this.clonee=true;
        System.out.println("Clonage d'une souris");
    }

    public int getPoids(){
        return poids;
    }
    public String getCouleur(){
        return couleur;
    }
    public int getAge(){
        return age;
    }
    public int getEsperanceVie(){
        return esperanceVie;
    }

    public boolean getClonee(){
        return clonee;
    }

    public void setPoids(int poids){
        if(poids<0){
            this.poids=poids;
        }else {
            System.out.println("Le poids doit toujours être un nombre positif");
        }
    }

    public void setCouleur(String couleur){
        this.couleur=couleur;
    }

    public void setAge(int age){
        if(age<0){
            this.age=age;
        }else {
            System.out.println("L'âge doit toujours être un nombre positif");
        }
    }

    public void setEsperanceVie(int esperanceVie) {
        if (esperanceVie < 0) {
            this.esperanceVie = esperanceVie;
        }else{
                System.out.println("L'espérance de vie doit toujours être un nombre positif");
            }
        }

//    public void setClonee(boolean clonee){
//        this.clonee=clonee;
//    }
    public int evolue(){
        age=esperanceVie;
        return age;
    }

    public String vieillir(){
        String phrase="";
        age++;
        esperanceVie=esperanceVie/2;
        if (clonee && (age>esperanceVie)) {
            couleur="verte";
            phrase = "Une souris "+couleur+", clonée, de " + age + " mois et pesant " + poids + " grammes"+esperanceVie;
        }else {
            phrase = "Une souris " + couleur + ", clonée, de " + age + " mois et pesant " + poids + " grammes";
        }
        return phrase;
    }

    public String toString(){
        int moitie=esperanceVie/2;
        if(clonee && (age>moitie)) {
            return String.format("Une souris verte, clonée, de %d mois et pesant %d grammes.\n",
                     age, poids);
        }else if(clonee) {
            return String.format("Une souris %s, clonée, de %d mois et pesant %d grammes.\n",
                    couleur, age, poids);
        }else {
            return String.format("Une souris %s, de %d mois et pesant %d grammes.\n",
                    couleur, age, poids);
        }
    }
}

