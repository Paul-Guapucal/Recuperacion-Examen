/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.IDAO.ElectromesticoDAO;
import ec.edu.ups.controlador.ControladorElectrodomestico;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.vista.VistaElectrodomestico;

/**
 *
 * @author paul_
 */
public class Principal {
    
    public static void main(String[] args) {
        
        VistaElectrodomestico vista = new VistaElectrodomestico();
        ElectromesticoDAO elecdao = new ElectromesticoDAO();
        Electrodomestico modelo = new Electrodomestico();
        ControladorElectrodomestico controladorelec = new ControladorElectrodomestico(vista, modelo, elecdao);
        
        System.out.println("*****Ingrese los datos de los electrodomesticos*****");
        controladorelec.registrarLavadora();
        controladorelec.registrarLavadora();
        controladorelec.registrarLavadora();
        controladorelec.verLavadoras();
        
        controladorelec.registrarTelevision();
        controladorelec.registrarTelevision();
        controladorelec.registrarTelevision();
        controladorelec.verTelevisiones();
               
    }
    
}
