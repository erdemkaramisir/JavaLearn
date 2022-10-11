package Interfaces;

public class MysqlCustomerDal implements ICustomerDal {

    @Override
    public void add() {
        System.out.println(" Mysql veri tabanına eklendi");
        
    }
    
}
