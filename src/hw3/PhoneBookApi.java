package hw3;

public class PhoneBookApi {
    public static void main(String[] args) {

        PhoneBook book = new PhoneBook();
        book.add( "Andrey", "+79104281978") ;
        book.add( "Mark", "+79165556576") ;
        book.add( "Alice",  "+79067889067");
        System.out.println(book.getNumber(  "Andrey"));
        System.out.println(book.getNumber(  "Mark"));
        System.out.println(book.getNumber(  "Alice"));
        System.out.println(book.getNumber(  "Bonny"));

    }


}
