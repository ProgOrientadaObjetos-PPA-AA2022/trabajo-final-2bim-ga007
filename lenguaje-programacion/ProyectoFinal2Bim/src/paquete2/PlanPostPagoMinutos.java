/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Carlos Morocho - PC
 */
public class PlanPostPagoMinutos extends PlanCelular {
    private double minsNaci;
    private double costoMinsNaci;
    private double minsInt;
    private double costoMinsInt;
    
    public PlanPostPagoMinutos(String nom, String id, String ciu,
            String marca, String modelo, String numero,
            double naci, double costoNaci, double inter,
            double costoInt) {
        super(nom, id, ciu, marca, modelo, numero);
        minsNaci = naci;
        costoMinsNaci = costoNaci;
        minsInt = inter;
        costoMinsInt = costoInt;
    }
    
    public void establecerMinutosNacionales(double n) {
        minsNaci = n;
    }
    
    public void establecerCostoMinutosNacionales(double n) {
        costoMinsNaci = n;
    }
    
    public void establecerMinutosInternacionales(double n) {
        minsInt = n;
    }
    
    public void establecerCostoMinutosInternacionales(double n) {
        costoMinsInt = n;
    }
    
    @Override
    public void calcularPagoMensual() {
        pagoMen = (minsNaci * costoMinsNaci) +
                (minsInt * costoMinsInt);
    }
    
    public double obtenerMinutosNacionales() {
        return minsNaci;
    }
    
    public double obtenerCostoMinutosNacionales() {
        return costoMinsNaci;
    }
    
    public double obtenerMinutosInternacionales() {
        return minsInt;
    }
    
    public double obtenerCostoMinutosInternacionales() {
        return costoMinsInt;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("-----------------------\n"
                + "POST PAGO MINUTOS\n"
                + "MINUTOS NACIONALES: %.2f\n"
                + "COSTO MINUTOS NACIONALES: %.2f\n"
                + "MINUTOS INTERNACIONALES: %.2f\n"
                + "COSTO MINUTOS INTERNACIONALES: %.2f\n"
                + "PAGO MENSUAL: %.2f\n",
                minsNaci,
                costoMinsNaci,
                minsInt,
                costoMinsInt,
                obtenerPagoMensual());
        
        return cadena;
    }
}
