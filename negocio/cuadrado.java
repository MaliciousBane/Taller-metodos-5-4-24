/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author LabSispc02
 */
public class cuadrado {
    private double L;
    
    
    public cuadrado(){
    }

    public cuadrado(double L) {
        this.L = L;
    }

    

    public double getL() {
        return L;
    }

    public void setL(double L) {
        this.L = L;
    }

    @Override
    public String toString() {
        return "cuadrado{" + "L=" + L + '}';
    }
    
    public double perimetro(){
        double perimetro =  this.L*4;
        return perimetro;
    }
    
    public double area(){
        double area = this.L*this.L;
        return area;
    
    }
}
