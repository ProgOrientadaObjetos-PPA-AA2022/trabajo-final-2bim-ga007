/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Carlos Morocho - PC
 */
public class PlanPostPagoMegas extends PlanCelular {
    private int megasGB;
    private double costoGB;
    private double tarifaBase;
    
    public PlanPostPagoMegas(String nom, String id, String ciu,
            String marca, String modelo, String numero,
            int megas, double costo) {
        super(nom, id, ciu, marca, modelo, numero);
        megasGB = megas;
        costoGB = costo;
        tarifaBase = 2.10;
    }
    
    public void establecerMegasGB(int n) {
        megasGB = n;
    }
    
    public void establecerCostoGB(double n) {
        costoGB = n;
    }
    
    public void establecerTarifaBase() {
        tarifaBase = 2.10;
    }
    
    @Override
    public void calcularPagoMensual() {
        pagoMen = (megasGB * costoGB) + tarifaBase;
    }
    
    public int obtenerMegasGB() {
        return megasGB;
    }
    
    public double obtenerCostoGB() {
        return costoGB;
    }
    
    public double obtenerTarifaBase() {
        return tarifaBase;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("POST PAGO MEGAS\n"
                + "-----------------------\n"
                + "MEGAS (Gigas): %d\n"
                + "COSTO GIGA: %.2f\n"
                + "TARIFA BASE: %.2f\n"
                + "PAGO MENSUAL: %.2f\n",
                megasGB,
                costoGB,
                tarifaBase,
                obtenerPagoMensual());
        
        return cadena;
    }
}
