package models;

import Interfaces.CashierInterface;
import Interfaces.ManagerInterface;
import Interfaces.PrintReceiptInterface;
import enums.Qualification;
import enums.Role;
import enums.Sex;

import java.time.LocalDateTime;

public class Staff extends Person implements ManagerInterface, CashierInterface, PrintReceiptInterface {

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
    public String hireCashier(Staff staff, Applicant applicant){

        if(staff.getRole().equals(Role.MANAGER)){
            if((applicant.getAge() >= 23 && applicant.getAge()<= 30)
                    && applicant.getSex().equals(Sex.FEMALE)
                    && (applicant.getQualification().equals(Qualification.BSC)
                    || applicant.getQualification().equals(Qualification.HND))
                    && applicant.takeExam().equals("Passed")){
                return "You are hired!";
            }else{

                return "Sorry, you are not qualified for this position.";
            }



        }else{
            return "Access Denied!";
        }

    }

    @Override
    public String sellProduct(Staff staff, Customer customer){
//        if(customer.buyProduct().equals("Product purchased!")){
//            return "Product sold!";
//        }else{
//            return "Product not sold";
//        }

        if(staff.getRole().equals(Role.CASHIER)){
            if(customer.buyProduct().equals("Product purchased!")){
                return "Product sold!";
            }else{
                return "Product not sold";
            }

        }else{
            return "Access Denied!";
        }

    }
    @Override
    public String printReceipt(Staff staff, Customer customer){
        LocalDateTime dateTime;
        Integer slipNumber;

        dateTime = LocalDateTime.now();
        slipNumber = (int) (Math.random() * 1_000_000);

        if(staff.getRole().equals(Role.CASHIER)){
            if(customer.buyProduct().equals("Product purchased!")){
                return "RECEIPT \n" +"--------------------- \n"+ "Date: " + dateTime +"\nSlip Number: " + slipNumber +"\n\n"
                        + customer.getProducts().getProductName() +"  Qty: " +customer.getProducts().getQuantity() +
                        "   Rate: " + customer.getProducts().getRatePerUnit() + "     Total: " + customer.getProducts().getAmount() +
                        "\nCashier: " + staff.getName() + "\n \nGOODS BOUGHT IN GOOD CONDITION ARE NOT RETURNABLE \n"
                        + "Thanks for your patronage!" ;
            }else{
                return "No product was purchased";
            }
        }else{
            return "Access Denied!";
        }
    }
}
