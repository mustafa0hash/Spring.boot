package com.apply.back.Testing;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bServices {
    @Autowired
    repository r;

/*
    List<Topics> list= new ArrayList<>(Arrays.asList(
            new Topics("java","dec1"),
            new Topics("spring","desc2")

    ));
*/

    public List<Topics> getList() {
        //return list;

        return r.findAll();
    }

    public Topics getitem(Integer id){
      //return  list.stream().filter(t->t.getName().equals(exid)).findFirst().get();
       // return r.findAll().stream().filter(t->t.getName().equals(exid)).findFirst().get();
        return r.findById(id).get();

    }

    public void addtopic(Topics topics) {
      //  list.add(topics);
        r.save(topics);
    }

    public void updatetopic(String id, Topics topics) {
       /* for(int i=0;i<list.size();i++){
            Topics t=list.get(i);
            if (t.getName().equals(exid)){
                list.set(i,topics);
                return;
            }

        }*/
         r.save(topics);
    }

    public void deletetopic(String id) {
        /*for (int i=0;i<list.size();i++){
            Topics t=list.get(i);
            if (t.getName().equals(exid)){
                list.remove(t);
            }
        }*/
       // list.removeIf(t->t.getName().equals(exid));
        r.delete(r.findAll().stream().filter(t->t.getName().equals(id)).findFirst().get());
    }

    public List<Topics> foundornot(String var) {
        return r.findBynameContaining(var);
    }
}
