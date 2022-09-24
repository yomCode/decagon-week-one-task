package models;

import Interfaces.PrintReceiptInterface;
import enums.ProductCategory;

import java.time.LocalDateTime;

public class PrintReceipt extends Customer implements PrintReceiptInterface {

    //FIELDS-------------------------------------------------------------------------->
    private static LocalDateTime dateTime;
    private static Integer slipNumber;

    public PrintReceipt(long productId, String productName, ProductCategory category, Double ratePerUnit,
                        Integer quantity, Double paidAmount, LocalDateTime dateTime, Integer slipNumber) {
        super(productId, productName, category, ratePerUnit, quantity, paidAmount);
        PrintReceipt.dateTime = dateTime;
        PrintReceipt.slipNumber = slipNumber;
    }

    public PrintReceipt(Double paidAmount, Double balance, LocalDateTime dateTime, Integer slipNumber) {
        super(paidAmount, balance);
        PrintReceipt.dateTime = dateTime;
        PrintReceipt.slipNumber = slipNumber;
    }

    public PrintReceipt(long productId, String productName, ProductCategory category, Double ratePerUnit,
                        Integer quantity, Double cashPaid) {
        super(productId, productName, category, ratePerUnit, quantity, cashPaid);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        PrintReceipt.dateTime = dateTime;
    }

    public static Integer getSlipNumber() {
        slipNumber = (int) (Math.random() * 1_000_000_000) ;

        return slipNumber;
    }

    public void setSlipNumber(Integer slipNumber) {
        PrintReceipt.slipNumber = slipNumber;
    }

    @Override
    public String toString() {
        return "PrintReceiptService{" +
                "dateTime=" + dateTime +
                ", slipNumber=" + slipNumber +
                '}';
    }


    public static String printReceipt(Cashier cashier, Customer customer){
        LocalDateTime dateTime = LocalDateTime.now();
        if(cashier.sellProduct(customer).equals("Product sold!")){
            return "RECEIPT \n" +"--------------------- \n"+ "Date: " + dateTime +"\nSlip Number: " + getSlipNumber() +"\n\n"
                    + customer.getProductName() +"  Qty: " +customer.getQuantity() + "   Rate: " + customer.getRatePerUnit()
                    + "     Total: " + customer.getAmount() + "\nCashier: " + cashier.getName()
                    + "\n \nGOODS BOUGHT IN GOOD CONDITION ARE NOT RETURNABLE \n" + "Thanks for your patronage!" ;
        }else{
            return "No product was purchased";
        }
    }

}
