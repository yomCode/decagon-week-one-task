package models;

import Interfaces.CashierInterface;
import Interfaces.ManagerInterface;
import enums.Qualification;
import enums.Role;
import enums.Sex;

public class Staff extends Person implements ManagerInterface, CashierInterface {

    private Role role;


    //CONSTRUCTOR----------------------------

    //No Args
    public  Staff(){

    }

    //All Args


    public Staff(Role role) {
        this.role = role;
    }

    public Staff(Integer id, String name, Integer age, Sex sex, Qualification qualification, String email, Role role) {
        super(id, name, age, sex, qualification, email);
        this.role = role;
    }

    public Staff(Integer id, String name, Integer age, Sex sex, Qualification qualification, String email) {
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "Staff{" +
                "role=" + role +
                '}';
    }






    @Override
    public String sellProduct(Staff staff, Customer customer){
        //unique Field---------------------------------------------------->
        PrintReceipt printReceipt;
        PrintReceipt receipt = new PrintReceipt();
        customer.getProducts().reduceQty(customer.getProducts());

        if(staff.getRole().equals(Role.CASHIER)){
            if(customer.buyProduct().equals("Product purchased!")){
                return "Product sold!\n\n" + receipt.printReceipt(staff, customer);
            }else{
                return "Product not sold";
            }

        }else{
            return "Access Denied!";
        }

    }

}
