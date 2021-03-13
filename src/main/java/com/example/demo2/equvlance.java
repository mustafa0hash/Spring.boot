package com.example.demo2;

import javax.persistence.*;

@Entity
public class equvlance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    Integer fkey;

    String description;
    String level;
    String equv_name;

    public equvlance(String description, String level, String equv_name) {
        this.description = description;
        this.level = level;
        this.equv_name = equv_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getEquv_name() {
        return equv_name;
    }

    public void setEquv_name(String equv_name) {
        this.equv_name = equv_name;
    }

    public equvlance() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFkey() {
        return fkey;
    }

    public void setFkey(Integer fkey) {
        this.fkey = fkey;
    }
}
