package Introduction;

import java.util.Calendar;
import java.util.Scanner;
import java.util.spi.CalendarDataProvider;

public class Exo3_TP4 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Veuillez saisir votre age : ");
        int age = keyboardInput.nextInt();

        System.out.println("Vous avez : " + age + " ans");

        int ageUser = age;
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int birthDate =year-ageUser;

        System.out.println("Vous êtes né en : "+birthDate);
    }
}
