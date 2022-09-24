package Services;

import Interfaces.CashierInterface;
import enums.Role;
import models.Staff;

public class CashierImpl extends Staff implements CashierInterface {

    public String sellProduct(Staff staff){
        if(!staff.getRole().equals(Role.CASHIER)){
            return "Access Denied!";
        }else{
            return "Sold!";
        }

    }

}
