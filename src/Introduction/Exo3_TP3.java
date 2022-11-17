package Introduction;

import java.util.Scanner;

public class Exo3_TP3 {
    public static void main(String[] args) {
        //Scanner keyboard=new Scanner(System.in);
        int a = 51;
        int b =876;
        int c =235;
        int permute1;
        int permute2;

        System.out.printf("Avant permutation, la valeur de a est %d, "+
                "celle de b est %d et c est de %d\n",a,b,c);

        permute1=b;
        b=a;
        permute2=c;
        c=permute1;
        a=permute2;

        System.out.printf("Après permutation, la valeur de a est %d, "+
                "celle de b est %d et c est de %d",a,b,c);
    }
}
