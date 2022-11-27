package az.qaralama.tekrar.lessons.lesson19;

import java.util.ArrayList;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(119);
        list.add(189);
        list.add(6685);
        list.add(445);
        list.add(46);
        list.add(494);
        list.add(1185);
        list.add(11597);
        list.add(17);
        list.add(11);

        System.out.println("Unsorted list: " + list);

        for (int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(i) > list.get(j)) {
                    int c = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,c);
                }
            }
        }
        System.out.println("Sorted list: " + list);
    }
}
