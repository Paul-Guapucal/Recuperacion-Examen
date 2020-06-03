/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author paul_
 */
public class VistaElectrodomestico {
    
    Scanner entrada = new Scanner(System.in);
    
    public Television ingresarTelevision() {
    
        Television tele = new Television();
        System.out.println("\nIngrese los datos de la television");
        System.out.println("Ingrese el codigo de la television");
        int codigo = entrada.nextInt();
        tele.setCodigo(codigo);
        
        System.out.println("\nIngrese la descripcion del producto");
        String descripcion = entrada.next();
        tele.setDescripcion(descripcion);
        
        System.out.println("\nIngrese el precio base de la television");
        double precioBase = entrada.nextDouble();
        tele.setPrecioBase(precioBase);
        
        System.out.println("\nIngrese el color de la television");
        String color = entrada.next();
        tele.setColor(color);
        
        System.out.println("\nIngrese el consumo energetico que tiene la television");
        String consumoEnergetico = entrada.next();
        char cEnergetico = consumoEnergetico.charAt(0);
        tele.setConsumoEnergetico(cEnergetico);
        
        System.out.println("\nIngrese el peso de la television en entero por favor");
        int peso = entrada.nextInt();
        tele.setPeso(peso);
        
        System.out.println("\nIngrese la resolucion de la television");
        int resolucion = entrada.nextInt();
        tele.setResolucion(resolucion);
        
        System.out.println("\nIngrese true o false si tiene puerto HDMI");
        boolean puertoHDMI = entrada.nextBoolean();
        tele.setPuertoHDMI(puertoHDMI);
        
        return tele;
        
    }
    
    public Lavadora ingresarLavadora() {
    
        Lavadora lava = new Lavadora();
        System.out.println("\nIngrese los datos de la lavadora");
        System.out.println("Ingrese el codigo de la lavadora");
        int codigo = entrada.nextInt();
        lava.setCodigo(codigo);
        
        System.out.println("\nIngrese la descripcion del producto");
        String descripcion = entrada.next();
        lava.setDescripcion(descripcion);
        
        System.out.println("\nIngrese el precio base de la lavadora");
        double precioBase = entrada.nextDouble();
        lava.setPrecioBase(precioBase);
        
        System.out.println("\nIngrese el color de la lavadora");
        String color = entrada.next();
        lava.setColor(color);
        
        System.out.println("\nIngrese el consumo energetico que tiene la lavadora");
        String consumoEnergetico = entrada.next();
        char cEnergetico = consumoEnergetico.charAt(0);
        lava.setConsumoEnergetico(cEnergetico);
        
        System.out.println("\nIngrese el peso de la lavadora en entero por favor");
        int peso = entrada.nextInt();
        lava.setPeso(peso);
        
        System.out.println("\nIngrese la carga de la lavadora");
        int carga = entrada.nextInt();
        lava.setCarga(carga);
        
        return lava;
        
    }
    
    public void mostrarTelevisiones(List<Television> televisiones){
        
        for(Television television : televisiones){
            System.out.println("\nEstos son los datos de sus tres televisiones: " +television);
        }
        
    }
    public void mostrarLavadoras(List<Lavadora> lavadoras){
        
        for(Lavadora lavadora : lavadoras){
            System.out.println("\nEstos son los datos de sus tres lavadoras: " +lavadora);
        }
        
    }    
}
