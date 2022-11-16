import java.util.Scanner;

public class Exo1_TableauCorrection {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        // 1. Permettre à l'utilisateur de définir le nombres des notes à stocker
//        - La valeur doit toujours être > 0
        var nombreNotes=0;
        while (nombreNotes<=0){
            System.out.print("Entrez le nombre des notes(>0) : ");
            nombreNotes=input.nextInt();
            if(nombreNotes<=0){
                System.out.println("Vous devez entrer une valeur strictement > 0");
            }
        }
        double notesCoursPhysique[]=new double[nombreNotes];
// 2. Permettre à l'utilisateur d'entrer les notes du tableau à partir du clavier
//        - Les valeurs ne doivent être qu'entre 0 et 20
        for(int i=0;i<notesCoursPhysique.length;i++){
            double note;
            do{
                System.out.printf("Note[%d] : ",(i+1));
                note=input.nextDouble();
                if(note<0 || note>20){
                    System.out.println("Vous devez une note entre 0 et 20");
                }
            }while (note<0 || note>20);
            notesCoursPhysique[i]=note;
        }
// 3. Calculer et afficher la moyenne
        for(int i=0;i<=notesCoursPhysique.length-1;i++){
            System.out.println(notesCoursPhysique[i]);
        }

//        calcul de la somme des notes
        double somme=0;
        for(int i=0;i<notesCoursPhysique.length;i++){
            somme=somme + notesCoursPhysique[i];
        }

        double moyenne=somme/notesCoursPhysique.length;
        System.out.printf("Somme des notes = %.1f\n",somme);
        System.out.printf("Moyenne des notes = %.1f\n",moyenne);
    }

}
