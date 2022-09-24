package Services;

import Interfaces.CashierInterface;
import enums.Role;
import enums.Sex;
import models.Customer;
import models.Staff;

public class CashierService extends Staff implements CashierInterface {

    public CashierService() {
    }

    public CashierService(String email, Role role) {
        super(email, role);
    }

    public CashierService(Integer id, String name, Integer age, Sex sex, String email, Role role) {
        super(id, name, age, sex, email, role);
    }



}
