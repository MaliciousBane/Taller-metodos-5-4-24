/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author LabSispc02
 */
public class circulo {
    private double r;
    
    public circulo(){
    }

    public circulo(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "circulo{" + "r=" + r + '}';
    }
    
    public double area(){
        double area=(this.r*this.r)*3.14;
        return area;
    }
    
    public double perimetro(){
        double perimetro=(2*3.14)*this.r;
        return perimetro;
      
    }
    
}
