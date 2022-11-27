package az.qaralama.tekrar.lessons.lesson15_home.test;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);

        if (list1.equals(list2)){
            System.out.println("YAYY!");
        }

    }
}
