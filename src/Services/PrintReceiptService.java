package Services;

import Interfaces.PrintReceiptInterface;
import enums.ProductCategory;
import enums.Role;
import models.Customer;
import models.Staff;

import java.time.LocalDateTime;

public class PrintReceiptService extends Customer implements PrintReceiptInterface {

    //FIELDS-------------------------------------------------------------------------->
    private static LocalDateTime dateTime;
    private static Integer slipNumber;

    public PrintReceiptService(long productId, String productName, ProductCategory category, Double ratePerUnit,
                               Integer quantity, Double paidAmount, LocalDateTime dateTime, Integer slipNumber) {
        super(productId, productName, category, ratePerUnit, quantity, paidAmount);
        PrintReceiptService.dateTime = dateTime;
        PrintReceiptService.slipNumber = slipNumber;
    }

    public PrintReceiptService(Double paidAmount, Double balance, LocalDateTime dateTime, Integer slipNumber) {
        super(paidAmount, balance);
        PrintReceiptService.dateTime = dateTime;
        PrintReceiptService.slipNumber = slipNumber;
    }

    public PrintReceiptService(long productId, String productName, ProductCategory category, Double ratePerUnit,
                               Integer quantity, Double cashPaid) {
        super(productId, productName, category, ratePerUnit, quantity, cashPaid);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        PrintReceiptService.dateTime = dateTime;
    }

    public static Integer getSlipNumber() {
        slipNumber = (int) (Math.random() * 1_000_000_000) ;

        return slipNumber;
    }

    public void setSlipNumber(Integer slipNumber) {
        PrintReceiptService.slipNumber = slipNumber;
    }

    @Override
    public String toString() {
        return "PrintReceiptService{" +
                "dateTime=" + dateTime +
                ", slipNumber=" + slipNumber +
                '}';
    }


    public  static String printReceipt(Staff staff, Customer customer){
        LocalDateTime dateTime = LocalDateTime.now();
        if(staff.getRole().equals(Role.CASHIER) ){
            return "RECEIPT \n" +"--------------------- \n"+ "Date: " + dateTime +"\nSlip Number: " + getSlipNumber() +"\n\n"
                    + customer.getProductName() +"  Qty: " +customer.getQuantity() + "   Rate: " + customer.getRatePerUnit()
                    + "     Total: " + customer.getAmount() + "\nCashier: " + staff.getName()
                    + "\n \nGOODS BOUGHT IN GOOD CONDITION ARE NOT RETURNABLE \n" + "Thanks for your patronage!" ;
        }else{
            return "Access Denied!";
        }
    }

}
