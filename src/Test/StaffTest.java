package Test;

import enums.ProductCategory;
import enums.Qualification;
import enums.Role;
import enums.Sex;
import models.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    //Staff instances--------------------------------------------------------------------------------------------------------------->
    Staff staff1 = new Staff( 12,"Hakeem Adewale", 45, Sex.MALE, Qualification.MSC, "Adewale@gmail.com", Role.MANAGER);
    Staff staff2 = new Staff ( 323, "Adeola Johnson", 20, Sex.FEMALE, Qualification.BSC, "Adeola123@gmail.com", Role.CASHIER);

    //Applicant instances--------------------------------------------------------------------------------------------------------------->
    Applicant applicant1 = new Applicant(2332, "Ronke George", 26, Sex.FEMALE, Qualification.HND,
            "rony123@gmail.com", 86.0, 3);
    Applicant applicant2 = new Applicant(2322, "John Banks", 25, Sex.MALE, Qualification.BSC,
            "john123@gmail.com", 83.5, 3);

    //Products instances--------------------------------------------------------------------------------------------------------------->
    Products product1 = new Products(01, "Milo", ProductCategory.BEVERAGES, 150.0, 10);

    PrintReceipt receipt = new PrintReceipt();


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

        String expected = "Product sold!\n\n" + receipt.printReceipt(staff2, customer1);
        String actual = staff2.sellProduct(staff2, customer1);

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



}