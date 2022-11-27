package az.qaralama.tekrar.lessons.lesson15_home.test;
import java.util.*;

public class TestRandomNumber {
    public static void main(String[] args) {
        Random rn = new Random();
        while(true) {
        int a = rn.nextInt(101);

            System.out.println(a);
            if(a < 0)
                break;
        }
    }
}
