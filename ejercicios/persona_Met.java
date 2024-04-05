/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author LabSispc02
 */
public class persona_Met {
    
    private LocalDate fec_N;
   
    
    public persona_Met(){
    }

    public persona_Met(LocalDate fec_N) {
        this.fec_N = fec_N;
    }

    public LocalDate getFec_N() {
        return fec_N;
    }

    public void setFec_N(LocalDate fec_N) {
        this.fec_N = fec_N;
    }

    @Override
    public String toString() {
        return "persona_Met{" + "fec_N=" + fec_N + '}';
    }

  public Period Edad (){
  LocalDate fecha_act = LocalDate.now();
  return Period.between(fec_N, fecha_act);
  }
    
    
    
    
    
    
}
