package models;

import Interfaces.PrintReceiptInterface;
import enums.ProductCategory;
import enums.Qualification;
import enums.Role;
import enums.Sex;

import java.time.LocalDateTime;

public class PrintReceipt extends Customer implements PrintReceiptInterface {

    //FIELDS-------------------------------------------------------------------------->
    private  LocalDateTime dateTime;
    private static Integer slipNumber;
    private Products products;
    private Customer customer;

    public PrintReceipt(Double cashPaid, Double balance, Products products, LocalDateTime dateTime, Integer slipNumber, Products products1) {
        super(cashPaid, balance, products);
        this.dateTime = dateTime;
        this.slipNumber = slipNumber;
        this.products = products1;
    }

    public PrintReceipt(Double cashPaid, Double balance, Products products, LocalDateTime dateTime, Integer slipNumber, Products products1, Customer customer) {
        super(cashPaid, balance, products);
        this.dateTime = dateTime;
        this.slipNumber = slipNumber;
        this.products = products1;
        this.customer = customer;
    }

    public PrintReceipt(Integer id, Double cashPaid, Products products, LocalDateTime dateTime, Integer slipNumber, Products products1, Customer customer) {
        super(id, cashPaid, products);
        this.dateTime = dateTime;
        this.slipNumber = slipNumber;
        this.products = products1;
        this.customer = customer;
    }



    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getSlipNumber() {
        return slipNumber;
    }

    public void setSlipNumber(Integer slipNumber) {
        this.slipNumber = slipNumber;
    }

    @Override
    public Products getProducts() {
        return products;
    }

    @Override
    public void setProducts(Products products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "PrintReceipt{" +
                "dateTime=" + dateTime +
                ", slipNumber=" + slipNumber +
                ", products=" + products +
                '}';
    }

    public static String printReceipt(Staff staff, Customer customer){
        LocalDateTime dateTime = LocalDateTime.now();
        slipNumber = (int) (Math.random() * 1_000_000);

        if(staff.getRole().equals(Role.CASHIER)){
            if(customer.buyProduct().equals("Product purchased!")){
            return "RECEIPT \n" +"--------------------- \n"+ "Date: " + dateTime +"\nSlip Number: " + slipNumber +"\n\n"
                    + customer.getProducts().getProductName() +"  Qty: " +customer.getProducts().getQuantity() +
                    "   Rate: " + customer.getProducts().getRatePerUnit() + "     Total: " + customer.getProducts().getAmount() +
                    "\nCashier: " + staff.getName() + "\n \nGOODS BOUGHT IN GOOD CONDITION ARE NOT RETURNABLE \n"
                    + "Thanks for your patronage!" ;
        }else{
            return "No product was purchased";
        }
        }else{
            return "Access Denied!";
        }
    }

}
