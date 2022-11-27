package az.qaralama.tekrar.lessons.stepProject.happyFamily;

import java.util.*;
public class Human {
    private String name;
    private String surname;
    private int dateOfBirth;
    private int iq;
    private Family family;
    private String[][] schedule;


    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iq = setIQ();
    }

    public Human(String name, String surname, int dateOfBirth, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.family = new Family(mother,father);
        this.iq = setIQ();
    }

    public Human(String name, String surname, int dateOfBirth,Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iq = setIQ();
        this.family = new Family(mother,father);
        family.setPet(pet);
        this.schedule = schedule;
    }

    public Human() {
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public int getIq() {
        return iq;
    }

    public void greetPet(){
        System.out.printf("Hello, %s\n",family.getPet().getNickname());
    }
    public void describePet() {
        if (family.getPet().getTrickLevel() > 50) {
            System.out.printf("I have a %s, he is %s years old, he is very sly.\n",family.getPet().getSpecies(),family.getPet().getAge());
        }else
            System.out.printf("I have a %s, he is %s years old, he is almost not sly.\n",family.getPet().getSpecies(),family.getPet().getAge());
    }
    public int setIQ(){
        Random rn = new Random();
        this.iq = rn.nextInt(101) + 1;
        return this.iq;
    }

    public void feedPet(boolean feed){
        boolean isHungry = isHungry();
        if(feed){
            System.out.printf("Feeding %s\n",family.getPet().getNickname());
        }
        else if(isHungry){
            System.out.printf("Hmm... I think i will feed %s.\n",family.getPet().getNickname());
        }else {
            System.out.printf("I think %s is not hungry.\n",family.getPet().getNickname());
        }
    }
    private boolean isHungry(){
        Random reqem = new Random();
        int refer = reqem.nextInt(101);

        return family.getPet().getTrickLevel() > refer;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", iq=" + iq +
                ", family=" + family +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector collects Human...");
    }
}
