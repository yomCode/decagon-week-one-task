package Interfaces;

import models.Customer;
import models.Staff;

public interface PrintReceiptInterface {
    public String printReceipt(Staff staff, Customer customer);
}
