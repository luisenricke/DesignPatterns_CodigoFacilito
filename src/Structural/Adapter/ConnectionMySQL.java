package Structural.Adapter;

public class ConnectionMySQL implements IConnectionSQL {
    @Override
    public void connection() {
        System.out.println("Connection up with MySQL");
    }

    @Override
    public String runQuery() {
        return "Query with MySQL";
    }
}
