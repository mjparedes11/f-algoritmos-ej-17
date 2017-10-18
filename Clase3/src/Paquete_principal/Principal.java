/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete_principal;

import Personal_docente.Docente;
import Personal_docente.Titulo;
import institucion.Asignatura;

/**
 *
 * @author MIlton Paredes
 */
public class Principal {
    public static void main(String[] args) {
        //Caso 1
        System.out.println("Caso 1");
        
        Asignatura b=new Asignatura();
        b.establecer_nombreA("Matemáticas ");
        b.establecer_creditos(8);
        Asignatura c=new Asignatura();
        c.establecer_nombreA("Física ");
        c.establecer_creditos(6);
        
        Titulo d=new Titulo();
        d.establecer_nombreT("Licenciado en Físico Matemáticas");
        d.establecer_nombre_universidad("Universidad Politécnica");
        Titulo e=new Titulo();
        e.establecer_nombreT("Magister en Docencia Matemática");
        e.establecer_nombre_universidad("Universidad Valenciana");
        
        Docente a=new Docente();
        a.establecer_nombres("Luis V.");
        a.establecer_apellidos("Perez J.");
        a.establecer_asignatura1(b);
        a.establecer_asignatura2(c);
        a.establecer_titulo_tercer_nivel(d);
        a.establecer_titulo_cuarto_nivel(e);
        
        System.out.println(a);
        System.out.println("\n");
        
        //Caso 2
        System.out.println("Caso 2");
        
        Asignatura f=new Asignatura();
        f.establecer_nombreA("Sociales ");
        f.establecer_creditos(9);
        Asignatura g=new Asignatura();
        g.establecer_nombreA("Literatura ");
        g.establecer_creditos(10);
        
        Titulo h=new Titulo();
        h.establecer_nombreT("Licenciado en Ciencias Sociales");
        h.establecer_nombre_universidad("Universidad Salesiana");
        Titulo i=new Titulo();
        i.establecer_nombreT("Magister en Docencia Social");
        i.establecer_nombre_universidad("Universidad Cataluña");
        
        Docente j=new Docente();
        j.establecer_nombres("Ana M.");
        j.establecer_apellidos(" Velez P.");
        j.establecer_asignatura1(f);
        j.establecer_asignatura2(g);
        j.establecer_titulo_tercer_nivel(h);
        j.establecer_titulo_cuarto_nivel(i);
        
        System.out.println(j);
        
    }
}
