package az.qaralama.tekrar.lessons.lesson15;

import java.util.ArrayList;
import java.util.List;

public class Qaralama {
    public static String findClosestNumbers(int[] arr) {
        List<Integer> otherCases = new ArrayList<Integer>();
        int idealCase = Integer.MIN_VALUE;
        int first = 0;
        int second = 0;

        for (int elem : arr) {
            if (elem > 0) {
                for (int mElem : arr) {
                    if (mElem < 0) {
                        if(elem + mElem > idealCase && elem + mElem <= 0){
                            idealCase = elem +mElem;
                            first = elem;
                            second = mElem;
                        } else if (elem + mElem == idealCase && elem +mElem <= 0) {
                            otherCases.add(elem);
                            otherCases.add(mElem);
                        }
                    }
                }
            } else if (elem < 0) {
                for (int mElem : arr) {
                    if (mElem > 0) {
                        if(elem + mElem > idealCase && elem + mElem <= 0){
                            idealCase = elem +mElem;
                            first = elem;
                            second = mElem;
                        } else if (elem + mElem == idealCase && elem +mElem <= 0) {
                            otherCases.add(elem);
                            otherCases.add(mElem);
                        }
                    }
                }
            }
        }
        return "[" + first + ", " + second +"]";
    }
}
