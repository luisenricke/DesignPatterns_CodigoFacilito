package Behavioral.ChainOfResponsibility;

public class Refund implements IManagerTransaction {

    private IManagerTransaction next;

    @Override
    public void setNextManager(IManagerTransaction next) {
        this.next = next;
    }

    @Override
    public void executeTransaction(Transaction transaction) {
        if (transaction.getTypeOfTransaction() == TypeOfTransaction.REFUND){
            float total = transaction.getTotal() + transaction.getBalance();
            System.out.println("The result of transaction of refund is: " + total);
        }else{
            System.out.println("Invalid transaction");
        }
    }
}

