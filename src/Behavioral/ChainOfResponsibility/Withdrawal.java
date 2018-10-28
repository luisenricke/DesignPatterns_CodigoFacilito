package Behavioral.ChainOfResponsibility;

public class Withdrawal implements IManagerTransaction {

    private IManagerTransaction next;

    @Override
    public void setNextManager(IManagerTransaction next) {
        this.next = next;
    }

    @Override
    public void executeTransaction(Transaction transaction) {
        if (transaction.getTypeOfTransaction() == TypeOfTransaction.WITHDRAWAL){
            float total = transaction.getTotal() - transaction.getBalance();
            System.out.println("The result of transaction of withdrawal is: " + total);
        }else{
            this.next.executeTransaction(transaction);
        }
    }
}
