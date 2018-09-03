/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author sam
 */
public interface GrupoDAO {
     public void create(Estudiante estudiante) throws SQLException;
    public List<Estudiante> readAll() throws SQLException;
    
    //Eliminar
   // public int eliminar(String matricula) throws SQLException;
    //public int modificar(String matricula, String matriculaNueva, String grupo,String nombre) throws SQLException;
}
