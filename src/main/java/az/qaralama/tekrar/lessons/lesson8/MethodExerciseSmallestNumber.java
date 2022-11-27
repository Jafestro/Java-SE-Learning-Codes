package az.qaralama.tekrar.lessons.lesson8;

import java.util.*;

public class MethodExerciseSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers to find smallest value!");
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        findSmallestNumber(a, b, c);

    }

    public static void findSmallestNumber(int a, int b, int c) {
        System.out.printf("The smallest number is %s\n", Math.min(a, Math.min(b, c)));
    }
}
