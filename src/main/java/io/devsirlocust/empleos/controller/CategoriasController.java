package io.devsirlocust.empleos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/categoria")
public class CategoriasController {

    @GetMapping("/index")
    public String showIndex(Model model) {
        return "categorias/listCategorias";
    }

    @GetMapping("/create")
    // @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create() {
        return "categorias/formCategorias";
    }

    @PostMapping("/save")
    // @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestParam("name") String name, @RequestParam("description") String description) {
        System.out.println(name);
        return "categorias/listCategorias";
    }
}
