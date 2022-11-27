package az.qaralama.tekrar.lessons.lesson7;

import java.util.*;

public class ArrayExerciseAverage {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 7, 9};
        float sum = 0;
        for (int num : numbers)
            sum += num;
        float average = sum / numbers.length;
        System.out.println(average);
    }
}
