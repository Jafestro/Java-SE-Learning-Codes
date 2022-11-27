package az.qaralama.tekrar.lessons.lesson6;

import java.util.Scanner;

public class ForLoopExerciseReverseDigitsOf5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 digit number to reverse it: ");
        int input = sc.nextInt();

        if (input >= 10000 && input <= 100000){
            int reversed = 0;
            for (int i = 0; i < 5; i++){
                reversed = reversed * 10 + (input % 10);
                input /= 10;
            }
            System.out.printf("Reversed number is %s\n", reversed);
        } else System.out.println("Must be 5 digit number!!!");
    }
}
