package models;

import Interfaces.CustomerInterface;
import Reserved.PrintReceipt;
import enums.Qualification;
import enums.Sex;

public class Customer extends Person implements CustomerInterface {

    //FIELDS------------------------------------------------------------------>
    private Double cashPaid;
    private Double balance;
    private Products products;
    private PrintReceipt printReceipt;




    //CONSTRUCTORS------------------------------------------------------------------>


    public Customer(Double cashPaid, Double balance, Products products) {
        this.cashPaid = cashPaid;
        this.balance = balance;
        this.products = products;
    }

    public Customer(Integer id, Double cashPaid, Products products) {
        super(id);
        this.cashPaid = cashPaid;
        this.balance = balance;
        this.products = products;
    }

    public Customer(Double cashPaid, Double balance, Products products, PrintReceipt printReceipt) {
        this.cashPaid = cashPaid;
        this.balance = balance;
        this.products = products;
        this.printReceipt = printReceipt;
    }

    public Customer(Integer id, String name, Integer age, Sex sex, Qualification qualification, String email, Double cashPaid, Double balance, Products products, PrintReceipt printReceipt) {
        super(id, name, age, sex, qualification, email);
        this.cashPaid = cashPaid;
        this.balance = balance;
        this.products = products;
        this.printReceipt = printReceipt;
    }

    public Customer(Integer id, Double cashPaid, Double balance, Products products, PrintReceipt printReceipt) {
        super(id);
        this.cashPaid = cashPaid;
        this.balance = balance;
        this.products = products;
        this.printReceipt = printReceipt;
    }

    //GETTERS & SETTERS------------------------------------------------------------------>


    public Double getCashPaid() {
        return cashPaid;
    }

    public void setCashPaid(Double cashPaid) {
        this.cashPaid = cashPaid;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public String getBalance() {
        String balanceStatus = "";
        if(cashPaid < products.getAmount()){
            balanceStatus = "Your payment is incomplete! " + "add the balance of " + (products.getAmount() - cashPaid);
        }else if(cashPaid > products.getAmount()){
            balanceStatus = "Balance is " + (cashPaid - products.getAmount());
        }else{
            balanceStatus += "Paid";
        }
        return  balanceStatus;
    }


    //buyProduct METHOD OF CASHIER------------------------------------------------------------------>
    @Override
    public String buyProduct() {
        if(products.getAmount() <= getCashPaid()){
            return "Product purchased!";
        }else{
            return "Not enough Cash to complete purchase";
        }
    }


}
