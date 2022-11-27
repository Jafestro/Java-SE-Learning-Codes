package az.qaralama.tekrar.lessons.lesson14;

import java.util.Scanner;

public class PyramidWithANumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pyramid's length: ");

        int input = sc.nextInt();
        drawPyramid(input);
    }

    public static void drawPyramid(int n){
        int space = n;
        for(int i = 1; i <= n; i++){
            space--;
            for (int j = 0; j < space; j++){
                System.out.print(" ");
            }
            for (int jamsss = 0; jamsss < i; jamsss++){
                System.out.printf("%s ",i);
            }
            System.out.println();
        }
    }
}
