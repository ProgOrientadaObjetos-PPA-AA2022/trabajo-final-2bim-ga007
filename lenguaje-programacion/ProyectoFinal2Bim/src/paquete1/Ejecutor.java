/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import paquete2.*;
/**
 *
 * @author Carlos Morocho - PC
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        boolean bandera = true;
        
        ArrayList<PlanCelular> lista = new ArrayList<>();
        
        System.out.println("PLANES CELULARES");
        System.out.println("-----------------------------");
        while (bandera) {
            System.out.print("INGRESE SU NOMBRE: ");
            String nombres = sc.nextLine();
            System.out.print("INGRESE SU CEDULA: ");
            String cedula = sc.nextLine();
            System.out.print("INGRESE SU CIUDAD: ");
            String ciudad = sc.nextLine();
            System.out.print("INGRESE SU MARCA DE CELULAR: ");
            String marca = sc.nextLine();
            System.out.print("INGRESE SU MODELO DE CELULAR: ");
            String modelo = sc.nextLine();
            System.out.print("INGRESE SU NUMERO DE CELULAR: ");
            String numero = sc.nextLine();
            
            System.out.println("\nElige Una Opcion");
            System.out.println("\t1) Plan Post Pago Minutos");
            System.out.println("\t2) Plan Post Pago Megas");
            System.out.println("\t3) Plan Post Pago Minutos Megas");
            System.out.println("\t4) Plan Post Pago Minutos Megas Economico");
            int opcion = sc.nextInt();
            sc.nextLine();
            
            if (opcion == 1) {
                System.out.print("INGRESE LOS MINUTOS NACIONALES: ");
                double minsNaci = sc.nextDouble();
                System.out.print("INGRESE COSTO MINUTOS NACIONALES: ");
                double costoNaci = sc.nextDouble();
                System.out.print("INGRESE LOS MINUTOS INTERNACIONALES: ");
                double minsInter = sc.nextDouble();
                System.out.print("INGRESE COSTO MINUTOS INTERNACIONALES: ");
                double costoInter = sc.nextDouble();
            }
        }
    }
}
