package models;

import Interfaces.CustomerInterface;
import enums.ProductCategory;

public class Customer extends Products implements CustomerInterface {

    //FIELDS------------------------------------------------------------------>
    private Double cashPaid;
    private Double balance;



    //CONSTRUCTORS------------------------------------------------------------------>
    public Customer(long productId, String productName, ProductCategory category, Double ratePerUnit,
                    Integer quantity, Double cashPaid) {
        super(productId, productName, category, ratePerUnit, quantity);
        this.cashPaid = cashPaid;
    }

    public Customer(Double paidAmount, Double balance) {
    }



    //GETTERS & SETTERS------------------------------------------------------------------>
    public Double getCashPaid() {
        return cashPaid;
    }

    public void setCashPaid(Double cashPaid) {
        this.cashPaid = cashPaid;
    }


    public String getBalance() {
        String balanceStatus = "";
        if(cashPaid < getAmount()){
            balanceStatus = "Your payment is incomplete! " + "add the balance of " + (getAmount() - cashPaid);
        }else if(cashPaid > getAmount()){
            balanceStatus = "Balance is " + (cashPaid - getAmount());
        }else{
            balanceStatus += "Paid";
        }
        return  balanceStatus;
    }


    //buyProduct METHOD OF CASHIER------------------------------------------------------------------>
    @Override
    public String buyProduct() {
        if(getAmount() <= getCashPaid()){
            return "Product purchased!";
        }else{
            return "Not enough Cash to complete purchase";
        }
    }


}
