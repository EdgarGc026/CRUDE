/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author sam
 */
public class Estudiante {
     String matricula;
    String apellidoP_M_nombre;
    String grupoEstudiante;

    public Estudiante(String matricula, String apellidoP_M_nombre, String grupoEstudiante) {
        this.matricula = matricula;
        this.apellidoP_M_nombre = apellidoP_M_nombre;
        this.grupoEstudiante = grupoEstudiante;
    }

    public String getGrupoEstudiante() {
        return grupoEstudiante;
    }

    public void setGrupoEstudiante(String grupoEstudiante) {
        this.grupoEstudiante = grupoEstudiante;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getApellidoP_M_nombre() {
        return apellidoP_M_nombre;
    }

    public void setApellidoP_M_nombre(String apellidoP_M_nombre) {
        this.apellidoP_M_nombre = apellidoP_M_nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "matricula=" + matricula + ", apellidoP_M_nombre=" + apellidoP_M_nombre + ", grupoEstudiante=" + grupoEstudiante + '}';
    }
    
   
}
