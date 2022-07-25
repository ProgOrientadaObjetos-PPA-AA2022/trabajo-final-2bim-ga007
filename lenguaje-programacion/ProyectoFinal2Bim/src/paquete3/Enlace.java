/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;
import java.sql.Statement;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Enlace {
    private Connection conn;
       
    public void establecerConexion() {  

        try {  
            String url = "jdbc:sqlite:bd/base.bd";  
            conn = DriverManager.getConnection(url);   
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarTrabajador(Trabajador trab) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            
            String data = String.format("INSERT INTO Trabajador"
                    + "(cedula, nombres, correo, sueldo, mesSueldo)"
                    + "values ('%s','%s','%s','%.2f','%s')",
                    trab.obtenerCedula(), trab.obtenerNombres(),
                    trab.obtenerCorreo(), trab.obtenerSueldo(),
                    trab.obtenerMesSueldo());
            statement.executeUpdate(data);
            obtenerConexion().close();
            
        } catch (SQLException e) {
            System.out.println("Exception: insertarTrabajador");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<Trabajador> obtenerDataTrabajador() {
        ArrayList<Trabajador> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from Trabajador;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                Trabajador trabajadores = new Trabajador(rs.getString("cedula"),
                        rs.getString("nombres"), rs.getString("correo"),
                        rs.getDouble("sueldo"), rs.getString("mesSueldo"));
                lista.add(trabajadores);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarTrabajador");
            System.out.println(e.getMessage());

        }
        return lista;
    }
}
