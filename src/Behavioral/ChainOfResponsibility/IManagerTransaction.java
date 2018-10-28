package Behavioral.ChainOfResponsibility;

public interface IManagerTransaction {
    void setNextManager(IManagerTransaction next);
    void executeTransaction(Transaction transaction);
}
