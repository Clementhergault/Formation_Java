public class Point7_BoucleFor {
    public static void main(String[] args) {
        //DRY : Don't Repeat Yourself, éviter les répétitions et pertes de temps
        //Consigne : les nombres évoluent de 2 à 10 avec un pas de 1
        //On sait quand s'arrêter
        for (int nombre = 2;nombre<=10;nombre++){// pour nombre = 2, tant que nombre inférieur égale à 10 alors nombre = nombre +1
            System.out.printf("Le carré de %d est %.1f\n",nombre,Math.pow(nombre,2));
        }
        }
    }