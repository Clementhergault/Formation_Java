package Introduction;

public class Point1_VariablesetAfficher {
    public static void main(String[] args) {
            int age=25;//Déclarer un entier
            String nom ="Hergault";//Déclarer une chaîne de carctère
            String prenom = "Clément";//Déclarer une chaîne de carctère
            double poids = 70.57;//Déclarer un réel
        /*
        Commentaire
        sur
        plusieurs
        lignes
         */

            //Affichage des varibales de manière individuelle
//        System.out.println(age);//Raccourci "sout"
//        System.out.println(nom);
//        System.out.println(prenom);
//        System.out.println(poids);
            //Raccourci pour mettre en commentaire "ctrl+/" sur la/les lignes concernées

            System.out.println("Je m'appelle "+nom+" "+prenom+", j'ai "+age+" ans et je " +
                    "pèse "+poids+" Kg"); /*Ajout des variables dans une phrase,
                                        manière peu recommendée */
            //Raccourci "souf"
            System.out.printf("Je m'appelle %s %s, %d ans et je pèse %.1f kg\n", prenom, nom
                    , age, poids);/* %s valeur string attendue
                                 %d valeur int attendue
                                 %f valeur double/réel attendue
                                 %.xf affiche un nombre avec x chiffres après la virgule
                                 cette fonction arrondie aussi
                                 \n permet un retour à la ligne dans le terminal
                               */

            //        Affichage avec arrondissement
            System.out.printf("Je m'appelle %s %s, j'ai %d ans et je pèse %.1f kg\n",prenom,nom
                    ,age,poids);
            //        Affichage sans arrondissement
            System.out.printf("Je m'appelle %s %s, j'ai %d ans et je pèse %f kg\n",prenom,nom
                    ,age,poids);

            System.out.printf("Nom : %s\nPrenom : %s\nAge : %d\nPoids : %f",nom,prenom,age,poids);


    }
}
