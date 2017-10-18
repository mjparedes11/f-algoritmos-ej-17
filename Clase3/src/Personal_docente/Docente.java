/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal_docente;

import institucion.Asignatura;

/**
 *
 * @author MIlton Paredes
 */
public class Docente {
    private String nombres;
    private String apellidos;
    private Titulo titulo_tercer_nivel;
    private Titulo titulo_cuarto_nivel;
    private Asignatura asignatura1;
    private Asignatura asignatura2;
    
    public void establecer_nombres(String n){
        nombres=n;
    }
    public void establecer_apellidos(String a){
        apellidos=a;
    }
    public void establecer_titulo_tercer_nivel(Titulo t1){
        titulo_tercer_nivel=t1;
    }
    public void establecer_titulo_cuarto_nivel(Titulo t2){
        titulo_cuarto_nivel=t2;
    }
    public void establecer_asignatura1(Asignatura a1){
        asignatura1=a1;
    }
    public void establecer_asignatura2(Asignatura a2){
        asignatura2=a2;
    }
    
    public String obtener_nombres(){
        return nombres;
    }
    public String obtener_apellidos(){
        return apellidos;
    }
    public Titulo obetener_titulo_tercer_nivel(){
        return titulo_tercer_nivel;
    }
    public Titulo obtener_titulo_cuarto_nivel(){
        return titulo_cuarto_nivel;
    }
    public Asignatura obetner_asignatura1(){
        return asignatura1;
    }
    public Asignatura obtener_asignatura2(){
        return asignatura2;
    }
    
    @Override
    public String toString(){
        String cadena=String.format("Datos del Docente:\nNombre: %s\nApeliidos: %s\nTiene a su cargo las asignaturas:\n Asignatura 1: %s\n  Asignatura 2:%s\nEl docente tiene los siguientes títulos académicos:\n  Título 3er nivel: %s\n   Título 4er nivel: %s", obtener_nombres(),obtener_apellidos(),obetner_asignatura1(),obtener_asignatura2(),obetener_titulo_tercer_nivel(),obtener_titulo_cuarto_nivel());
        return cadena;
    }
}
