/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.Scanner;

/**
 *
 * @author sam
 */

    public class EntradaTeclado {
    private Scanner sc = new Scanner(System.in);
    
    public String leerCadena(){
        sc=new Scanner(System.in);
        return sc.nextLine();
    }
    
    public String nuevaMatricula(){
        sc = new Scanner(System.in);
        return sc.nextLine();
    }
    
    public int leerEntero(){
        try{
            System.out.println("Escribe un dato entero");
            return sc.nextInt(); 
        }catch(Exception e){
            return this.leerEntero();
        }
    }
}

