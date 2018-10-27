package Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        //IConnectionSQL conn =  new ConnectionMySQL();
        IConnectionSQL conn = new AdapterDB(new ConnectionMongoDB());

        conn.connection();
        System.out.println(conn.runQuery());
    }
}
