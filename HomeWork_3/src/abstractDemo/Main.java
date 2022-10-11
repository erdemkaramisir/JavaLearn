package abstractDemo;

public class Main {
    
    public static void main(String[] args) {
    
        CustomerManager customerManager = new CustomerManager();
        // burası önemli databaseManager seçimi buradan yapılıyor
        //customerManager.databaseManager= new OracleDatabaseManager();
        customerManager.databaseManager= new SqlServerDatabaseManager();
        customerManager.getCustomers();

    
    
    
    }
}
