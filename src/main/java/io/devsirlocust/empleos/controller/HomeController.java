package io.devsirlocust.empleos.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import io.devsirlocust.empleos.model.Vacante;
import io.devsirlocust.empleos.service.IVacanteService;

@Controller
public class HomeController {
    
    @Autowired
    private IVacanteService serviceVacante;


    @GetMapping("/tabla")
    public String showTable(final Model model){
        final List<Vacante> lista = serviceVacante.searchAll();

        model.addAttribute("vacantes", lista);

        return "tabla";


    }


    @GetMapping("/detalle")
    public String showDetail(final Model model){
        final Vacante vacante = new Vacante();
        
        vacante.setName("ingeniero de comunicaciones");
        vacante.setDescription("se solicita ingeniero parada dar soporte");
        vacante.setDate(new Date());
        vacante.setWage(9700.0);
        model.addAttribute("vacante", vacante);
        return "detalle";
    }

    @GetMapping("/listado")
    public String showList(final Model model){

        final List<String> lista = new LinkedList<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");
        lista.add("5");

        model.addAttribute("empleos", lista);
        return  "listado";
    }


    @GetMapping("/")
    public String showHome(final Model model){

        final String name = "auxiliar de contabilidad";
        final Date datePub = new Date();
        final double wage = 9000.0;
        final boolean valid = true;

        model.addAttribute("name", name);
        model.addAttribute("date", datePub);
        model.addAttribute("wage", wage);
        model.addAttribute("valid", valid);
        return "home";
    }


    
}
