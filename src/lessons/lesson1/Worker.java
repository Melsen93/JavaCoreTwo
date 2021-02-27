package lessons.lesson1;

public class Worker extends Person {
    public Worker(int age){
        super(age);
    }
    @Override
    public void passWeekend() {
        System.out.println("Go to IKEA!");
    }
}
