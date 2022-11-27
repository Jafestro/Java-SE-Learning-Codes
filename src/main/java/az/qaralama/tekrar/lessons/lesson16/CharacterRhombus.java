package az.qaralama.tekrar.lessons.lesson16;

import java.util.*;

public class CharacterRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        createCharRhombus(user);
    }

    public static void createCharRhombus(int n) {
        int u = 1;
        int space = n - 1;
        char a = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            space--;
            for (int c = 0; c < u; c++) {
                System.out.print(a); //AB
                if (u > 1)
                    a++;
            }
            if (u > 1)
                a--;
            for (int d = 0; d < u - 1; d++) {
                a--;
                System.out.print(a);
            }
            u++;
            System.out.println();
        }
        u-=2;
        space++;
        for (int i = 1; i < n; i++) {
            space++;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int c = 0; c < u; c++) {
                System.out.print(a);
                if (u > 1)
                    a++;
            }
            if (u > 1)
                a--;
            for (int d = 0; d < u - 1 ; d++) {
                a--;
                System.out.print(a);
            }
            u--;
            System.out.println();

        }
    }
}
