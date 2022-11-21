package POO;

public class Classe_Patient_TP1_POO {
    double poids;
    double taille;

    public Classe_Patient_TP1_POO(double poids,double taille){
        this.poids=poids;
        this.taille=taille;
    }

    //getters (accesseurs)
    public double getPoids(){
        return poids;
    }
    public double getTaille(){
        return taille;
    }

    //setters (manipulateurs)

    public void setPoids(double poids) {
        if(poids>0) {
            this.poids = poids;
        }else{
            System.out.println("Le poids doit toujours être positive");
        }
    }

    public void setTaille(double taille) {
        if (taille > 0) {
            this.taille = taille;
        } else {
            System.out.println("La taille doit toujours être positive");
        }
    }

    public double calculIMC(){
        //IMC = poids en kg / taille² en m
        return poids/Math.pow(taille,2);
    }
}
