package az.qaralama.tekrar.lessons.lesson6;

import java.util.Scanner;

public class ForLoopExerciseFindFactorial {
    public static void main(String[] args) {
        System.out.println("Enter number to find factorial: ");
        Scanner sc = new Scanner(System.in);
        int sum = 1;
        int input = sc.nextInt();

        if (input > 0) {
            for(int i = 1; i <= input; i++){
                sum *= i;
            }
            System.out.printf("Factorial of %s is %s\n", input, sum);
        } else if (input == 0) {
            System.out.println("Factorial of 0 is 1");
        }else System.out.println("Number must be positive!!!");
    }
}
