package az.qaralama.tekrar.lessons.lesson6;

import java.util.Scanner;

public class WhileLoopExerciseNegPositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pCount = 0;
        int nCount = 0;
        int zCount = 0;
        while(true){
            String choice;
            System.out.println("Enter the number:");
            int input = sc.nextInt();
            if(input > 0)
                pCount++;
            else if (input < 0)
                nCount++;
            else
                zCount++;
            System.out.println("Continue? Y/N");
            sc.nextLine();
            choice = sc.nextLine();
            if (choice.equalsIgnoreCase("n"))
                break;
        }
        System.out.printf("Positive numbers: %s\n",pCount);
        System.out.printf("Negative numbers: %s\n",nCount);
        System.out.printf("Zeros: %s\n",zCount);
    }
}
