package az.qaralama.tekrar.lessons.lesson9.AHappyFamily;

import java.util.Arrays;
import java.util.Random;

public class Human {
    public String name;
    public String surname;
    public int dateOfBirth;
    public int iqLevel;
    public Pet pet;
    public Human mother;
    public Human father;
    public String[][] schedule;

    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = setDateOfBirth(dateOfBirth);
    }

    public Human(String name, String surname, int dateOfBirth, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = setDateOfBirth(dateOfBirth);
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int dateOfBirth, int iqLevel, Pet pet,
                 Human mother, Human father, String[][] schedule) {

        this.name = name;
        this.surname = surname;
        this.dateOfBirth = setDateOfBirth(dateOfBirth);
        this.iqLevel = setIQ(iqLevel);
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human() {
    }

    public void greetPet() {
        System.out.printf("Hello, %s\n", this.pet.nickname);
    }

    public void describePet() {
        if (this.pet.trickLevel > 50)
            System.out.printf("I have a %s, he is %s years old, he is very sly\n",
                    this.pet.species, this.pet.age);
        else
            System.out.printf("I have a %s, he is %s years old, he is almost not sly\n",
                    this.pet.species, this.pet.age);
    }

    public int setDateOfBirth(int year) {
        if (year < 0) {
            System.out.println("Year can't be lower than 0");
            return this.dateOfBirth = 2022;
        } else return this.dateOfBirth = year;
    }

    public int setIQ(int iq) {
        if (iq < 1) {
            System.out.println("IQ can't be lower than 1");
            return this.iqLevel = 1;
        } else if (iq > 100) {
            System.out.println("IQ must be lower than 101");
            return this.iqLevel = 100;
        } else return this.iqLevel = iq;
    }

    public void feedPet(){
        if (isHungry()){
            System.out.printf("Hm... I will feed %s\n", this.pet.nickname);
        }else System.out.printf("I think %s is not hungry\n", this.pet.nickname);
    }

    public boolean isHungry(){
        Random rn = new Random();
        int a = rn.nextInt(101);
        return this.pet.trickLevel > a;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", iqLevel=" + iqLevel +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }
}
