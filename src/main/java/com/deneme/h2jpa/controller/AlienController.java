package com.deneme.h2jpa.controller;

import com.deneme.h2jpa.Model.Alien;
import com.deneme.h2jpa.dao.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {

    @Autowired
    AlienRepository alienRepository;

    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }

    @RequestMapping("/addAlien")
    public String addalien(Alien alien){
        alienRepository.save(alien);
        return "home.jsp";
    }

    @RequestMapping("/getAlien")
    public ModelAndView addalien(@RequestParam int aid){
        ModelAndView mv = new ModelAndView("showAlien.jsp");
        Alien alien = alienRepository.findById(aid).orElse(new Alien());
        mv.addObject(alien);
        return mv;
    }

}

