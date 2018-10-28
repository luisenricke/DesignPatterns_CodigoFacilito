package Behavioral.Iterator;

public class IteratorPhoneBook implements Iterator {

    private PhoneBook phoneBook;
    private int position;

    public IteratorPhoneBook(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    @Override
    public String next() {
        return this.phoneBook.getPhones().get(this.position++);
    }

    @Override
    public boolean hasAnother() {
        return this.position<this.phoneBook.getPhones().size()
                && this.phoneBook.getPhones().get(this.position) != null;
    }
}
