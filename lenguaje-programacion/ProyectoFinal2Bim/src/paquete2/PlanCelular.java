/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Carlos Morocho - PC
 */
public abstract class PlanCelular {
    protected String nombres;
    protected String cedula;
    protected String ciudad;
    protected String marcaCel;
    protected String modeloCel;
    protected String numeroCel;
    protected double pagoMen;
    
    public PlanCelular(String nom, String id, String ciu,
            String marca, String modelo, String numero) {
        nombres = nom;
        cedula = id;
        ciudad = ciu;
        marcaCel = marca;
        modeloCel = modelo;
        numeroCel = numero;
    }
    
    public void establecerNombres(String n) {
        nombres = n;
    }
    
    public void establecerCedula(String n) {
        cedula = n;
    }
    
    public void establecerCiudad(String n) {
        ciudad = n;
    }
    
    public void establecerMarcaCelular(String n) {
        marcaCel = n;
    }
    
    public void establecerModeloCelular(String n) {
        modeloCel = n;
    }
    
    public void establecerNumeroCelular(String n) {
        numeroCel = n;
    }
    
    public abstract void calcularPagoMensual();
    
    public String obtenerNombres() {
        return nombres;
    }
    
    public String obtenerCedula() {
        return cedula;
    }
    
    public String obtenerCiudad() {
        return ciudad;
    }
    
    public String obtenerMarcaCelular() {
        return marcaCel;
    }
    
    public String obtenerModeloCelular() {
        return modeloCel;
    }
    
    public String obtenerNumeroCelular() {
        return numeroCel;
    }
    
    public double obtenerPagoMensual() {
        return pagoMen;
    }
}
