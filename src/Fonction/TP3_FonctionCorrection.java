package Fonction;

import java.util.Arrays;

public class TP3_FonctionCorrection {
    public static int[] directions(String[] directionStr){
        int[] result={0,0};
        for(String direction:directionStr){
            switch (direction){
                case "haut":
                    result[1]+=1;
                    break;
                case "bas":
                    result[1] -=1;
                    break;
                case "gauche":
                    result[0] -=1;
                    break;
                case "droite":
                    result[0] +=1;
                    break;
                default:
                    System.out.println("Hihihi");
            }
        }
        return result;
    }
    public static void main(String[] args) {
        var result=directions(new String[]{"haut","haut","bas","gauche","gauche",
                "droite","haut"});
        System.out.println(Arrays.toString(result));
    }
}
