/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Carlos Morocho - PC
 */
public class PostPagoMinutosMegas extends PlanCelular{
    private double minutos;
    private double costoMins;
    private int megasGB;
    private double costoGB;
    
    public PostPagoMinutosMegas(String nom, String id, String ciu,
            String marca, String modelo, String numero,
            double mins, double costoMi, int megas, double costoGi){
        super(nom, id, ciu, marca, modelo, numero);
        minutos = mins;
        costoMins = costoMi;
        megasGB = megas;
        costoGB = costoGi;
    }
    
    public void establecerMinutos(double n) {
        minutos = n;
    }
    
    public void establecerCostoMinutos(double n) {
        costoMins = n;
    }
    
    public void establecerMegasGigas(int n) {
        megasGB = n;
    }
    
    public void establecerCostoGigas(double n) {
        costoGB = n;
    }
    
    @Override
    public void calcularPagoMensual() {
        pagoMen = (minutos * costoMins) + (megasGB * costoGB);
    }
    
    public double obtenerMinutos() {
        return minutos;
    }
    
    public double obtenerCostoMinutos() {
        return costoMins;
    }
    
    public int obtenerMegasGigas() {
        return megasGB;
    }
    
    public double obtenerCostoGigas() {
        return costoGB;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("-----------------------\n"
                + "POST PAGO MINUTOS MEGAS\n"
                + "MINUTOS: %.2f\n"
                + "COSTO MINUTOS: %.2f\n"
                + "MEGAS (Gigas): %d\n"
                + "COSTO GIGAS: %.2f\n"
                + "PAGO MENSUAL: %.2f\n",
                minutos,
                costoMins,
                megasGB,
                costoGB,
                obtenerPagoMensual());
        
        return cadena;
    }
}
