package az.qaralama.tekrar.lessons.lesson6;

import java.util.Scanner;

public class ForLoopExerciseSumOfFirstNNumber {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find sum till that number :");
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++){
            sum+=i;
        }
        System.out.printf("Sum of N numbers is: %s", sum);
    }
}
