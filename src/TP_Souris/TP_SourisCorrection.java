package TP_Souris;

public class TP_SourisCorrection {
    public static void main(String[] args) {
        souris mike = new souris(50,"violette");
        souris rambo = new souris(1000,"rouge");
        souris cloneRambo = new souris(rambo);
        System.out.println(mike);
        System.out.println(cloneRambo);

        cloneRambo.evolue();
        System.out.println(cloneRambo);

    }
}
