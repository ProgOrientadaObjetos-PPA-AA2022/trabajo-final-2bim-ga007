/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Carlos Morocho - PC
 */
public class PostPagoMinnutosMegasEconomico extends PlanCelular{
    private double minutos;
    private double costoMins;
    private int megasGB;
    private double costoGB;
    private double porcDesc;
    
    public PostPagoMinnutosMegasEconomico(String nom, String id, String ciu,
            String marca, String modelo, String numero,
            double mins, double costoMi, int megas, double costoGi,
            double desc){
        super(nom, id, ciu, marca, modelo, numero);
        minutos = mins;
        costoMins = costoMi;
        megasGB = megas;
        costoGB = costoGi;
        porcDesc = desc / 100;
    }
    
    public void establecerMinutos(double n) {
        minutos = n;
    }
    
    public void establecerCostoMinutos(double n) {
        costoMins = n;
    }
    
    public void establecerMegasGB(int n) {
        megasGB = n;
    }
    
    public void establecerCostoGigas(double n) {
        costoGB = n;
    }
    
    public void establecerPorcentajeDescuento(double n) {
        porcDesc = n / 100;
    }
    
    @Override
    public void calcularPagoMensual() {
        pagoMen = (minutos * costoMins) + (megasGB * costoGB) - (((minutos * costoMins) 
                + (megasGB * costoGB)) * porcDesc);
    }
    
    public double obtenerMinutos() {
        return  minutos;
    }
    
    public double obtenerCostoMinutos() {
        return costoMins;
    }
    
    public int obtenerMegasGB() {
        return megasGB;
    }
    
    public double obtenerCostoGigas() {
        return costoGB;
    }
    
    public double obtenerPorcentajeDescuento() {
        return porcDesc;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("POST PAGO MINUTOS MEGAS ECONOMICO\n"
                + "-----------------------\n"
                + "MINUTOS: %.2f\n"
                + "COSTO MINUTOS: %.2f\n"
                + "MEGAS (Gigas): %d\n"
                + "COSTO GIGAS: %.2f\n"
                + "PORCENTAJE DESC: %.0f\n"
                + "PAGO MENSUAL: %.2f\n",
                minutos,
                costoMins,
                megasGB,
                costoGB,
                (porcDesc * 100),
                obtenerPagoMensual());
        
        return cadena;
    }
}
