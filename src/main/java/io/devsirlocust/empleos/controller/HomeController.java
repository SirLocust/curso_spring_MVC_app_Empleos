package io.devsirlocust.empleos.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    

    @GetMapping("/listado")
    public String showList(Model model){

        List<String> lista = new LinkedList<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");
        lista.add("5");

        model.addAttribute("empleos", lista);
        return  "listado";
    }


    @GetMapping("/")
    public String showHome(Model model){
        // model.addAttribute("message", "Hola mundo");
        // model.addAttribute("Date", new Date());

        String name = "auxiliar de contabilidad";
        Date datePub = new Date();
        double wage = 9000.0;
        boolean valid = true;

        model.addAttribute("name", name);
        model.addAttribute("date", datePub);
        model.addAttribute("wage", wage);
        model.addAttribute("valid", valid);
        return "home";
    }
}
