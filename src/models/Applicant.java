package models;

import enums.Qualification;
import enums.Sex;

public class Applicant {
    private Integer applicationId;
    private String name;
    private Integer age;
    private Sex sex;
    private String email;
    private Double examScore;
    private Qualification qualification;
    private Integer yearsOfExperience;


    public Applicant(){

    }

    public Applicant(Integer applicationId, String name, Integer age, Sex sex,
                     String email, Qualification qualification, Integer yearsOfExperience) {
        this.applicationId = applicationId;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Double getExamScore() {
        return examScore;
    }

    public void setExamScore(Double examScore) {
        this.examScore = examScore;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "applicationId=" + applicationId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", qualification=" + qualification +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }

    public String takeExam(){
        if(getExamScore() >= 85){
            return "Passed";
        }else{
            return "Failed";
        }
    }


}
