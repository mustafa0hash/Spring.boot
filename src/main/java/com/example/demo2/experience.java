package com.example.demo2;

import javax.persistence.*;

@Entity
public class experience {

    @Id   @GeneratedValue(strategy= GenerationType.AUTO)
            Integer id;



    Integer exid;

    String company;
    String job_title;
    String iscontinous;
    String first_enroll;
    String end_data;
    String work_in_another_palce;




    public experience() {
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public experience(String company, String job_title, String iscontinous, String first_enroll, String end_data, String work_in_another_palce) {

        this.company = company;
        this.job_title = job_title;
        this.iscontinous = iscontinous;
        this.first_enroll = first_enroll;
        this.end_data = end_data;
        this.work_in_another_palce = work_in_another_palce;
    }

    public Integer getExid() {
        return exid;
    }

    public void setExid(Integer exid) {
        this.exid = exid;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getIscontinous() {
        return iscontinous;
    }

    public void setIscontinous(String iscontinous) {
        this.iscontinous = iscontinous;
    }

    public String getFirst_enroll() {
        return first_enroll;
    }

    public void setFirst_enroll(String first_enroll) {
        this.first_enroll = first_enroll;
    }

    public String getEnd_data() {
        return end_data;
    }

    public void setEnd_data(String end_data) {
        this.end_data = end_data;
    }

    public String getWork_in_another_palce() {
        return work_in_another_palce;
    }

    public void setWork_in_another_palce(String work_in_another_palce) {
        this.work_in_another_palce = work_in_another_palce;
    }
}
