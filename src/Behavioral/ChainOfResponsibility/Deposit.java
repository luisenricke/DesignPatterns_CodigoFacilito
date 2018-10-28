package Behavioral.ChainOfResponsibility;

public class Deposit implements IManagerTransaction {

    private IManagerTransaction next;

    @Override
    public void setNextManager(IManagerTransaction next) {
        this.next = next;
    }

    @Override
    public void executeTransaction(Transaction transaction) {
        if (transaction.getTypeOfTransaction() == TypeOfTransaction.DEPOSIT){
            float total = transaction.getTotal() + transaction.getBalance();
            System.out.println("The result of transaction of deposit is: " + total);
        }else{
            this.next.executeTransaction(transaction);
        }
    }
}
