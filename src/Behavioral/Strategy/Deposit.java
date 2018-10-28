package Behavioral.Strategy;

public class Deposit implements IStrategy {
    @Override
    public float makeTransaction(float balance, float amount) {
        return balance+amount;
    }
}
