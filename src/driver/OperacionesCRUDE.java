/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import java.sql.SQLException;
import java.util.List;
import models.Estudiante;
import models.ListaCRUDE;
import views.EntradaTeclado;
import views.MensajeUsuario;

/**
 *
 * @author edgargc
 */
public class OperacionesCRUDE {
     ListaCRUDE lista;
     MensajeUsuario mensajeUsuario;
     
     public OperacionesCRUDE() throws SQLException, ClassNotFoundException{
         lista = new ListaCRUDE();
         mensajeUsuario = new MensajeUsuario();
         
     }
     
     public void guardarEstudiante(String matricula,String grupo, String nombre) throws SQLException{
         Estudiante estudiante = new Estudiante(matricula, nombre, grupo);
         lista.create(estudiante);
     }
     
     public List<Estudiante> obtenerEstudiante() throws SQLException{
         List<Estudiante> estudiantes = lista.readAll();
         
         return estudiantes;
     }
     public int eliminarEstudiante(String matricula) throws SQLException{
         return lista.eliminar(matricula);
     }
     
     public int modificarEstudiante(String matricula, String matriculaNueva, String grupo,String nombre) throws SQLException{
         return lista.modificar(matricula, matriculaNueva, grupo,nombre);
     }
        
     public void operaciones(int opcion) throws SQLException{
         switch(opcion){
             case 1:
                 this.guardarEstudiante(this.mensajeUsuario.leerMatriculaEstudiante(), this.mensajeUsuario.leerNombreEstudiante(), this.mensajeUsuario.leerGrupo());
                 break;
             case 2:
                 this.mensajeUsuario.mostrarEstudiante(this.obtenerEstudiante());
                 break;
             case 3:
                 //TODO:Arreglar este problema
                 int op = this.eliminarEstudiante(this.mensajeUsuario.leerMatriculaEstudiante());
                 this.mensajeUsuario.mensajesEliminarUsuario(op);
                 break;
             case 4:
               int op2 = this.modificarEstudiante(this.mensajeUsuario.leerMatriculaEstudiante(), this.mensajeUsuario.leerNuevaMatricula(), this.mensajeUsuario.leerNombreEstudiante(), this.mensajeUsuario.leerGrupo());
                 this.mensajeUsuario.mensajeActualizarDatos(op2);
                 break;
             case 5:
                 System.out.println("\nSaliendo del programa");
                 break;
         }
     }
     
     public void inciarAplicacion() throws SQLException{
         int opcion = 0;
         do{
             this.mensajeUsuario.menu();
             opcion = this.mensajeUsuario.leerOpcion();
             this.operaciones(opcion);
         }while(opcion != 5);
     }
}