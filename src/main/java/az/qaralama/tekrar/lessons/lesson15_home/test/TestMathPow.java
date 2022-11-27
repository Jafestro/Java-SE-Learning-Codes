package az.qaralama.tekrar.lessons.lesson15_home.test;

import java.util.*;

public class TestMathPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
        int n = sc.nextInt();

        int iki = (int) Math.pow(2, n);
        System.out.println(iki);
    }
}
