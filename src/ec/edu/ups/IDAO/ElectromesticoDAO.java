/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.IDAO;

import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author paul_
 */
public class ElectromesticoDAO implements IElectrodomesticoDAO {
    
    private Set<Electrodomestico> lista;
    private List<Lavadora> listaLavadora;
    private List<Television>listaTelevision;

    public ElectromesticoDAO() {
     lista = new TreeSet<Electrodomestico>();
     listaTelevision = new ArrayList<>();
     listaLavadora = new ArrayList<>();
     
    }
    
    @Override
    public void create(Television television) {
        lista.add(television);
    }

    @Override
    public void create(Lavadora lavadora) {
        lista.add(lavadora);
    }

    @Override
    public List<Television> listarTelevision() {
        
        Iterator<Electrodomestico> it = lista.iterator();
        
        while(it.hasNext()){
            Electrodomestico electrodomestico = it.next();
            
            if(electrodomestico instanceof Television){
                Television television = (Television) electrodomestico;
                listaTelevision.add(television);
            }
        }
        
        return listaTelevision;
    }


    @Override
    public List<Lavadora> listarLavadora() {
        
        Iterator<Electrodomestico> it = lista.iterator();
        
        while(it.hasNext()){
            Electrodomestico electrodomestico = it.next();
            
            if(electrodomestico instanceof Lavadora){
                Lavadora lavadora = (Lavadora) electrodomestico;
                listaLavadora.add(lavadora);
            }
        }

        return listaLavadora;
    }
    
}
