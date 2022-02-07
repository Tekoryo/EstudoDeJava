package model.service;

import java.util.List;
import java.util.function.Predicate;

import model.entities.Funcionario;

public class FilterFuncionario {
    
    public double SteamFilter(List<Funcionario>list,Predicate<Funcionario>Criterio){
        double sum=0.0;
        for(Funcionario F: list){
            if(Criterio.test(F)){
                sum+=F.getSalario();
            }
        }
        return sum;
      
    } 
}
