package lessons.lesson1;

public class Student extends Person {

    public Student(int age){
        super(age);
    }

    @Override
    public void passWeekend() {
        System.out.println("Study!");
    }

    public void passWeekend(boolean b){

    }
}
