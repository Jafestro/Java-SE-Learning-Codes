package az.qaralama.tekrar.lessons.lesson9.AHappyFamily;

import java.util.*;

public class Pet {
    public String species;
    public String nickname;
    public int age;
    public int trickLevel;
    public String[] habits;

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }
    public Pet(String species, String nickname, int age, String[] habits){
        this.species = species;
        this.nickname = nickname;
        this.age = setAge(age);
        this.trickLevel = setTrickLevel();
        this.habits = habits;
    }

    public Pet() {
    }

    public void eat(){
        System.out.println("I am eating.");
    }
    public void respond(){
        System.out.printf("Hello, owner. I am - %s. I miss you!\n",this.nickname);
    }
    public void foul(){
        System.out.println("I need to cover it up");
    }
    public int setTrickLevel(){
        Random rn = new Random();
        int min = 1;
        this.trickLevel = min + rn.nextInt(100);
        return this.trickLevel;
    }
    public int setAge(int age){
        if(age < 0) {
            System.out.println("Age can't be lower than 0");
            return this.age = 0;
        }
        else return this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
