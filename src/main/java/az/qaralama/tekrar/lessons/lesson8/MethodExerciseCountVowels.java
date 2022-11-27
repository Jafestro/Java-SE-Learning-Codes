package az.qaralama.tekrar.lessons.lesson8;

import java.util.*;

public class MethodExerciseCountVowels {
    public static void main(String[] args) {
        System.out.print("Enter the text: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.printf("Number of vowels in text: %s\n",countVowels(input));
    }

    public static int countVowels(String input){
        int count = 0;
        for (int i = 0; i < input.length(); i++){
            char c = Character.toLowerCase(input.charAt(i));
            if ( c == 'a' || c == 'e' || c == 'i' || c == 'u' || c == 'o')
                count++;
        }
        return count;
    }
}
