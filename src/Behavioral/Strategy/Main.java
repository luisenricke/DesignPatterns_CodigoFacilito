package Behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        Transaction transaction1= new Transaction(new Deposit());
        System.out.println(transaction1.executeTransaction(100,200));

        Transaction transaction2= new Transaction(new Withdrawal());
        System.out.println(transaction2.executeTransaction(100,200));
    }
}
