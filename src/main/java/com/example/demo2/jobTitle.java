package com.example.demo2;


import javax.persistence.*;

@Entity
public class jobTitle {


    @Id @GeneratedValue(strategy = GenerationType.AUTO)
            Integer id;

    Integer j_id;



    String job_title;



    public jobTitle(String job_titl) {
//this.j_id=j_id;
        this.job_title = job_title;
    }
    public jobTitle(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getJ_id() {
        return j_id;
    }

    public void setJ_id(Integer j_id) {
        this.j_id = j_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }


}
