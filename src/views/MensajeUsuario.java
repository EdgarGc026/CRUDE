/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;
import java.util.List;
import java.util.Scanner;
import models.Estudiante;

/**
 *Since 28 agosto 2018
 * @author edgargc
 */
public class MensajeUsuario {
    private EntradaTeclado entradaTeclado;
    /**
     * Aclarar cualquier elemento que fuera necesario
     */
        public MensajeUsuario(){
            entradaTeclado = new EntradaTeclado();
        }
        
        public String leerNuevaMatricula(){
            System.out.println("Introdusca la nueva matricula del estudiante");
            return entradaTeclado.nuevaMatricula();
        }
        /**
         * Imprime el menu de las opciones del programa
         */
        public void menu(){
            System.out.println("\n");
            System.out.println("Lista de estudiantes");
            System.out.println("[1] Agregar estudiante");
            System.out.println("[2] Mostrar Estudiante");
            System.out.println("[3] Eliminar Estudiante");
            System.out.println("[4] Modificar Estudiante");
            System.out.println("[5] Salir");
        }
        /**
         * Este metodo puede ser modificado para que realice validacion de la 
         * matricula
         * @return la matricula leida desde el teclado
         */
        public String leerMatriculaEstudiante(){
            System.out.println("\nIntroduce tu matricula:\n");
            return entradaTeclado.leerCadena();
        }
        /**
         * Pudiera validad que no se capturen valores numericos 
         * @return el nombre del estudiante
         */
        public String leerNombreEstudiante(){
            System.out.println("\nIntroduce nombre:\n");
            return entradaTeclado.leerCadena();
        }
        /**
         * Permite leer entero desde el teclado para saber la opcion que desea
         * el usuario
         * @return un entero que inidica el valor
         */
        public int leerOpcion(){
            System.out.println("Â¿Cual es tu opcion?");
            return entradaTeclado.leerEntero();
        }
        
        /**
         * Indica al usuario si el registro fue eliminado o no lo fue
         * @param resultado 
         */
        public void mensajesEliminarUsuario(int resultado){
            if(resultado == 1){
                System.out.println("\nRegistro eliminado\n");
            }else{
                System.out.println("\nEl registro no fue eliminado\n");
            }
        }     
        
        public void mensajeModificarEstudiante(int resultado){
            if(resultado == 1){
                System.out.println("Registro modificado");
            }else{
                System.out.println("No eliminado");
            }
        }
        
        public void mensajeModificarMatricula(int resultado){
            if(resultado == 1){
                System.out.println("Registro modificado");
            }else{
                System.out.println("No eliminado");
            }
        }
        
        public void mensajeActualizarDatos(int actualizacion){
            if(actualizacion == 1){
                System.out.println("Registro dado");
            }else{
                 System.out.println("Error");;
            }
        }
        
        /**
         * Muestra la lista de estudiante la cual recibe de la consulta a la
         * base de datos
         * @param lista 
         */
        public void mostrarEstudiante(List<Estudiante> lista){
             for(int indice = 0; indice < lista.size(); indice++){
                 System.out.println(lista.get(indice));
             }
        }
}
