package Services;

import Interfaces.Cashier;
import enums.Role;
import models.Staff;

public class CashierImpl extends Staff implements Cashier {

    public String sellProduct(Staff staff){
        if(!staff.getRole().equals(Role.CASHIER)){
            return "Access Denied!";
        }else{
            return "Sold!";
        }

    }

}
