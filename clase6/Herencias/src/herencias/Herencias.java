/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import Ejemplos1.Asignatura_Presencial;

/**
 *
 * @author reroes
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
        System.out.println(e);
        
        Estudiante e2=new Estudiante("Milton", "Paredes", 17, 200.2);
        System.out.println(e2);
        
        Profesor p1=new Profesor(375.20);
        System.out.println(p1.getNombre());
        
        Profesor p2=new Profesor();
        System.out.println(p2.getNombre());
        
        Profesor p3=new Profesor("Javier", "Castro", 21, 1000.50);
        System.out.println(p3.getNombre());
        System.out.println(p3.getEdad());*/
        
        Asignatura_Presencial j=new Asignatura_Presencial("Programacion", "Común", 100, 180);
        Asignatura_Presencial h=new Asignatura_Presencial("Literatura", "troncal", 300, 200);
        
        Estudiante a=new Estudiante("René", "Elizalde", 34, j, h);
        System.out.println(a);
    }
    
}
