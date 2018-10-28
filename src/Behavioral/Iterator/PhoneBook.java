package Behavioral.Iterator;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<String> phones;

    public PhoneBook() {
        this.phones = new ArrayList<String>();
    }

    public void add(String phone){
        this.phones.add(phone);
    }

    public ArrayList<String> getPhones(){
        return this.phones;
    }
}
