package az.qaralama.tekrar.lessons.lesson10;

import java.util.*;

public class ModifiersAndCostructorsExerciseLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year to find leap year: ");
        int year = sc.nextInt();
        isLeapYear(year);
    }

    public static void isLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.printf("%s is leap year\n",year);
        }else System.out.printf("%s is not a leap year\n",year);
    }
}
