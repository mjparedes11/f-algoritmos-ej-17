/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author MIlton Paredes
 */
public class Profesor extends Persona{
    private double sueldo;
    
    public Profesor(){
        super("René", "Ramirez", 30);
    }
    
    public Profesor(double s){
        super("Milton","Paredes",20);
        establecer_sueldo(s);
    }

    public Profesor(String n, String a, int e, double s) {
        super(n, a, e);
        establecer_sueldo(s);
    }
    
    public void setEdad(int e){
        if (e<30) {
            edad=30;
        }else{
            edad=e;
        }
    }
    
    public void establecer_sueldo(double s){
        sueldo=s;
    }
    public double obtener_sueldo(){
        return sueldo;
    }
    
    public String toString(){
        String cadena=String.format("%s - %.1f",super.toString(), obtener_sueldo());
        return cadena;
    }
}
