package az.qaralama.tekrar.lessons.lesson8;

public class MethodExercisePentagonalNumbers {
    public static void main(String[] args) {
        System.out.println("The first 50 pentagonal numbers:");
        findPentagonalNumbers(50);
    }

    public static void findPentagonalNumbers(int input) {
        int a = 1;
        int u = 4;
        for (int i = 0; i < input; i++) {
            System.out.printf("%s ",a);
            a += u;
            u += 3;
        }
    }
}
