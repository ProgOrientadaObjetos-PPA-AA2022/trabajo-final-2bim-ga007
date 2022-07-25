/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import paquete2.*;
import java.util.ArrayList;

/**
 *
 * @author Carlos Morocho - PC
 */
public class TipoPlanCelular {
    private ArrayList<PlanCelular> planes;
    
    public void establecerPlanes(ArrayList<PlanCelular> n){
        planes = n;
    }
    
    public ArrayList<PlanCelular> obtenerPlanes(){
        return planes;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\nLISTADO PLANES CELULARES\n"
                + "--------------------------\n");
        
        for (int i = 0; i < planes.size(); i++) {
            cadena = String.format("%s"
                    + "Nombre: %s\n"
                    + "Cedula: %s\n"
                    + "Ciudad: %s\n"
                    + "Marca del Celular: %s\n"
                    + "Modelo del Celular: %s\n"
                    + "Numero: %s\n"
                    + "%s\n"
                    + "PAGO MENSUAL: %.2f\n"
                    + "--------------------------\n",
                    cadena,
                    planes.get(i).obtenerNombres(),
                    planes.get(i).obtenerCedula(),
                    planes.get(i).obtenerCiudad(),
                    planes.get(i).obtenerMarcaCelular(),
                    planes.get(i).obtenerModeloCelular(),
                    planes.get(i).obtenerNumeroCelular(),
                    planes.get(i),
                    planes.get(i).obtenerPagoMensual());
        }
        
        return cadena;
    }
}
