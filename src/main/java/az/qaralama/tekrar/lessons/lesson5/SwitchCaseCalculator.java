package az.qaralama.tekrar.lessons.lesson5;

import java.util.Scanner;

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<===Welcome to the Calculator!!===>");
        System.out.print("Enter first Number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter second Number: ");
        int secondNum = sc.nextInt();
        sc.nextLine();
        System.out.print("Choose operator to iterate: (+,  -,  *,  /) : ");
        String operator = sc.nextLine();

        switch (operator){
            case "+": System.out.printf("%s + %s = %s", firstNum,secondNum,firstNum + secondNum);
                break;
            case "-": System.out.printf("%s - %s = %s", firstNum,secondNum,firstNum - secondNum);
                break;
            case "*": System.out.printf("%s * %s = %s", firstNum,secondNum,firstNum * secondNum);
                break;
            case "/": System.out.printf("%s / %s = %s", firstNum,secondNum,firstNum / secondNum);
                break;
            default:
                System.out.println("You didn't choose operator!!!");
        }
    }
}
