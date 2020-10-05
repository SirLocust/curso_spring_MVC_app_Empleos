package io.devsirlocust.empleos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/categoria")
public class CategoriasController {
    

    @GetMapping("/index")
    public String showIndex(Model model){
        return "categorias/listCategorias";
    }
    
    @GetMapping("/create")
    // @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(){
        return "categorias/formCategorias";
    }

    @PostMapping("/save")
    public String save(){
        return "categorias/listCategorias";
    }
}
