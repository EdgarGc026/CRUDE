/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edgargc
 */
public class ListaCRUDE implements GrupoDAO {
    
    private final String tabla = "grupo";
    Connection conn;
    
    public ListaCRUDE() throws SQLException, ClassNotFoundException{
        conn= new Conectar().conexion();
        
   }
   
   public void create(Estudiante estudiante) throws SQLException{
      try{
         PreparedStatement consulta;
         if(estudiante != null){
            consulta = this.conn.prepareStatement("INSERT INTO " + this.tabla +
                    "(matricula, nombre, grupo) VALUES(?, ?, ?)");
            consulta.setString(1, estudiante.getMatricula());
            consulta.setString(2, estudiante.getApellidoP_M_nombre());
            consulta.setString(3, estudiante.grupoEstudiante);
         consulta.executeUpdate();
         }else{
             System.out.println("El objeto es null");
         }
      }catch(SQLException ex){
          System.out.println("En create esta el error SQL EXception");
         throw new SQLException(ex);
      }
   }
   

   
    public List<Estudiante> readAll() throws SQLException{
      List<Estudiante> estudiantes = new ArrayList<>();
      try{
         PreparedStatement consulta = conn.prepareStatement("SELECT matricula, nombre, grupo FROM " + this.tabla + " ORDER BY matricula");
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            estudiantes.add(new Estudiante(resultado.getString("matricula"), resultado.getString("nombre"), resultado.getString("grupo")));
         }
         
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return estudiantes;
    }   
    //TODO:Arreglar este metodo
   /**
    * 
    * @param matricula
    * @return 
    */
    public int eliminar(String matricula){
        try{
            PreparedStatement consulta = conn.prepareStatement("DELETE FROM " + this.tabla + " WHERE matricula = ?");
            consulta.setString(1, matricula);
            return (consulta.executeUpdate());
        }catch(SQLException ex){
            System.out.println("Fallo" + ex.getLocalizedMessage());
            
        }catch(Exception e){
            System.out.println("No te salvaste" + e.getLocalizedMessage());
        }
        return 0;
    }
    
    public int modificar(String matricula,String matriculaNueva, String grupo,String nombre){
        try{
            PreparedStatement consulta = conn.prepareStatement("UPDATE " + this.tabla + " SET matricula = ?, nombre = ?, grupo = ? WHERE matricula = ?");
            consulta.setString(1, matriculaNueva);
            consulta.setString(2, nombre);
            consulta.setString(3, grupo);
            consulta.setString(4, matricula);
            return (consulta.executeUpdate());
        }catch(SQLException ex){
            System.out.println(":c" + ex.getLocalizedMessage());
        }catch(Exception e){
            System.out.println("No te salvaste" + e.getLocalizedMessage());
        }
        return 0;
    }
}