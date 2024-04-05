/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author LabSispc02
 */
public class triangulo {
    private double base;
    private double altura;
    private double L1;
    private double L2;
    
    public triangulo(){
    }

    public triangulo(double base, double altura, double L1, double L2) {
        this.base = base;
        this.altura = altura;
        this.L1 = L1;
        this.L2 = L2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getL1() {
        return L1;
    }

    public void setL1(double L1) {
        this.L1 = L1;
    }

    public double getL2() {
        return L2;
    }

    public void setL2(double L2) {
        this.L2 = L2;
    }

    @Override
    public String toString() {
        return "triangulo{" + "base=" + base + ", altura=" + altura + ", L1=" + L1 + ", L2=" + L2 + '}';
    }
    
    public double area(){
        double area = this.base*this.altura/2;
        return area;
    
    }
    
    public double perimetro(){
        double perimetro=this.L1+this.L2+this.base;
        return 0;
    }
    
    public double hipotenusa(){
        double hipotenusa=Math.sqrt(Math.pow(L1, 2) + Math.pow(L2, 2));
        return hipotenusa;
    
    }
}
