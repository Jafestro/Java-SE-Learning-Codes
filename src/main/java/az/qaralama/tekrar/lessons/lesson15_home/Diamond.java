package az.qaralama.tekrar.lessons.lesson15_home;

import java.util.Scanner;

public class Diamond {
    public static void printDiamond(int n) {
        int space = n - 1;
        int u = 1;
        for (int i = 0; i < n; i++) {
            for (int b = 0; b < space; b++) {
                System.out.print(" ");
            }
            space--;
            for (int r = 0; r < u; r++) {
                System.out.print("*");
            }
            u += 2;
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            space += 1;
            for (int b = 0; b < space; b++) {
                System.out.print(" ");
            }
            u -= 2;
            for (int r = 0; r < u; r++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of a diamond: ");
        int input = sc.nextInt();
        printDiamond(input);
    }
}
