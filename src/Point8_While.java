import java.util.Scanner;

public class Point8_While {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Veuillez définir un code PIN : ");
        int codePin=keyboardInput.nextInt();

        System.out.println("Après quelques minutes, l'appareil s'est verrouillé...");
        int codePinATester=0;
        while (codePinATester!=codePin){//a tester = 1111, codePin=1111
            System.out.print("Veuillez entrer le code de déverrouillage : ");
            codePinATester=keyboardInput.nextInt();// 1111
            if(codePinATester==codePin){//1111 == 1111 => true
                System.out.println("Félicitations, appareil déverrouillé....");
            }else{
                System.out.println("Code PIN incorrect.Veuillez recommencer.");
            }
        }
    }
}
