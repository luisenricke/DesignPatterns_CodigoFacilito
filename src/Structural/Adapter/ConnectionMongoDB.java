package Structural.Adapter;

public class ConnectionMongoDB implements IConnectionNoSQL {
    @Override
    public void connection() {
        System.out.println("Connection up with MongoDB");
    }

    @Override
    public String executeQuery() {
        return "Query with MongoDB";
    }
}
