package lessons.lesson1;

public class Main {

    public static void main(String[] args){
        Person p1 = new Person(20);
        Student s1 = new Student(18);
        Worker w1 = new Worker(16);

        Person[] persons = new Person[3];
        persons[0] = p1;
        persons[1] = s1;
        persons[2] = w1;

        for (Person p: persons) {
            p.passWeekend();
            if(p instanceof Student){
                System.out.println("This is a student!");
            }
        }
        System.out.println(Person.nbOfPersons);

    }

}
