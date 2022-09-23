package models;

import java.util.List;

public abstract class Personel {
    //ENTITY FIELDS----------------------------------
    private Integer id;
    private String name;

    //CONSTRUCTORS------------------------------------

    //Empty Args
    public Personel(){

    }

    //All Args

    public Personel(Integer id, String name) {
        this.id = id;
        this.name = name;

    }


    //GETTER & SETTERS------------------------------------------
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
