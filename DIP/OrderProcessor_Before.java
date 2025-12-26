package ict301.solid.dip.old;

class MySQLDatabase {
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}

public class OrderProcessor {
    private MySQLDatabase database = new MySQLDatabase();

    public void processOrder(String order) {
        database.save(order);
    }
}
