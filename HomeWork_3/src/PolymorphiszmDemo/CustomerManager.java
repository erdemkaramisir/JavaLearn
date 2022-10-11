package PolymorphiszmDemo;

import Interfaces.OracleCustomerDal;

public class CustomerManager {
    private BaseLogger logger;
    public OracleCustomerDal customerDal;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println(" Müşteri eklendi ... ");
        this.logger.log("eklendi");
    }
}
