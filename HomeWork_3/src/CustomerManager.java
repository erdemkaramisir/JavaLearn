import Interfaces.ICustomerDal;

public class CustomerManager {

    ICustomerDal customerDal;

    public void add() {

        customerDal.add();
    }
}
