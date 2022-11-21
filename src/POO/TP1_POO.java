package POO;

import java.util.*;

//TP1.Calcul IMC
//Le but de cet exercice est de créer des « patients » qui ont un poids
//et une taille,et de calculer leur « Indice de Masse Corporelle» (IMC).
//crée un patient,
//affiche les données du patient ainsi que son IMC.
//Avoir la possibilité de connaître la taille du patient, son poids
//Pour calculer l’IMC veuillez lire ceci : https://www.santemagazine.fr/minceur/imc-indice-de-masse-corporelle-267579
public class TP1_POO {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Veuillez saisir le nombre de patient : ");
        int nbPatient=input.nextInt();

        HashMap<Integer, List<Double>> infos=new HashMap<>();

        Classe_Patient_TP1_POO patientTp1Poo=new Classe_Patient_TP1_POO(0,0);
        for (int i=1;i<=nbPatient;i++){
            System.out.printf("Veuillez saisir le poids du patient n°%d :\n",i);
            patientTp1Poo.setPoids(input.nextDouble());
            System.out.printf("Veuillez saisir la taille du patient n°%d :\n",i);
            patientTp1Poo.setTaille(input.nextDouble());

            infos.put(i,Arrays.asList(patientTp1Poo.getPoids(),patientTp1Poo.getTaille(), patientTp1Poo.calculIMC()));

//            //System.out.printf("Pour le patient n°%d son poids est de %.1f, sa taille de %.1f\n"+
//                            "Ce qui donne un IMC de %.1f.\n",i,patientTp1Poo.getPoids(),patientTp1Poo.getTaille(),
//                    patientTp1Poo.calculIMC());
        }
        for (Map.Entry<Integer, List<Double>> entry : infos.entrySet()) {
            int key = entry.getKey();
            List value = entry.getValue();
            System.out.println("Pour le patient n°" + key +", les informations [Poids,Taille,IMC] sont :  " + value);
        }
        //System.out.println(infos);

    }
}
