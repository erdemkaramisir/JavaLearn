package PolymorphiszmDemo;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();

    }
}

// EmailLogger emailLogger= new EmailLogger();

// emailLogger.log(" Email logger ile loglandı");

// DatabaseLogger databaseLogger= new DatabaseLogger();
// databaseLogger.log(" olmadı be ya ");

// int[] sayilar = new int[5];

// BaseLogger[] baseLoggers= new BaseLogger[]{new DatabaseLogger(), new
// FileLogger(), new EmailLogger(), new ConsoleLogger() };

// for (BaseLogger baseLogger : baseLoggers) {
// baseLogger.log("Mesaj");
// }