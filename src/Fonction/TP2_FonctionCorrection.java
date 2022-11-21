package Fonction;

import java.util.ArrayList;

public class TP2_FonctionCorrection {

    public static String maMethode(int[][] tab, int nombre){
        int count = 0;
        ArrayList<String> location = new ArrayList<>();
        for(int i=0; i<tab.length;i++){
            for(int j=0; j<tab[i].length;j++){
                if(tab[i][j]==nombre){
                    count++;
                    String loc = "("+i+","+j+")";
                    location.add(loc);
                }
            }
        }return String.format("%d se retrouve %d fois dans les emplacement suivants: %s",nombre,count,location); //
    }

    public static void main(String[] args) {

    }

}
