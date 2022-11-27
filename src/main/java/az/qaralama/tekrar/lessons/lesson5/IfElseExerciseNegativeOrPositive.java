package az.qaralama.tekrar.lessons.lesson5;

import java.util.Scanner;

public class IfElseExerciseNegativeOrPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("<++++++++++++Enter Number++++++++++++>");
            int input = sc.nextInt();
            String result = (input > 0) ? "Positive" : (input < 0) ? "Negative" : "Zero";
            System.out.println(result);

            String choice;
            sc.nextLine();
            System.out.println("Do you wanna repeat? Y/N");
            choice = sc.nextLine();
            if(choice.equalsIgnoreCase("n"))
                break;
        }
    }
}
