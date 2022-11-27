package az.qaralama.tekrar.lessons.lesson12;

import java.util.*;

public class InheritanceExerciseMatrixMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to print n x n matrix: ");
        int input = sc.nextInt();
        createMatrix(input);
    }

    public static void createMatrix(int n){
        Random rn = new Random();
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("%s ",rn.nextInt(2));
            }
            System.out.println();
        }
    }
}
