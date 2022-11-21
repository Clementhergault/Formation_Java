package POO;

public class Patient {
    private double poids;
    private double taille;

    // Constructeur
    public Patient(double poids, double taille) {
        this.poids=poids;
        this.taille=taille;
    }

    // Getters
    public double getPoids(){
        return poids;
    }

    public double getTaille(){
        return taille;
    }

    // Setters
    public void setPoids(double poids) {
        if (poids > 0) {
            this.poids=poids;
        } else {
            System.out.println("Le poids doit être supérieur à 0.");
        }
    }

    public void setTaille(double taille) {
        if (taille > 0) {
            this.taille = taille;
        } else {
            System.out.println("Le taille doit être supérieur à 0.");
        }
    }

    public double calculImc() {
        return poids / Math.pow(taille,2);
    }

    public String affichageDonnees() {
        return String.format("Données Patient:\nPoids : %.2f kg\nTaille : %.2f m\nIMC : %.2f kg/m²", poids, taille, calculImc());
    }
}
