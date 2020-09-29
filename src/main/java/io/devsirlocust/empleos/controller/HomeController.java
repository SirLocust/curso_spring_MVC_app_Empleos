package io.devsirlocust.empleos.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import io.devsirlocust.empleos.model.Vacante;

@Controller
public class HomeController {
    
    @GetMapping("/tabla")
    public String showTable(Model model){
        final List<Vacante> lista = getVacantes();

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


    private List<Vacante> getVacantes(){
        List<Vacante> lista = new LinkedList<>();

        try {

            final Vacante vacante = new Vacante();
            vacante.setId(1);

            vacante.setName("ingeniero de comunicaciones");
            vacante.setDescription("se solicita ingeniero parada dar soporte");
            vacante.setDate(new Date());
            vacante.setWage(9700.0);

            final Vacante vacante1 = new Vacante();
            vacante1.setId(1);

            vacante1.setName("ingeniero de comunicaciones");
            vacante1.setDescription("se solicita ingeniero parada dar soporte");
            vacante1.setDate(new Date());
            vacante1.setWage(9700.0);

            final Vacante vacante2 = new Vacante();
            vacante2.setId(1);

            vacante2.setName("ingeniero de comunicaciones");
            vacante2.setDescription("se solicita ingeniero parada dar soporte");
            vacante2.setDate(new Date());
            vacante2.setWage(9700.0);


            lista.add(vacante);
            lista.add(vacante1);
            lista.add(vacante2);


        } catch (Exception e) {
            
            System.out.println(e);
        }
        return lista;
    }
}
