/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package negocio;

import java.time.LocalDate;

/**
 *
 * @author LabSispc02
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona_Met persona_F = new persona_Met(LocalDate.of(2005,4,12));
        System.out.println(persona_F.Edad()+"\n");
       
        cuadrado c_AP = new cuadrado(22);
        System.out.println("Area: "+c_AP.area());
        System.out.println("Perimetro: "+c_AP.perimetro()+"\n");
        
        triangulo t_APH = new triangulo(12, 14, 20, 21);
        
        System.out.println("Area: "+t_APH.area());
        System.out.println("Perimetro: "+t_APH.perimetro());
        System.out.println("Hipotenusa: "+t_APH.hipotenusa()+"\n");
        
        circulo cir_AP = new circulo(10);
        
        System.out.println("Area: "+cir_AP.area());
        System.out.println("Perimetro: "+cir_AP.perimetro());
    }
    
    
      
    
}
