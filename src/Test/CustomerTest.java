package Test;

import enums.ProductCategory;
import models.Customer;
//import org.testng.annotations.Test;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {



//    Customer customer2 = new Customer(02, "BATTERY", ProductCategory.BEVERAGES, 110.0,
//            100, 5000.0);


    @Test
    void productIsPurchased() {
//        Customer customer1 = new Customer(01, "MILO", ProductCategory.BEVERAGES, 150.0,
//                10, 1700.0);

        String expected = "Product purchased!";
//        String actual = customer1.buyProduct();

//        assertEquals(expected, actual);
    }


    @Test
    void productIsNotPurchased() {
//        Customer customer1 = new Customer(01, "MILO", ProductCategory.BEVERAGES, 150.0,
//                10, 1400.0);
        String expected = "Not enough Cash to complete purchase";
//        String actual = customer1.buyProduct();

//        Assert.assertEquals(expected, actual);
    }



}
