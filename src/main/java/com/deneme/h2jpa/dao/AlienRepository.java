package com.deneme.h2jpa.dao;

import com.deneme.h2jpa.Model.Alien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlienRepository extends CrudRepository<Alien,Integer> {

    List<Alien> findByDepartment(String department);

    List<Alien> findByAidGreaterThan(int i);

    @Query("from Alien where department=?1 order by aname")
    List<Alien> findByAidDepartmentSorted(String department);
}
