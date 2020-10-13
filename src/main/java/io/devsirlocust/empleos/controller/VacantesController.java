package io.devsirlocust.empleos.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.devsirlocust.empleos.model.Vacante;
import io.devsirlocust.empleos.service.IVacanteService;

@Controller
@RequestMapping("/vacantes")
public class VacantesController {

    private Logger logger = Logger.getLogger(VacantesController.class.getName()); 
    @Autowired
    private IVacanteService serviceVacante;

    @GetMapping("/delete")
    public String eliminar(@RequestParam("id") int idVacante){
        this.logger.info(" mesanje {idVacante}");
         return "";
    }

    @GetMapping("/view/{id}")
    public String showDetails(@PathVariable("id") final int idVacante, final Model model) {
        Vacante vacanteSearchId = serviceVacante.searchForID(idVacante);
        model.addAttribute("vacante", vacanteSearchId);

        return "vacantes/detalle";
    }

}
