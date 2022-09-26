package Test;

import enums.ProductCategory;
import enums.Qualification;
import enums.Role;
import enums.Sex;
import models.Applicant;
import models.Customer;
import models.Products;
import models.Staff;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    //Staff instances--------------------------------------------------------------------------------------------------------------->
    Staff staff1 = new Staff( 12,"Hakeem Adewale", 45, Sex.MALE, Qualification.MSC, "Adewale@gmail.com", Role.MANAGER);
    Staff staff2 = new Staff ( 323, "Adeola Johnson", 20, Sex.FEMALE, Qualification.BSC, "Adeola123@gmail.com", Role.CASHIER);

    //Applicant instances--------------------------------------------------------------------------------------------------------------->
    Applicant applicant1 = new Applicant(2332, "Ronke George", 26, Sex.FEMALE, "rony123@gmail.com",
            Qualification.HND, 3, 86.0);
    Applicant applicant2 = new Applicant(2322, "John Banks", 25, Sex.MALE, "john123@gmail.com",
            Qualification.HND, 3, 83.5);

    //Products instances--------------------------------------------------------------------------------------------------------------->
    Products product1 = new Products(01, "Milo", ProductCategory.BEVERAGES, 150.0, 10);


    //Manager Method Tests--------------------------------------------------------------------------------------------------------------->
    @Test
    void cashierIsHired(){
      String expected = "You are hired!";
      String actual = staff1.hireCashier(staff1, applicant1);

        assertEquals(expected, actual);
    }

    @Test
    void cashierIsNotHiredBasedOnExam(){
      String expected = "Sorry, you are not qualified for this position.";
      String actual = staff1.hireCashier(staff1, applicant2);

        assertEquals(expected, actual);
    }

    @Test
    void cashiertHireAccessDenied(){
      String expected = "Access Denied!";
      String actual = staff1.hireCashier(staff2, applicant1);

        assertEquals(expected, actual);
    }


    //Cashier Method Tests--------------------------------------------------------------------------------------------------------------->
    @Test
    void sellProductSuccessful(){
        Customer customer1 = new Customer(01, 1600.00,  product1);

        String expected = "Product sold!";
        String actual = staff1.sellProduct(staff2, customer1);

        assertEquals(expected, actual);
    }

    @Test
    void sellProductNotSuccessful(){
        Customer customer1 = new Customer(01, 1499.00,  product1);

        String expected = "Product not sold";
        String actual = staff1.sellProduct(staff2, customer1);

        assertEquals(expected, actual);
    }

    @Test
    void sellProductAccessDenied(){
        Customer customer1 = new Customer(01, 1500.00,  product1);

        String expected = "Access Denied!";
        String actual = staff1.sellProduct(staff1, customer1);

        assertEquals(expected, actual);
    }

    //PrintReceipt Method Tests--------------------------------------------------------------------------------------------------------------->
    @Test
    void productSoldAndReceiptIsPrinted(){
        LocalDateTime dateTime = LocalDateTime.now();
        int slipNumber = (int) (Math.random() * 1_000_000);
        Customer customer;

        Customer customer1 = new Customer(01, 1500.00,  product1);


        String expected = "RECEIPT \n" +"--------------------- \n"+ "Date: " + dateTime +"\nSlip Number: " + slipNumber +"\n\n"
                + customer1.getProducts().getProductName() +"  Qty: " +customer1.getProducts().getQuantity() +
                "   Rate: " + customer1.getProducts().getRatePerUnit() + "     Total: " + customer1.getProducts().getAmount() +
                "\nCashier: " + staff2.getName() + "\n \nGOODS BOUGHT IN GOOD CONDITION ARE NOT RETURNABLE \n"
                + "Thanks for your patronage!";

        String actual = staff2.printReceipt(staff2, customer1);

        assertEquals(expected, actual);
    }

    @Test
    void productNotSoldAndReceiptNotPrinted(){
        Customer customer1 = new Customer(01, 1499.00,  product1);

        String expected = "No product was purchased";
        String actual = staff1.printReceipt(staff2, customer1);

        assertEquals(expected, actual);
    }

    @Test
    void printReceiptAccessDenied(){
        Customer customer1 = new Customer(01, 1600.00,  product1);

        String expected = "Access Denied!";
        String actual = staff1.printReceipt(staff1, customer1);

        assertEquals(expected, actual);
    }


}