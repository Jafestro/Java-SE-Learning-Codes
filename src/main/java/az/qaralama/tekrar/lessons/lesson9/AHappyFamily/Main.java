package az.qaralama.tekrar.lessons.lesson9.AHappyFamily;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Xhadija","Jafarova", 1964);
        Human father = new Human("Maharram", "Jafarov", 1965);
        Pet pet = new Pet("Dog","Jake",2,new String[]{"Loves to eat pancakes"});
        Human jafar = new Human("Jafar","Jafarov",1999,100,pet,mother,father,null);

        System.out.println(jafar);
        jafar.feedPet();
        jafar.describePet();
    }
}
