package az.qaralama.tekrar.lessons.stepProject.happyFamily;

import java.util.*;

public class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(String nickname) {
        this.nickname = nickname;
        this.trickLevel = setTrickLevel();
    }

    public Pet(Species species, String nickname, int age, String[] habits) {
        setSpecies(species);
        this.nickname = nickname;
        this.age = setAge(age);
        this.trickLevel = setTrickLevel();
        this.habits = habits;
    }

    public Pet() {
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void eat() {
        System.out.println("I am eating.");
    }

    public void respond() {
        System.out.printf("Hello, owner.I am %s.I miss you!\n", this.nickname);
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    public int setAge(int age) {
        if (age < 0) {
            return 0;
        } else return this.age = age;
    }

    public int setTrickLevel() {
        Random rn = new Random();
        this.trickLevel = rn.nextInt(100) + 1;
        return this.trickLevel;
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

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector collects Pet...");
    }
}
