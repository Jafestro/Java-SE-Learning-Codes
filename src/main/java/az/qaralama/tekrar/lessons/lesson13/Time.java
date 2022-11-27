package az.qaralama.tekrar.lessons.lesson13;

import java.util.*;

public class Time {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println();
        System.out.println("Current date and time: " + calendar.getTime());
        int actualMaxYear = calendar.getActualMaximum(Calendar.YEAR);
        int actualMaxMonth = calendar.getActualMaximum(Calendar.MONTH);
        int actualMaxWeek = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
        int actualMaxDate = calendar.getActualMaximum(Calendar.DATE);

        System.out.printf("Actual maximum year: %s\n",actualMaxYear);
        System.out.printf("Actual maximum month: %s\n",actualMaxMonth);
        System.out.printf("Actual maximum week: %s\n",actualMaxWeek);
        System.out.printf("Actual maximum date: %s\n",actualMaxDate);
    }
}
