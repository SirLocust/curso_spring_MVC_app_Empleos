package io.devsirlocust.empleos.model;

import java.util.Date;

public class Vacante {
    
    private Integer id;
    private String name;
    private String description;
    private Date date;
    private Double wage;
    private String image;



    public void setImage(String img){
        this.image = img;
    }

    public String getImage(){
        return this.image;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Vacante [date=" + date + ", description=" + description + ", id=" + id + ", name=" + name + ", wage="
                + wage + "]";
    }
    
}
