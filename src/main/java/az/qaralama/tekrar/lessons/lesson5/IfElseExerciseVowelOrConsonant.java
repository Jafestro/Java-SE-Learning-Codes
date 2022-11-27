package az.qaralama.tekrar.lessons.lesson5;

import java.util.Scanner;

public class IfElseExerciseVowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter to find if it is vowel or consonant:");
        String letter = sc.next();

        if(letter.length() == 1 && letter.matches("[a-zA-Z]")){
                if(letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") ||
                        letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") ||
                        letter.equalsIgnoreCase("u")){
                    System.out.printf("%s is vowel\n", letter);
                } else System.out.printf("%s is consonant\n", letter);
        }else System.out.println("Error! There you should be only one letter!");
    }
}
