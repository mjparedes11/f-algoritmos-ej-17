/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos1;

/**
 *
 * @author MIlton Paredes
 */
public class Asignatura_Distancia extends Asignatura{
    private int numero_de_creditos;

    public Asignatura_Distancia(String n, String t, double c, int nc) {
        super(n, t, c);
        establecer_numero_de_creditos(nc);
    }
    
    public void establecer_numero_de_creditos(int nc){
        numero_de_creditos=nc;
    }
    
    public int obtener_numero_de_creditos(){
        return numero_de_creditos;
    }
    
    @Override
    public String toString(){
        String cadena=String.format("Asignatura Distancia:\n%s%d", super.toString(),obtener_numero_de_creditos());
        return cadena;
    }
}
