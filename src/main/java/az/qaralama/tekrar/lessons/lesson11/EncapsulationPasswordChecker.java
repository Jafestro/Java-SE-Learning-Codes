package az.qaralama.tekrar.lessons.lesson11;

import java.util.*;

public class EncapsulationPasswordChecker {
    public static void main(String[] args) {
        System.out.println("<========A Password Validity Checker========>");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String input = sc.nextLine();
        passIsValid(input);
    }

    public static void passIsValid(String pass) {
        if (pass.length() >= 10) {
            if (pass.matches("[a-zA-Z0-9]+")) {
                int count = 0;
                for (int i = 0; i < pass.length(); i++) {
                    char c = pass.charAt(i);
                    if (c >= '0' && c <= '9' ){
                        count++;
                }
            }
                if (count >= 2){
                    System.out.printf("%s is valid password!\n",pass);
                }else System.out.println("Password must contain at least 2 digits!");
            }else System.out.println("Password must contain letters and digits!");
        }else System.out.println("Must be at least 10 characters!");
    }
}
