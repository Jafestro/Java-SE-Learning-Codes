package az.qaralama.tekrar.lessons.lesson4;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        playRandomNumberGame();
    }


    public static void playRandomNumberGame() {
        String choice;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name:");
            String name = sc.nextLine();
            System.out.println("Let the game begin!");
            Random rn = new Random();
            int number = rn.nextInt(101);
            int life = 5;
            while (life != 0) {
                System.out.printf("Life Count: %s\n", life);
                System.out.print("Enter the number: ");
                int input = sc.nextInt();
                if (number == input) {
                    System.out.printf("Congratulations %s! You won!", name);
                    break;
                } else if (number < input) {
                    System.out.println("Your number is too high... Try again!");
                    life--;
                    if (life <= 0) System.out.println("Game Over... You Lose...");
                } else {
                    System.out.println("Your number is too low.... Try again!");
                    life--;
                    if (life <= 0) System.out.println("Game Over... You Lose...");
                }
            }
            System.out.println("Do you wanna try again? Yes/No");
            sc.nextLine();
            choice = sc.nextLine();
            if (choice.equalsIgnoreCase("no")) {
                System.out.println("<======Goodbye======>");
                break;
            }
        }
    }
}
