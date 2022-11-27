package az.qaralama.tekrar.lessons.lesson7;

import java.util.*;

public class ArrayExerciseSum {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 7, 9};
        int sum = 0;
        for(int i : numbers)
            sum += i;
        System.out.println(sum);
    }
}
