package az.qaralama.tekrar.lessons.lesson5;

import java.util.Scanner;

public class SwitchCaseExercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerical mark: ");
        int input = sc.nextInt();

        switch (input){
            case 10: case 9:
                System.out.println("Sobresaliente");
                break;
            case 8: case 7:
                System.out.println("Notable");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 5:
                System.out.println("Aprobado");
                break;
            case 4: case 3: case 2: case 1: case 0:
                System.out.println("Suspenso");
                break;
            default:
                System.out.println("You should input numerical mark between 0 - 10 !!!");

        }
    }
}
