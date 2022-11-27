package az.qaralama.tekrar.lessons.stepProject.happyFamily;

public class Main {
    public static void main(String[] args) {
        Human ana = new Human("Ariel","Light",1799);
        Human ata = new Human("Jacob","Light",1798);
        Pet jony = new Pet(Species.DOG,"Jony",3,null);

        String[][] jackSchedule = new String[][]{
                {DayOfWeek.MONDAY.name(), "Doing something"},
                {DayOfWeek.TUESDAY.name(), "Eating..."},
                {DayOfWeek.WEDNESDAY.name(), "Walking"},
                {DayOfWeek.THURSDAY.name(), "Running..."},
                {DayOfWeek.FRIDAY.name(), "Swimming..."},
                {DayOfWeek.SATURDAY.name(),"Reading...",},
                {DayOfWeek.SUNDAY.name(),"Studying..."}};


        Human jack = new Human("Jack", "Light", 1821,jony, ana, ata, jackSchedule);

        //System.out.println(jack);

        Family f1 = new Family(ana,ata);
        f1.addChild(jack);
        f1.setPet(jony);
        System.out.println(f1.countFamily());
        System.out.println(f1);
        f1.deleteChild(0);
        System.out.println(f1.countFamily());
        System.out.println(f1);

//        for (int i = 0; i < 1_000_000; i++) {
//            new Human();
//        }

    }
}
