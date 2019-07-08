package com.company.company.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
}
