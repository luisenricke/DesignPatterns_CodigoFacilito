package Behavioral.ChainOfResponsibility;

public class Transaction {
    private float total, balance;
    private TypeOfTransaction typeOfTransaction;

    public Transaction(float total, float balance, TypeOfTransaction typeOfTransaction) {
        this.total = total;
        this.balance = balance;
        this.typeOfTransaction = typeOfTransaction;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public TypeOfTransaction getTypeOfTransaction() {
        return typeOfTransaction;
    }

    public void setTypeOfTransaction(TypeOfTransaction typeOfTransaction) {
        this.typeOfTransaction = typeOfTransaction;
    }
}
