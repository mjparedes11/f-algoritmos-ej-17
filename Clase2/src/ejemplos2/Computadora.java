/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos2;

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
}
