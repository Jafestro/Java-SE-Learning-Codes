package az.qaralama.tekrar.lessons.lesson5;

import java.util.Scanner;

public class IfElseExerciseGreatestNumber {
    public static void main(String[] args) {
        System.out.println("Enter three numbers to find the greatest among:");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.printf("The greatest number is %s\n", Math.max(a,Math.max(b, c)));
    }
}
