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
public class Principal {
    public static void main(String[] args) {
        Carrera c=new Carrera();
        c.establecer_nombre("Informática");
        c.establecer_modalidad("Distancia");
        System.out.println(c);
        
        Carrera c2=new Carrera("Electrónico");
        System.out.println(c2.obtener_modalidad());
        
        Carrera c3=new Carrera("Arquitectura","presencial");
        System.out.println(c3.obtener_modalidad());
        c3.establecer_modalidad("Distancia");
        System.out.println(c3.obtener_modalidad());
        c3.establecer_modalidad(c3.obtener_modalidad().toUpperCase());
        System.out.println(c3.obtener_modalidad());
    }
}
