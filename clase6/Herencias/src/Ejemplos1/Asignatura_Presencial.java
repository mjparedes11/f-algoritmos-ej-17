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
public class Asignatura_Presencial extends Asignatura{
    public int numero_de_hora;

    public Asignatura_Presencial(String n, String t, double c, int nh) {
        super(n, t, c);
        establecer_numero_de_horas(nh);
    }
    
    public void establecer_numero_de_horas(int nh){
        numero_de_hora=nh;
    }
    
    public int obtener_numero_de_horas(){
        return numero_de_hora;
    }
    
    @Override
    public String toString(){
        String cadena=String.format("Asignatura presencial:\n%s   %d", super.toString(),obtener_numero_de_horas());
        return cadena;
    }
}
