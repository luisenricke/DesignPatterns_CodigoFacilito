package Behavioral.Iterator;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("123");
        phoneBook.add("124");
        phoneBook.add("125");
        phoneBook.add("126");
        phoneBook.add("127");

        Iterator iterator = new IteratorPhoneBook(phoneBook);

        while (iterator.hasAnother()){
            System.out.println(iterator.next());
        }
    }
}
