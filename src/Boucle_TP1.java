//TP1.
//        Écrivez un programme Tables.java affichant les tables de multiplication de 2 à 10.
//        Votre programme devra produire la sortie suivante à l’écran :
//        Tables de multiplication
//        Table de 2 :
//        1 * 2 = 2
//        ...
//        10 * 2 = 20
//        ...
//        Table de 5 :
//        1 * 5 = 5
//        2 * 5 = 10
//        ... ...
//        Table de 10 :
//        1 * 10 = 10 …
public class Boucle_TP1 {
    public static void main(String[] args) {
        int i;
        int j;

        System.out.println("Tables de multiplication :");

        for (i=2;i<=10;i++){
            System.out.printf("Table de %d\n",i);
            for(j=1;j<=10;j++){
                System.out.printf("%d * %d = %d\n",j,i,i*j);
            }
        }
    }
}
