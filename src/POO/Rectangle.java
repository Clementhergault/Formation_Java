package POO;

public class Rectangle {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur,double largeur){
        this.longueur=longueur;
        this.largeur=largeur;
    }

    // Constructeur par défaut
    public Rectangle(){
        longueur=10;
        largeur=5;
    }

    //    Constructeur de copie
    public Rectangle(Rectangle rectangle){
        this.longueur=rectangle.longueur;
        this.largeur=rectangle.largeur;
    }

    // getters : accesseurs
    public double getLongueur(){
        return longueur;
    }

    public double getLargeur(){
        return largeur;
    }
    // setters : manipulateurs
    public void setLongueur(double longueur){
        if(longueur>0){
            this.longueur=longueur;
        }else {
            System.out.println("La longueur doit toujours être un nombre positif");
        }
    }

    public void setLargeur(double largeur){
        if(largeur>0){
            this.largeur=largeur;
        }else{
            System.out.println("La largeur doit toujours être un nombre positif");
        }
    }
    public double calculSurface(){
        return longueur*largeur;
    }

    public double calculPerimetre(){
        return 2*(longueur+largeur);
    }

    public String toString(){
        return String.format("Rectangle\n===========\nLongueur : %.2f\nLargeur : %" +
                        ".2f\n\n",
                longueur,
                largeur);
    }
}
