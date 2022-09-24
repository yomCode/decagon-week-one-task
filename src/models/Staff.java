package models;

import Interfaces.CashierInterface;
import Interfaces.ManagerInterface;
import enums.Qualification;
import enums.Sex;

public abstract class Staff{

    //ENTITY FIELDS-------------------------
    private Integer id;
    private String name;
    private Integer age;
    private Sex sex;
    private Qualification qualification;
    private String email;


    //CONSTRUCTOR----------------------------

    //No Args
    public  Staff(){

    }

    //All Args


    public Staff(Integer id, String name, Integer age, Sex sex, Qualification qualification, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.qualification = qualification;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", qualification=" + qualification +
                ", email='" + email + '\'' +
                '}';
    }

}
