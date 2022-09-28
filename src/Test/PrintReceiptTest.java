package Test;

import enums.ProductCategory;
import enums.Qualification;
import enums.Role;
import enums.Sex;
import models.Customer;
import models.PrintReceipt;
import models.Products;
import models.Staff;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PrintReceiptTest {
    Products product1 = new Products(01, "Milo", ProductCategory.BEVERAGES, 150.0, 10);
    PrintReceipt receipt = new PrintReceipt();

        @Test
        void productSoldAndReceiptIsPrinted(){
            LocalDateTime dateTime = LocalDateTime.now();
            int slipNumber = (int) (Math.random() * 1_000_000);

            Staff cashier1 = new Staff ( 323, "Adeola Johnson", 20, Sex.FEMALE, Qualification.BSC, "Adeola123@gmail.com", Role.CASHIER);
            Customer customer1 = new Customer(01, 1500.00,  product1);


            String expected = "Product sold!\n\n" + receipt.printReceipt(cashier1, customer1);

            String actual = cashier1.sellProduct(cashier1, customer1);

            assertEquals(expected, actual);
        }

        @Test
        void productNotSoldAndReceiptNotPrinted(){
            Staff cashier1 = new Staff ( 323, "Adeola Johnson", 20, Sex.FEMALE, Qualification.BSC, "Adeola123@gmail.com", Role.CASHIER);
            Customer customer1 = new Customer(01, 1400.00,  product1);

            String expected = "No product was purchased";
            String actual = receipt.printReceipt(cashier1, customer1);

            assertEquals(expected, actual);
        }
//
        @Test
        void printReceiptAccessDenied(){
            Staff manager = new Staff( 12,"Hakeem Adewale", 45, Sex.MALE, Qualification.MSC, "Adewale@gmail.com", Role.MANAGER);
            Customer customer1 = new Customer(01, 1600.00,  product1);
            PrintReceipt receipt = new PrintReceipt();


            String expected = "Access Denied!";
            String actual = receipt.printReceipt(manager, customer1);

            assertEquals(expected, actual);
        }
}
