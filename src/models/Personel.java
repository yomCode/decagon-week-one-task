package models;

import enums.Sex;

import java.util.List;

public abstract class Personel {
    //ENTITY FIELDS----------------------------------
    private Integer id;
    private String name;
    private Integer age;
    private Sex sex;

    //CONSTRUCTORS------------------------------------------------------------------>

    //Empty Args
    public Personel(){

    }

    //All Args
    public Personel(Integer id, String name, Integer age, Sex sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //GETTER & SETTERS------------------------------------------------------------------>
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Personel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
