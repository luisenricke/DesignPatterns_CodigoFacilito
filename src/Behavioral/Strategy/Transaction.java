package Behavioral.Strategy;

public class Transaction {
    private IStrategy strategy;

    public Transaction(IStrategy strategy) {
        this.strategy = strategy;
    }

    public float executeTransaction(float balance, float amount){
        return this.strategy.makeTransaction(balance,amount);
    }
}
