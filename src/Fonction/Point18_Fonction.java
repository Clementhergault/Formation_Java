package Fonction;

public class Point18_Fonction {
    public static String reverse(String str){
        String reversed="";
        for(String letter: str.split("")){
            reversed = letter+reversed;
        }
        return reversed;
    }

    public static String formatStr(String str){// Papy Et Mamy?
        String formatted=str.replaceAll("[^A-Za-z]","").toLowerCase();
        return formatted;//papyetmamy
    }

    public static boolean isPalindrome(String phrase){// Papy Et Mamy?
        String text=formatStr(phrase);//papyetmamy
        return text.equals(reverse(text));//papyetmamy.equals(ymamteypap)
    }

    public static int calculSomme(int nombre1,int nombre2){
        return nombre1+nombre2;
    }

    public static double calculSurfaceCercle(double rayon){
        return Math.pow(rayon,2)*Math.PI;
    }

    public static int sommeTableau(int[] nombres){
        int somme=0;
        for(int nombre:nombres){
            somme+=nombre;
        }
        return somme;
    }

    public static void main(String[] args) {
        String chaine1="Papy Et Mamy";
        String chaine1Formatted=formatStr(chaine1);
        System.out.println(chaine1Formatted);

        String chaine1Reversed=reverse(chaine1Formatted);
        System.out.println(chaine1Reversed);

        System.out.println(isPalindrome(chaine1));
        System.out.println(isPalindrome("papa"));
        System.out.println(isPalindrome("non"));
        System.out.println(isPalindrome("ressasser"));
        System.out.println(calculSomme(4,5));
        System.out.println(calculSomme(9,5));
        System.out.println(calculSurfaceCercle(9));


        int[] nombres={4,5,6,7,8,9};
        System.out.println(sommeTableau(nombres));
    }
}
