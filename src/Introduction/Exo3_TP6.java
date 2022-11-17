package Introduction;

import java.util.Scanner;

public class Exo3_TP6 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Veuillez saisir 3 entiers a,b et c : ");
        int a=keyboard.nextInt();
        int b=keyboard.nextInt();
        int c=keyboard.nextInt();

        System.out.printf("La formule est la suivante : %dx2+%dx+%d\n",a,b,c);

        double delta = Math.pow(b,2)-4*a*c;
        if (delta<0){
            System.out.println("L'équation n'a de solution réelle");
        } else if (delta==0) {
            double x = -(b/2*a);
            System.out.println("La solution de l'éqaution est x = "+x);
        } else if (delta>0) {
            double x1=((-b-Math.sqrt(delta))/2*a);
            double x2=((-b+Math.sqrt(delta))/2*a);
            System.out.printf("Les solutions de l'équation sont x1 = %.1f et x2 = %.1f",x1,x2);
        }
    }
}
