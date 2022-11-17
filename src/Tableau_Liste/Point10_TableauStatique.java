package Tableau_Liste;

public class Point10_TableauStatique {
    public static void main(String[] args) {
        //String str=null;
        double notesCoursDePhysique[]=new double[5];  // Les index du tableau vont de 0 à 4, la taille
                                                      //du tableau est de 5 emplacements
            //Mauvaise approche
//        System.out.println(notesCoursDePhysique[0]);
//        System.out.println(notesCoursDePhysique[1]);
//        System.out.println(notesCoursDePhysique[2]);
//        System.out.println(notesCoursDePhysique[3]);
//        System.out.println(notesCoursDePhysique[4]);

        notesCoursDePhysique[0]=15;
        notesCoursDePhysique[1]=12;
        notesCoursDePhysique[2]=13;
        notesCoursDePhysique[3]=14;
        notesCoursDePhysique[4]=11;

        for (int i=0;i<=4;i++){
            System.out.println(notesCoursDePhysique[i]);
        }

        //Calcul somme des notes
        double somme=0;
        for (int i=0;i<=notesCoursDePhysique.length-1;i++){//notesCoursDePhysique.length = 5
            somme=somme+notesCoursDePhysique[i];

        }
        System.out.println(somme);
    }
}
