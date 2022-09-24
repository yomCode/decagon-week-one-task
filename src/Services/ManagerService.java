package Services;

import Interfaces.ManagerInterface;
import enums.Role;
import models.Staff;

public class ManagerImpl extends Staff implements ManagerInterface {

    public String hireCashier(Staff staff){
        if(!staff.getRole().equals(Role.MANAGER)){
            return "Access Denied!";
        }else{
            return "You are fired!";
        }

    }
}
