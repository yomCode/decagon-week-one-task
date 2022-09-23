package models;

import Interfaces.Manager;
import enums.Role;
import enums.Sex;

public class Staff extends Personel{

    //ENTITY FIELDS-------------------------
    private Sex sex;
    private String email;
    private Role role;

    //CONSTRUCTOR----------------------------

    //No Args
    public  Staff(){

    }

    //All Args


//    public Staff(Sex sex, String email, Role role) {
//        this.sex = sex;
//        this.email = email;
//        this.role = role;
//    }

    public Staff(Integer id, String name, Sex sex, String email, Role role) {
        super(id, name);
        this.sex = sex;
        this.email = email;
        this.role = role;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
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
                "sex=" + sex +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }


}
