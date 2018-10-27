package Creational.Builder;

public class Main {
    public static void main(String[] args) {
        User user = User.Make("Luis","Villalobos")
                .setEnableContact(true)
                .setEmail("x@x.com")
                .setAddress("Mexico")
                .setPhone("xxx-xxx-xxxx")
                .Build()
                .setPayMethod("PayPal")
                .setToken("123")
                .Build();
        System.out.println(user);

    }
}
