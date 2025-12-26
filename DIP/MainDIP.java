package ict301.solid.dip;

public class Main {
    public static void main(String[] args) {
        Database db = new MySQLDatabase();
        OrderProcessor op = new OrderProcessor(db);
        op.processOrder("Commande 1");

        db = new MongoDBDatabase();
        op = new OrderProcessor(db);
        op.processOrder("Commande 2");
    }
}
