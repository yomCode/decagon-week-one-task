package models;

import Interfaces.CashierInterface;
import enums.Qualification;
import enums.Sex;

public class Cashier extends Staff implements CashierInterface {

    public Cashier() {
    }

    public Cashier(Integer id, String name, Integer age, Sex sex, Qualification qualification, String email) {
        super(id, name, age, sex, qualification, email);
    }

    @Override
    public String sellProduct(Customer customer){
        if(customer.buyProduct().equals("Product purchased!")){
            return "Product sold!";
        }else{
            return "Product not sold";
        }

    }

}

