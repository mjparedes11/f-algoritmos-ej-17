/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos3;

/**
 *
 * @author MIlton Paredes
 */
public class Computadora {
    private double velocidad_procesador;
    
    public void establecer_velocidad_procesador(double velo){
        if (velo<5) {
            velocidad_procesador=velo;
        } else {
            velocidad_procesador=5.0;
        }
    
}
    public double obtener_velocidad_procesador(){
        return velocidad_procesador; 
    }
    
    @Override
    public String toString(){
        String cadena= String.format("Computadora con \n" + "Velocidad %f", obtener_velocidad_procesador());
        String cadena2= String.format("Computadora con \n" + "Velocidad %f", velocidad_procesador);
        return cadena;
    }
}
