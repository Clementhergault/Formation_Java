//TP1.
//        Le but de cet exercice est d’écrire un programme permettant d’identifier
//        l’élément apparaissant le plus fréquemment dans un tableau d’entiers.
//        Ce programme devra également afficher le nombre d’occurrences dans le tableau 
//        de cet élément le plus fréquent. Par exemple, pour le tableau suivant :
//        {2, 7, 5, 6, 7, 1, 6, 2, 1, 7}
//        votre programme devra indiquer que l’élément le plus fréquent est le 7 
//        et que sa fréquence d’apparition est 3.
//        Notez à ce propos que si dans un tableau donné il y a plus d’un nombre ayant
//        le plus grand nombre d’occurrences, alors votre programme ne retiendra 
//        que celui qui apparaît en premier dans le tableau.

public class TP1_Matrice {
    public static void main(String[] args) {
        int[] tableauEntier={10,15,23,10,6,97,53,15,10,15};
        int[] tableauNavigation=tableauEntier;
        int[] tableauStock=new int[tableauEntier.length];
        //System.out.println(tableauEntier.length)=9

        for (int i=0;i<tableauEntier.length;i++){
            int compteur=0;
            for(int j=0;j<tableauEntier.length;j++){
                if(tableauNavigation[j]==tableauNavigation[i]){
                    compteur++;
                    tableauStock[i]=compteur;
                }
            }
        }
        int frequence=0;
        for(int f=0;f<tableauEntier.length-1;f++){
            if(frequence<tableauStock[f]){
                frequence=tableauStock[f];
            }
        }
        int elementPlusFrequent=tableauEntier[frequence];
        System.out.printf("L'élément le plus fréquent est %d avec une" +
                " occurence de %d\n",tableauEntier[frequence],frequence);
    }
}
