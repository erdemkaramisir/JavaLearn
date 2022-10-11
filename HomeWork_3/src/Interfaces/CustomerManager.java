package Interfaces;

public class CustomerManager {
   private  ICustomerDal customerDal;

   



    public CustomerManager(ICustomerDal customerDal) {
    this.customerDal = customerDal;
}





    public void add(){
        customerDal.add();
        //customerDal ICustomerdal' dan türediği için ICustomerdal içerisindelki add metodunu çağırıyor.
    }
}
