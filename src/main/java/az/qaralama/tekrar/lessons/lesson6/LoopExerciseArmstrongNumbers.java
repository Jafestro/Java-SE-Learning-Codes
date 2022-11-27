package az.qaralama.tekrar.lessons.lesson6;

public class LoopExerciseArmstrongNumbers {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 500) {
            int sum = 0;
            int count = i;
            while (count != 0) {
                int digit = count % 10;
                sum += digit * digit * digit;
                count /= 10;
            }
            if (i == sum) System.out.printf("%s, ",i);
            i++;
        }
    }
}
