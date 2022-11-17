package Tableau_Liste;

public class Point12_TableauComparaison {
    public static void main(String[] args) {
        int[] numbers={10,15,23};
        int[] numbers2=numbers;

        System.out.printf("numbers[0] : %d\n",numbers[0]);
        System.out.printf("number2[0] : %d\n\n",numbers2[0]);

        numbers2[1]=67;
        System.out.printf("numbers[1] : %d\n",numbers[1]);
        System.out.printf("number2[1] : %d\n\n",numbers2[1]);
    }
}
