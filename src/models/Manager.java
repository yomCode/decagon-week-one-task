package models;

import Interfaces.ManagerInterface;
import enums.Qualification;
import enums.Sex;
import models.Staff;

public class Manager extends Staff implements ManagerInterface {

    public Manager() {
    }

    public Manager(Integer id, String name, Integer age, Sex sex, Qualification qualification, String email) {
        super(id, name, age, sex, qualification, email);
    }


    @Override
    public String hireCashier(Applicant applicant){
        if((applicant.getAge() >= 23 && applicant.getAge()<= 30
                && applicant.getSex().equals(Sex.FEMALE))
                && applicant.getQualification().equals(Qualification.BSC)
                || applicant.getQualification().equals(Qualification.HND)
                && applicant.takeExam().equals("Passed")){
            return "You are hired!";
        }else{
            return "Sorry, you are not qualified for this position.";
        }

    }
}
