package Behavioral.Strategy;

public class Withdrawal implements IStrategy{
    @Override
    public float makeTransaction(float balance, float amount) {
        return balance-amount;
    }
}
