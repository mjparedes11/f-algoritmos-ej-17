/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author MIlton Paredes
 */
public class Asignatura {
    private String nombre;
    private int creditos;
    private Carrera carrera;
    
    public Asignatura(Carrera a){
        carrera=a;
        nombre="Informática";
        creditos=5;
    }
    
    public void establecer_nombre(String n){
        nombre=n;
    }
    public void establecer_creditos(int c){
        creditos=c;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    public int obtener_creditos(){
        return creditos;
    }
    public Carrera obtener_carrera(){
        return carrera;
    }
    
    @Override
    public String toString(){
        String cadena=String.format("Asignatura:\n"
                + "Nombre: %s \n"
                + "Creditos: %d \n"
                + "Carrera: %s \n"
                + "Modalidad: %s ", obtener_nombre(),obtener_creditos(),carrera.obetener_nombre(),carrera.obtener_modalidad());
        return cadena;
    }
}
