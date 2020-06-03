/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author paul_
 */
public class Lavadora extends Electrodomestico {
    
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        super(codigo, descripcion, precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public double obtenerPrecioFinal() {
        double precioFinal = super.obtenerPrecioFinal();
        double precioBase = super.getPrecioBase();
        double precioLavadora = precioFinal + precioBase;
        
        if(super.getPrecioBase() > 30){
        precioLavadora = precioLavadora + 50;
        
        }
        return precioLavadora;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nLavadora{" + "carga=" + carga + "Precio final de la lavadora: "+this.obtenerPrecioFinal() + '}';
    }
    
}
