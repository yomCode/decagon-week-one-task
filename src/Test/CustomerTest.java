package Test;

import enums.ProductCategory;
import models.Customer;
//import org.testng.annotations.Test;
import models.Products;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Products product1 = new Products(01, "Milo", ProductCategory.BEVERAGES, 150.0, 10);



    @Test
    void productIsPurchased() {
        Customer customer1 = new Customer(01, 1600.00,  product1);


        String expected = "Product purchased!";
        String actual = customer1.buyProduct();

        assertEquals(expected, actual);
    }


    @Test
    void productIsNotPurchased() {
        Customer customer1 = new Customer(01, 1300.00,  product1);

        String expected = "Not enough Cash to complete purchase";
        String actual = customer1.buyProduct();

        Assert.assertEquals(expected, actual);
    }



}
