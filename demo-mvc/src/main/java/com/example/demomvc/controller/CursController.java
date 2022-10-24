package com.example.demomvc.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demomvc.model.Curs;

@Controller
@RequestMapping("/curs")
public class CursController {
	
	private static final List<Curs> courses = new ArrayList<>();
    static {
        for(int i=0;i<10;i++){
        	courses.add(new Curs(i, "Numar "+i, "Nume "+i));
        }
    }

    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("courses", courses);
        return "courses";
    }


}