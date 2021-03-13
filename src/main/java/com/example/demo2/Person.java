package com.example.demo2;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Integer person_id;

    String first_name;
    String Second_name;
    String third_name;
    String fourth_name;
    String last_name;
    String mother_name;
    Integer card_type;
    String personal_card_no;
    String phone_no1;
    String phone_no2;
    String email;
    String foundation_info;
    String city;
    String city_madina;
    String city_kadaa;
    String city_hay;
    String near_point;
    String mahala;
    String zukak;
    String dar;
    String job_title;


   /* @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "j_id",referencedColumnName = "person_id")
    public List<jobTitle> jobTitles=new ArrayList<>();*/
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "exid",referencedColumnName = "person_id")
    public List<experience> experiences=new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fkey",referencedColumnName = "person_id")
    public List<equvlance> equvlances=new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_idf",referencedColumnName = "person_id")
    public List<Certification> certifications=new ArrayList<>();


    // constractor

    public Person( String first_name, String second_name, String third_name,String job_title,
                  String fourth_name, String last_name, String mother_name, Integer card_type, String personal_card_no,
                  String phone_no1, String phone_no2, String email, String foundation_info, String city, String city_madina,
                  String city_kadaa, String city_hay, String near_point, String mahala, String zukak, String dar) {

        this.job_title=job_title;
        this.first_name = first_name;
        Second_name = second_name;
        this.third_name = third_name;
        this.fourth_name = fourth_name;
        this.last_name = last_name;
        this.mother_name = mother_name;
        this.card_type = card_type;
        this.personal_card_no = personal_card_no;
        this.phone_no1 = phone_no1;
        this.phone_no2 = phone_no2;
        this.email = email;
        this.foundation_info = foundation_info;
        this.city = city;
        this.city_madina = city_madina;
        this.city_kadaa = city_kadaa;
        this.city_hay = city_hay;
        this.near_point = near_point;
        this.mahala = mahala;
        this.zukak = zukak;
        this.dar = dar;
    }

public Person(){

}


    // getter and setter

    @NonNull
    public Integer getPerson_id() {
        return person_id;
    }

    public List<experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<experience> experiences) {
        this.experiences = experiences;
    }

    public List<equvlance> getEquvlances() {
        return equvlances;
    }

    public void setEquvlances(List<equvlance> equvlances) {
        this.equvlances = equvlances;
    }

    public List<Certification> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<Certification> certifications) {
        this.certifications = certifications;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public void setPerson_id(@NonNull Integer person_id) {
        this.person_id = person_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return Second_name;
    }

    public void setSecond_name(String second_name) {
        Second_name = second_name;
    }

    public String getThird_name() {
        return third_name;
    }

    public void setThird_name(String third_name) {
        this.third_name = third_name;
    }

    public String getFourth_name() {
        return fourth_name;
    }

    public void setFourth_name(String fourth_name) {
        this.fourth_name = fourth_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMother_name() {
        return mother_name;
    }

    public void setMother_name(String mother_name) {
        this.mother_name = mother_name;
    }

    public Integer getCard_type() {
        return card_type;
    }

    public void setCard_type(Integer card_type) {
        this.card_type = card_type;
    }

    public String getPersonal_card_no() {
        return personal_card_no;
    }

    public void setPersonal_card_no(String personal_card_no) {
        this.personal_card_no = personal_card_no;
    }

    public String getPhone_no1() {
        return phone_no1;
    }

    public void setPhone_no1(String phone_no1) {
        this.phone_no1 = phone_no1;
    }

    public String getPhone_no2() {
        return phone_no2;
    }

    public void setPhone_no2(String phone_no2) {
        this.phone_no2 = phone_no2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoundation_info() {
        return foundation_info;
    }

    public void setFoundation_info(String foundation_info) {
        this.foundation_info = foundation_info;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity_madina() {
        return city_madina;
    }

    public void setCity_madina(String city_madina) {
        this.city_madina = city_madina;
    }

    public String getCity_kadaa() {
        return city_kadaa;
    }

    public void setCity_kadaa(String city_kadaa) {
        this.city_kadaa = city_kadaa;
    }

    public String getCity_hay() {
        return city_hay;
    }

    public void setCity_hay(String city_hay) {
        this.city_hay = city_hay;
    }

    public String getNear_point() {
        return near_point;
    }

    public void setNear_point(String near_point) {
        this.near_point = near_point;
    }

    public String getMahala() {
        return mahala;
    }

    public void setMahala(String mahala) {
        this.mahala = mahala;
    }

    public String getZukak() {
        return zukak;
    }

    public void setZukak(String zukak) {
        this.zukak = zukak;
    }

    public String getDar() {
        return dar;
    }

    public void setDar(String dar) {
        this.dar = dar;
    }
}
