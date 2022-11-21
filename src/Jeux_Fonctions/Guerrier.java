package Jeux_Fonctions;

public class Guerrier {
        private String name;
        private int dureeDeVie;
        private String arme;

        public Guerrier(String name, int dureeDeVie, String arme) {
            this.name = name;
            this.dureeDeVie = dureeDeVie;
            this.arme = arme;
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

        public String getArme() {
            return arme;
        }

        public void setArme(String arme) {
            this.arme = arme;
        }
}

