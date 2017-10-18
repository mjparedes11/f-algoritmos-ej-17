/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion;

/**
 *
 * @author MIlton Paredes
 */
public class Asignatura {
    private String nombre;
    private int creditos;
    
    public void establecer_nombreA(String a){
        nombre=a;
    }
    public void establecer_creditos(int b){
        creditos=b;
    }
    
    public String obtener_nombreA(){
        return nombre;
    }
    public int obtener_creditos(){
        return creditos;
    }
    
    @Override
    public String toString(){
        String cadena=String.format("%s con número de creditos %d", obtener_nombreA(),obtener_creditos());
        return cadena;
    }
}
