package az.qaralama.tekrar.lessons.lesson5;

import java.util.Scanner;

public class IfElseExerciseQuadraticEquations {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers to find quadratic equation of it:");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = b * b - (4 * a * c);

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d))/ (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.printf("Your roots are %s and %s\n",x1,x2);
        } else if (d == 0) {
            double x1 = (-b + Math.sqrt(d))/ (2 * a);
            System.out.printf("Your root is %s\n",x1);
        } else System.out.println("Root is complex number");

    }
}
