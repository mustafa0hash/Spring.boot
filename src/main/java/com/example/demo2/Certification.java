package com.example.demo2;

import javax.persistence.*;

@Entity
public class Certification {

   @Id   @GeneratedValue(strategy= GenerationType.AUTO)
           Integer id;
    Integer person_idf;
    String degree;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    String edu_place_name;
    String Year_graduation;
    String edu_type;



    public Certification( String degree, String edu_place_name, String year_graduation, String edu_type) {
        this.degree = degree;
        this.edu_place_name = edu_place_name;
        Year_graduation = year_graduation;
        this.edu_type = edu_type;
    }

    public Certification() {

    }

    public Integer getPerson_idf() {
        return person_idf;
    }

    public void setPerson_idf(Integer person_idf) {
        this.person_idf = person_idf;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getEdu_place_name() {
        return edu_place_name;
    }

    public void setEdu_place_name(String edu_place_name) {
        this.edu_place_name = edu_place_name;
    }

    public String getYear_graduation() {
        return Year_graduation;
    }

    public void setYear_graduation(String year_graduation) {
        Year_graduation = year_graduation;
    }

    public String getEdu_type() {
        return edu_type;
    }

    public void setEdu_type(String edu_type) {
        this.edu_type = edu_type;
    }
}
