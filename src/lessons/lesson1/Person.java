package lessons.lesson1;

public class Person {
    protected int age;
    public static int nbOfPersons;
    public Person(int age){
        ++nbOfPersons;
        this.age = age;
    }


    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age >= 0) {
         this.age = age;
        }
    }

    public void passWeekend(){
        System.out.println("Rest!");
    }
}
