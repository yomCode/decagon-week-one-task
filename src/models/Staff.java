package models;

import enums.Role;
import enums.Sex;

public class Staff extends Store {

    //ENTITY FIELDS-------------------------
    private Sex sex;
    private String email;
    private Role role;

    //CONSTRUCTOR----------------------------

    //No Args
    public  Staff(){

    }

    //All Args
    public Staff(Integer id, String name, String location, Sex sex, String email, Role role) {
        super(id, name, location);
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


    @Override
    public String toString() {
        return "Staff{" +
                "sex=" + sex +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}
