package io.devsirlocust.empleos.service;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import io.devsirlocust.empleos.model.Vacante;

@Service
public class VacantesServiceImpl implements IVacanteService {
    
    private List<Vacante> list = null;
    public VacantesServiceImpl(){
        this.list = new LinkedList<>();

        try {

            final Vacante vacante = new Vacante();
            vacante.setId(1);

            vacante.setName("ingeniero de industrial");
            vacante.setDescription("se solicita ingeniero parada dar soporte");
            vacante.setDate(new Date());
            vacante.setWage(9700.0);
            vacante.setImage("logo1.png");

            final Vacante vacante1 = new Vacante();
            vacante1.setId(2);

            vacante1.setName("ingeniero de comunicaciones");
            vacante1.setDescription("se solicita ingeniero parada dar soporte");
            vacante1.setDate(new Date());
            vacante1.setWage(9700.0);
            vacante1.setImage("logo2.png");

            final Vacante vacante2 = new Vacante();
            vacante2.setId(3);

            vacante2.setName("ingeniero industrial");
            vacante2.setDescription("se solicita ingeniero con estudios en produccion");
            vacante2.setDate(new Date());
            vacante2.setWage(9700.0);
            vacante2.setImage("logo3.png");


            list.add(vacante);
            list.add(vacante1);
            list.add(vacante2);


        } catch (Exception e) {
            
            System.out.println(e);
        }
        
    }

    @Override
    public List<Vacante> searchAll(){

        return list;
    }

    @Override
    public Vacante searchForID(Integer idVacante){

        for( Vacante v : this.list){
            if(v.getId()==idVacante){
                return v;
            }
        }
        return null;
    }
}
