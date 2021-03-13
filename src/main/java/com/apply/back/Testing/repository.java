package com.apply.back.Testing;


import com.apply.back.Testing.Topics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface repository extends JpaRepository<Topics,Integer > {

    List<Topics> findBynameContaining(String name);

}
