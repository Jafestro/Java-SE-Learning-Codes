package az.qaralama.tekrar.lessons.lesson6;

import java.util.Scanner;

public class ForLoopExerciseMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a positive number to print multiplication table of it: ");
        int input = sc.nextInt();

        if (input > 0) {
            for (int i = 1; i <= 10; i++){
                System.out.printf("%s * %s = %s\n",input,i,input * i);
            }
        }else System.out.println("Number must be a positive number!!!");
    }
}
