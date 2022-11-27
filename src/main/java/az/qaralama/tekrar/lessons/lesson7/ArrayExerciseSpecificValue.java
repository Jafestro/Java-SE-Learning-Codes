package az.qaralama.tekrar.lessons.lesson7;

import java.util.*;

public class ArrayExerciseSpecificValue {
    public static void main(String[] args) {
        int[] numbers = {1789, 2035, 1899, 1456, 2013};
        boolean contains = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int input =sc.nextInt();
        for(int i : numbers){
            if(i == input){
                contains = true;
                break;
            }
        }
        if(contains)
            System.out.printf("Array contains %s\n",input);
        else System.out.printf("Array does not contain %s\n",input);
    }
}
