/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import paquete2.*;
import paquete3.*;
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
        Enlace c = new Enlace();
        
        while (bandera) {
            System.out.println("-----------------------------");
            System.out.println("PLANES CELULARES");
            System.out.println("-----------------------------");
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
                sc.nextLine();
                
                PlanPostPagoMinutos pMin = new PlanPostPagoMinutos(nombres, cedula, ciudad,
                        marca, modelo, numero, minsNaci, costoNaci, minsInter, costoInter);
                
                pMin.calcularPagoMensual();
                lista.add(pMin);
                c.insertarPlanPostPagoMinutos(pMin);
                
            } else if (opcion == 2) {
                System.out.print("INGRESE LAS MEGAS (Gigas): ");
                int megasG = sc.nextInt();
                System.out.print("INGRESE EL COSTO DE LAS GIGAS: ");
                double costoGigas = sc.nextDouble();
                sc.nextLine();
                
                PlanPostPagoMegas pMegas = new PlanPostPagoMegas(nombres, cedula, ciudad,
                        marca, modelo, numero, megasG, costoGigas);
                
                pMegas.calcularPagoMensual();
                lista.add(pMegas);
                c.insertarPlanPostPagoMegas(pMegas);
                
            } else if (opcion == 3) {
                System.out.print("INGRESE LOS MINUTOS: ");
                double minutos = sc.nextDouble();
                System.out.print("INGRESE EL COSTO DE LOS MINUTOS: ");
                double costoMins = sc.nextDouble();
                System.out.print("INGRESE LAS MEGAS (Gigas): ");
                int megasG = sc.nextInt();
                System.out.print("INGRESE EL COSTO DE LAS GIGAS: ");
                double costoGi = sc.nextDouble();
                sc.nextLine();
                
                PostPagoMinutosMegas pMinMega = new PostPagoMinutosMegas(nombres, cedula, ciudad,
                        marca, modelo, numero, minutos, costoMins, megasG, costoGi);
                
                pMinMega.calcularPagoMensual();
                lista.add(pMinMega);
                c.insertarPostPagoMinutosMegas(pMinMega);
                
            } else if (opcion == 4) {
                System.out.print("INGRESE LOS MINUTOS: ");
                double minutos = sc.nextDouble();
                System.out.print("INGRESE EL COSTO DE LOS MINUTOS: ");
                double costoMins = sc.nextDouble();
                System.out.print("INGRESE LAS MEGAS (Gigas): ");
                int megasG = sc.nextInt();
                System.out.print("INGRESE EL COSTO DE LAS GIGAS: ");
                double costoGi = sc.nextDouble();
                System.out.print("INGRESE EL PORCENTAJE DE DESCUENTO: ");
                double porce = sc.nextDouble();
                sc.nextLine();
                
                PostPagoMinutosMegasEconomico pMinMegasEc = new PostPagoMinutosMegasEconomico(nombres,
                        cedula, ciudad, marca, modelo, numero, minutos, costoMins, megasG, costoGi, porce);
                
                pMinMegasEc.calcularPagoMensual();
                lista.add(pMinMegasEc);
                c.insertarPostPagoMinutosMegasEconomico(pMinMegasEc);
                
            } else {
                bandera = false;
                System.out.println("\nOPCION FUERA DE RANGO!!!");
            }
            
            System.out.print("¡SI NO DESEA SEGUIR INGRESANDO DATOS PRESIONES X!");
            String salir = sc.nextLine().toUpperCase();
            
            if (salir.equals("X")) {
                bandera = false;
            }
        }
        TipoPlanCelular tiposPla = new TipoPlanCelular();
        tiposPla.establecerPlanes(lista);
        
        System.out.printf("%s\n", tiposPla);
    }
}
