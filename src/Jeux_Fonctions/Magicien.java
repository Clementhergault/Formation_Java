package Jeux_Fonctions;

public class Magicien {
        private String name;
        private int dureeDeVie;
        private String baguetteMagique;

        public Magicien(String name, int dureeDeVie, String baguetteMagique) {
            this.name = name;
            this.dureeDeVie = dureeDeVie;
            this.baguetteMagique = baguetteMagique;
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
    }