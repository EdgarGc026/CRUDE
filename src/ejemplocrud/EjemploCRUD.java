/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocrud;

import driver.OperacionesCRUDE;
import java.sql.SQLException;
import models.Conectar;
/**
 *
 * @author sam
 */
public class EjemploCRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        OperacionesCRUDE operacionesCRUDE = new OperacionesCRUDE();
        operacionesCRUDE.inciarAplicacion();
    }
    
}
