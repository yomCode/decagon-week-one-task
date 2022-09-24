package Test;

import enums.ProductCategory;
import models.Customer;
//import org.testng.annotations.Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer customer1 = new Customer(01, "MILO", ProductCategory.BEVERAGES, 150.0,
            10, 1700.0);
    @Test
    void getCashPaid() {
       double expected = customer1.getCashPaid();
       double actual = 1700.0;

        assertEquals(expected, actual);
    }

    @Test
    void setCashPaid() {
//        Double expected = customer1.setCashPaid();
        Double actual = customer1.getCashPaid();
    }

    @Test
    void getBalance() {
    }

    @Test
    void buyProduct() {
    }
}