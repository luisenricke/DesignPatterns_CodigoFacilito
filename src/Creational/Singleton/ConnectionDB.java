package Creational.Singleton;

public class ConnectionDB {
    private static ConnectionDB conn;

    private ConnectionDB() {
    }

    public synchronized static ConnectionDB instance() {
        if (conn == null)
            conn = new ConnectionDB();
        return conn;
    }
}
