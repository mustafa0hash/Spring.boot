package com.example.demo2;


import com.apply.back.Testing.Topics;
import com.apply.back.Testing.bServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@RestController
public class Controller {




    // dependence injection
    @Autowired
    experRepo experRepo;

    @Autowired
    certRepo certRepo;

    @Autowired
    equvRepo equvRepo;
    @Autowired
    Repositoryy repositoryy;



    // test connection
    @RequestMapping("/hello")
    public String hi(){

        return "hi connection is ready";
    }



    //search
    //Todo asyc between front and back
    //todo best search
    //todo send and receive picture
    //todo host the api






    // get all infromation related to person

    @GetMapping("/v1/getAll")
    public List<Person> find(){
        return repositoryy.findAll();
    }

    // insert person information

    @PostMapping("/v1/insert")
    public void getdata(@RequestBody List<Person> p){
        repositoryy.save(p.get(0));
    }

    //################################################################################


    // insert if the person have many experiencs in different fields

    @PostMapping("/v1/exper")
    public void insertExper(@RequestBody experience experiences){

        experRepo.save(experiences);
    }

    //  insert if the person have many certifications
    @PostMapping("/v1/certification")
    public void insertExper(@RequestBody Certification certification){

        certRepo.save(certification);
    }
    //  insert if the person have many equvlances
    @PostMapping("/v1/equvlance")
    public void insertExper(@RequestBody equvlance equvlance){

        equvRepo.save(equvlance);
    }


    // edit information
    @PutMapping("/v1/EditPerson")
    public void Edit(@RequestBody List<Person> p){
        repositoryy.save(p.get(0));
    }

    // edit specific information
    @PutMapping("/v1/exper")
    public void Editexper(@RequestBody experience experience){
        experRepo.save(experience);
    }

    // edit certification info
    @PutMapping("/v1/certification")
    public void EditCert(@RequestBody Certification certification){
        certRepo.save(certification);

    }

    // edit specific info
    @PutMapping("/v1/equvlance")
    public void EditEquvalnce(@RequestBody equvlance equvlance){
        equvRepo.save(equvlance);
    }
    // delete person with id
    @DeleteMapping("/v1/deletePerson")
    public void DeletePerson(@RequestBody Person p){
        repositoryy.delete(p);
    }


    // delete by name     ** need improve **
    @DeleteMapping("/v1/delete/{id}")
    public void deletepersonName(@PathVariable Integer id){
        repositoryy.delete(repositoryy.findAll().stream().filter(t->t.getPerson_id().equals(id)).findFirst().get());
    }

    // Search by name to get  ** need improve **
    @GetMapping("/v1/read/{name}")
    public List<Person> getByName(@PathVariable String name ){
        return null;  // repositoryy.findByfirstnameContaining(name);
    }

}
