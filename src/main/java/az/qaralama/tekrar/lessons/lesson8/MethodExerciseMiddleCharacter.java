package az.qaralama.tekrar.lessons.lesson8;

import java.util.*;

public class MethodExerciseMiddleCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = sc.nextLine();
        System.out.printf("The middle character in the string : %s\n", findMiddleCharacter(input));
    }

    public static String findMiddleCharacter(String input) {
        String result = "";
        int len = input.length();
        if (len % 2 == 0) {
            result += input.charAt(len / 2 - 1);
        }
        result += input.charAt(len / 2);
        return result;
    }
}
