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
public class Estudiante extends Persona{
    private Asignatura_Presencial [] asignaturas=new Asignatura_Presencial [2];
    
    public Estudiante(String n, String a, int e, Asignatura_Presencial j, Asignatura_Presencial h){
        super(n, a, e);
        asignaturas [0]=j;
        asignaturas [1]=h;
    }
    
    public void setEdad(int e){
        if (e<18) {
            edad=18;
        }else{
            edad=e;
        }
    }
    
    public void establecer_asignaturas(Asignatura_Presencial a, Asignatura_Presencial b){
        asignaturas [0]=a;
        asignaturas [1]=b;
    }
    
    public Asignatura_Presencial obtener_asignatura1(){
        return asignaturas [0];
    }
    public Asignatura_Presencial obtener_asignatura2(){
        return asignaturas [1];
    }
    
    public double obtener_valor_matricula(){
        double a=0;
        for (int i = 0; i < asignaturas.length; i++) {
            a=a+asignaturas[i].obtener_costo();
        }
        return a;
    }
    
    @Override
    public String toString(){
    
        return String.format("%s\nCosto matricula: %.1f\n"
                + "Lista de asignaturas:\n%s\n%s", super.toString(), obtener_valor_matricula(),obtener_asignatura1(), obtener_asignatura2());
    }
      
}
