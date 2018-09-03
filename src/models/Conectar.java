/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sam
 */
public class Conectar {
      Connection conectar = null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            System.out.println("Registrado");
            System.out.println("");
            
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/lista_estudiantes?" + "useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&user=root&password=Csgo1997" );
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
            System.out.println("\n Error");
        }
         return conectar;   
    }
}
