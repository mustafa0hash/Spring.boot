package com.apply.back.Testing;

import com.apply.back.Testing.post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface postRepository extends JpaRepository<post,Long> {

    @Query(value = "SELECT * FROM comment left join post on pc_fk=post.exid",nativeQuery = true)
   List<String> getquery();




}
