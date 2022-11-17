package Boucle;

public class Points11_ForEach {
    public static void main(String[] args) {
        String programmingLanguages[]={"C","C++","Go","Rust","Java","Typescript",
                "Python"};
//
//        for(int i=0;i<=programmingLanguages.length-1;i++){
//            System.out.println(programmingLanguages[i]);
//        }

        // language="Typescript"
        for(String language:programmingLanguages){
            System.out.println(language);
        }

    }
}
