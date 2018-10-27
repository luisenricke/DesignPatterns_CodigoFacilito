package Creational.Singleton;

public class ConnectionDB {
    private static ConnectionDB conn;

    private ConnectionDB() {
    }

    public static ConnectionDB instance() {
        if (conn == null)
            conn = new ConnectionDB();
        return conn;
    }
}
