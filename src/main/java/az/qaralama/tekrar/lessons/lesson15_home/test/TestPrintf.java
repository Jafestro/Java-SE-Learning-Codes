package az.qaralama.tekrar.lessons.lesson15_home.test;

import java.util.*;

public class TestPrintf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================");
        for(int i = 0; i < 3; i++) {
            String s = sc.next();
            int input = sc.nextInt();

            System.out.printf("%-15s%03d\n",s,input);
        }
        System.out.println("======================================================");
    }
}
