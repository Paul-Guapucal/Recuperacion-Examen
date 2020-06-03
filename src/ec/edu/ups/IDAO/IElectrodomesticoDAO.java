/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.IDAO;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;

/**
 *
 * @author paul_
 */
public interface IElectrodomesticoDAO {
 
    public void create(Television television);
    
    public void create (Lavadora lavadora);
    
    public List<Television> listarTelevision();
    
    public List<Lavadora> listarLavadora();
    
}
