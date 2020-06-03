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
public class Television extends Electrodomestico {
    
    private int resolucion;
    private boolean puertoHDMI;

    public Television() {
    }

    public Television(int resolucion, boolean puertoHDMI, int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        super(codigo, descripcion, precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.puertoHDMI = puertoHDMI;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    
    @Override
    public double obtenerPrecioFinal() {
        double precioFinal = super.obtenerPrecioFinal();
        double precioBase = super.getPrecioBase();
        double precioTelevision = precioFinal + precioBase;
        
        if(this.resolucion>40){
            precioTelevision = (precioTelevision*0.3) + 50;
        }
        
        if(this.puertoHDMI == true){
            precioTelevision = precioTelevision + 50;
        }
        return precioTelevision;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nTelevision{" + "resolucion=" + resolucion + ", puertoHDMI=" + puertoHDMI +
                "\nPrecio final de la television: "+this.obtenerPrecioFinal() + '}';
    }
    
}
