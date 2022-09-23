package Services;

import Interfaces.Manager;
import enums.Role;
import models.Staff;

public class ManagerImpl extends Staff implements Manager {

    public String hireCashier(Staff staff){
        if(!staff.getRole().equals(Role.MANAGER)){
            return "Access Denied!";
        }else{
            return "You are fired!";
        }

    }
}
