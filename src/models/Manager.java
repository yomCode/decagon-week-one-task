package models;

import Interfaces.ManagerInterface;
import enums.Qualification;
import enums.Role;
import enums.Sex;
import models.Staff;

public class Manager extends Staff{

    public Manager() {
    }

    public Manager(Integer id, String name, Integer age, Sex sex, Qualification qualification, String email) {
        super(id, name, age, sex, qualification, email);
    }



}
