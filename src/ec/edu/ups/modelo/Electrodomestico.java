/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paul_
 */
public class Electrodomestico implements Comparable<Electrodomestico> {
    
    private int codigo;
    private String descripcion;
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;
    private List<Electrodomestico> electrodomesticos;

    public Electrodomestico() {
    }

    public Electrodomestico(int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        electrodomesticos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double obtenerPrecioFinal() {
        int precioAdicional = 0;
        int precioAdicionalPeso = 0;
        
        if (consumoEnergetico == 'A') {
            precioAdicional = 100;

        } else if (consumoEnergetico == 'B') {
            precioAdicional = 80;

        } else if (consumoEnergetico == 'C') {
            precioAdicional = 60;

        } else if (consumoEnergetico == 'D') {
            precioAdicional = 50;

        } else if (consumoEnergetico == 'E') {
            precioAdicional = 30;

        } else if (consumoEnergetico == 'F') {
            precioAdicional = 10;

        }
        
        if(peso>0 && peso<19){
            precioAdicionalPeso = 10;
            
        }else if(peso>19 && peso<50){
            precioAdicionalPeso = 50;
            
        }else if(peso>50 && peso<79){
            precioAdicionalPeso = 80;
            
        }else if(peso>79){
            precioAdicionalPeso = 100;
            
        }
        return precioBase = (precioBase + precioAdicional + precioAdicionalPeso);
    }

    public int compareTo(Electrodomestico p){
        
        return (int) (this.precioBase-p.precioBase);
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Electrodomestico other = (Electrodomestico) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

        @Override
        public String toString
        
            () {
        return "\nDatos del electrodomestico{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
        
    }
}
