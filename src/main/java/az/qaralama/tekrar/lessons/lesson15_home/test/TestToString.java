package az.qaralama.tekrar.lessons.lesson15_home.test;

public class TestToString {
    public static void main(String[] args) {
        int n = 100;
        String s = Integer.toString(n);
        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        }
    }
}
