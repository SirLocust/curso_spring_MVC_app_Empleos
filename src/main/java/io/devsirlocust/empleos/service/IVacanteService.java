package io.devsirlocust.empleos.service;

import java.util.List;

import io.devsirlocust.empleos.model.Vacante;

public interface IVacanteService {

    List<Vacante> searchAll();
    Vacante searchForID(Integer idVacante); 
    
}
