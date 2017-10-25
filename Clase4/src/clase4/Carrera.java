/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

/**
 *
 * @author MIlton Paredes
 */
public class Carrera {
    private String nombre;
    private String modalidad;
    
    public void establecer_nombre(String n){
        nombre=n;
    }
    public void establecer_modalidad(String m){
        modalidad=m;
    }
    
    public String obetener_nombre(){
        return nombre;
    }
    public String obtener_modalidad(){
        return modalidad;
    }
    
    @Override
    public String toString(){
        String cadena=String.format("Carrera: %s \nModalidad; %s", obetener_nombre(),obtener_modalidad());
        return cadena;
    }
    
    public Carrera(){
        modalidad="distancia";
    }
    public Carrera(String m){
        modalidad=m;
    }
    public Carrera(String n,String m){
        modalidad=m;
        nombre=n;
    }
    

}


