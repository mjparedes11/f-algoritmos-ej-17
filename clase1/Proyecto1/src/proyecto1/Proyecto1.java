/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;

/**
 *
 * @author MIlton Paredes
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num;
        int val;
        System.out.println("Ingrese un numero:");
        num= entrada.nextInt();
        for (int i = 0; i < 13; i++) {
            val= num *i;
            System.out.println(num+"*"+i+"="+val);
        }
    }
    
}
