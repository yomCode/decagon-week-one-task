package models;

import Interfaces.CashierInterface;
import Interfaces.ManagerInterface;
import Services.CashierService;
import Services.ManagerService;
import enums.Role;
import enums.Sex;

public class Staff extends Personel implements ManagerInterface, CashierInterface {

    //ENTITY FIELDS-------------------------
    private String email;
    private Role role;
    private CashierService cashierService;
    private ManagerService managerService;

    //CONSTRUCTOR----------------------------

    //No Args
    public  Staff(){

    }

    //All Args
    public Staff(String email, Role role) {
        this.email = email;
        this.role = role;
    }

    public Staff(Integer id, String name, Integer age, Sex sex, String email, Role role) {
        super(id, name, age, sex);
        this.email = email;
        this.role = role;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    //TO_STRING METHOD


    @Override
    public String toString() {
        return "Staff{" +
                "email='" + email + '\'' +
                ", role=" + role +
                '}';
    }

    @Override
    public String hireCashier(Staff staff){
        if(!staff.getRole().equals(Role.MANAGER)){
            return "Access Denied!";
        }else{
            return "You are hired!";
        }

    }


    @Override
    public String sellProduct(Staff staff, Customer customer){
        if(staff.getRole().equals(Role.CASHIER) && customer.buyProduct().equals("Product purchased!")){
            return "Product sold!";
        }else if(staff.getRole().equals(Role.CASHIER) && customer.buyProduct().equals("Not enough Cash to complete purchase")){
            return "Product not sold";
        }else{
            return "Access denied";
        }

    }

}
