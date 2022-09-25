package models;

import Interfaces.CashierInterface;
import enums.Qualification;
import enums.Role;
import enums.Sex;

public class Cashier extends Staff {


    public Cashier() {
    }

    public Cashier(Integer id, String name, Integer age, Sex sex, Qualification qualification, String email) {
        super(id, name, age, sex, qualification, email);
    }



}

