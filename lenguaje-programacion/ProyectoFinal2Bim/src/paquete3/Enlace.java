/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;
import paquete2.*;
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
    
    public void insertarPlanCelular(PlanCelular planCel) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            
            String data = String.format("INSERT INTO PlanCelular"
                    + "(cedula, nombres, correo, sueldo, mesSueldo)"
                    + "values ('%s','%s','%s','%s','%s','%s','%.2f')",
                    planCel.obtenerNombres(), planCel.obtenerCedula(),
                    planCel.obtenerCiudad(), planCel.obtenerMarcaCelular(),
                    planCel.obtenerModeloCelular(), planCel.obtenerNumeroCelular(),
                    planCel.obtenerPagoMensual());
            statement.executeUpdate(data);
            obtenerConexion().close();
            
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanCelular");
            System.out.println(e.getMessage());

        }
    }
    
    public void insertarPlanPostPagoMegas(PlanPostPagoMegas planMega) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            
            String data = String.format("INSERT INTO PlanPostPagoMegas"
                    + "(megasGB, costoGB, tarifaBase)"
                    + "values ('%d','%.2f','%.2f')",
                    planMega.obtenerMegasGB(), planMega.obtenerCostoGB(),
                    planMega.obtenerTarifaBase());
            statement.executeUpdate(data);
            obtenerConexion().close();
            
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMegas");
            System.out.println(e.getMessage());

        }
    }
    
    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos planMins) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            
            String data = String.format("INSERT INTO PlanPostPagoMinutos"
                    + "(minsNaci, costoMinsNaci, minsInt, costoMinsInt)"
                    + "values ('%.2f','%.2f','%.2f','%.2f')",
                    planMins.obtenerMinutosNacionales(), planMins.obtenerCostoMinutosNacionales(),
                    planMins.obtenerMinutosInternacionales(), planMins.obtenerCostoMinutosInternacionales());
            statement.executeUpdate(data);
            obtenerConexion().close();
            
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMinutos");
            System.out.println(e.getMessage());

        }
    }
    
    public void insertarPostPagoMinutosMegas(PostPagoMinutosMegas planMinsMega) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            
            String data = String.format("INSERT INTO PostPagoMinutosMegas"
                    + "(minutos, costoMins, megasGB, costoMinsInt)"
                    + "values ('%.2f','%.2f','%d','%.2f')",
                    planMinsMega.obtenerMinutos(), planMinsMega.obtenerCostoMinutos(),
                    planMinsMega.obtenerMegasGigas(), planMinsMega.obtenerCostoGigas());
            statement.executeUpdate(data);
            obtenerConexion().close();
            
        } catch (SQLException e) {
            System.out.println("Exception: insertarPostPagoMinutosMegas");
            System.out.println(e.getMessage());

        }
    }
    
    public void insertarPostPagoMinutosMegasEconomico(PostPagoMinutosMegasEconomico planMinsMegaEc) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            
            String data = String.format("INSERT INTO PostPagoMinutosMegasEconomico"
                    + "(minutos, costoMins, megasGB, costoMinsInt)"
                    + "values ('%.2f','%.2f','%d','%.2f','%.0f')",
                    planMinsMegaEc.obtenerMinutos(), planMinsMegaEc.obtenerCostoMinutos(),
                    planMinsMegaEc.obtenerMegasGB(), planMinsMegaEc.obtenerCostoGigas(),
                    (planMinsMegaEc.obtenerPorcentajeDescuento() * 100));
            statement.executeUpdate(data);
            obtenerConexion().close();
            
        } catch (SQLException e) {
            System.out.println("Exception: insertarPostPagoMinutosMegas");
            System.out.println(e.getMessage());

        }
    }
    
}
