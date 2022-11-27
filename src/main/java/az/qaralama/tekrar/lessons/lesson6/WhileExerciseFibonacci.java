package az.qaralama.tekrar.lessons.lesson6;

import java.util.Scanner;

public class WhileExerciseFibonacci {
    public static void main(String[] args) {
        System.out.println("Enter number to find fibonacci: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int a = 0;
        int b = 1;
        int next = 0;

        if(input > 0){
            if(input == 1) System.out.println(a);
            else if(input == 2) System.out.printf("%s, %s",a,b);
            else if (input > 2){
                int i = 0;
                System.out.printf("%s, %s, ",a,b);
                while(i < input){
                    next = a + b;
                    System.out.printf("%s, ",next);
                    a = b;
                    b = next;
                    i++;
                }
            }
        }else System.out.println("should be positive number!!!");
    }
}
