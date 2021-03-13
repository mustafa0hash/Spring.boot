package com.apply.back.Testing;

import com.example.demo2.Person;
import com.example.demo2.Repositoryy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service2 {

    @Autowired
    Repositoryy repo;

//    public List<> getAll(){
//
//
//    }


    public void test(Person person){
//        Person p;
//        Certification c;
//        equvlance e;
//        experience exp;
//        jobTitle j;
       // p=new Person(1,"m","z","a","k","k","m",0,"077","07701","077726","musta@","as","bagh","bay"," "," "," "," "," "," ");
//        c=new Certification(1,"bsc","bagh","2019","qov");
//       exp=new experience(2,"comp","programmer","yes","1990","2021","yes");
//       j=new jobTitle(1,"prog2");

    repo.save(person);


    }

}
