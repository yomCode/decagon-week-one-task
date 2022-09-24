package Services;

import Interfaces.CustomerInterface;
import enums.ProductCategory;
import models.Customer;

public class CustomerService extends Customer {


    //CONSTRUCTORS------------------------------------------------------------------>

    public CustomerService(Double paidAmount, Double balance) {
        super(paidAmount, balance);
    }

    public CustomerService(long productId, String productName, ProductCategory category, Double ratePerUnit,
                           Integer paidAmount, Double balance) {
        super(productId, productName, category, ratePerUnit, paidAmount, balance);
    }





}
