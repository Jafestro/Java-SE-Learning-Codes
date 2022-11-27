package az.qaralama.tekrar.lessons.lesson18;

import java.util.*;

public class YawaGoreSayinTapilmasi {
    public static void main(String[] args) {
        List<Integer> list = getList();
        for (int i = 1; i <= 150; i++){
            System.out.printf("%s - %s\n",i,countNumber(i,list));
        }
    }

    public static List<Integer> getList(){
        List<Integer> ints = new ArrayList<>();
        Random rn = new Random();
        for (int i = 0; i < 10_000_000; i++){
            ints.add(rn.nextInt(150) + 1);
        }
        return ints;
    }
    public static int countNumber(int n,List<Integer> f){
        return Collections.frequency(f,n);
    }
}
