public class Point13_TableauMultiDimensionnel {
    public static void main(String[] args) {
        int tab[][]={
                {3,4,5},
                {12,19,32},
                {1,7,9}
        };

        System.out.printf("Accéder à 19 => tab[1][1] : %d\n\n",tab[1][1]);

        for(int i=0;i<tab.length;i++){
//            System.out.println(Arrays.toString(tab[i]));
            for(int j=0;j< tab.length;j++){
                System.out.printf("%d",tab[i][j]);
            }
        }

//        Nombre lignes !=nombre colonnes


        System.out.println("\n\nNombre lignes != nombre colonnes\n");
        int[][] tab2={
                {1,2,6,5},
                {2,4,9},
                {7,3}
        };

        for(int i=0;i< tab2.length;i++){
            for (int j=0;j<tab2[i].length;j++){
                System.out.println(tab2[i][j]);
            }
        }
    }
}
