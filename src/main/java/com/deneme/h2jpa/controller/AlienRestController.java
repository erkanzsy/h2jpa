package com.deneme.h2jpa.controller;

import com.deneme.h2jpa.Model.Alien;
import com.deneme.h2jpa.dao.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AlienRestController {

    @Autowired
    AlienRepository alienRepository;

    @RequestMapping("/aliens")
    public List<Alien> aliens(){
        return (List<Alien>) alienRepository.findAll();
    }

    @RequestMapping("/alien/{id}")
    public Optional<Alien> alienFindById(@PathVariable int id){
        return alienRepository.findById(id);
    }

    @RequestMapping("/idgreaterthan/{id}")
    public List<Alien> alienFindByIdgreater(@PathVariable int id){
        return alienRepository.findByAidGreaterThan(id);
    }

    @RequestMapping(value = "/addAlien", method = RequestMethod.POST)
    public List<Alien> createAlien(@RequestBody Alien alien){
        alienRepository.save(alien);
        return (List<Alien>) alienRepository.findAll();
    }

    @RequestMapping(value = "/deleteAlien/{aid}")
    public List<Alien> deleteAlien(@PathVariable int aid){
        alienRepository.deleteById(aid);
        return (List<Alien>) alienRepository.findAll();
    }

}
