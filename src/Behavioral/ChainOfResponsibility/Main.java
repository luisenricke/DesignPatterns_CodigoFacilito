package Behavioral.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Transaction transaction = new Transaction(100,200,TypeOfTransaction.INVALID);

        IManagerTransaction deposit = new Deposit();
        IManagerTransaction withdrawal = new Withdrawal();
        IManagerTransaction refund = new Refund();

        deposit.setNextManager(withdrawal);
        withdrawal.setNextManager(refund);

        deposit.executeTransaction(transaction);
    }
}
