/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploInstanceOf;

import entidades.Empleado;
import entidades.Jefatura;
import java.util.Arrays;

/**
 *
 * @author Silvi
 */
public class EjemploInstanceOf {

   public static void main(String[] args) {
        Jefatura director =new Jefatura("Luis", "Minguez", 25000, 1996, 03, 10);
        director.setIncentivo(1350);
        
        Empleado misEmpleados[] = new Empleado[5];
        
        misEmpleados[0] = new Empleado("Silvia", "Perez", 30000, 2015, 01, 26);
        
        misEmpleados[1] = director;//Polimorfismo. Principio sustitución
        //Es posible por el principio de ES UN
       
        misEmpleados[2] = new Empleado("Miguel", "Gonzalez", 17000, 2012, 06, 8);
        
        misEmpleados[3] = new Jefatura("Sonia", "Gomez", 65000, 2012, 02, 04);
        
        misEmpleados[4] = new Empleado("Pepe", "Navarro", 95000, 2009, 10, 25);
        
        Jefatura jefeRRHH = (Jefatura) misEmpleados[3];//hacemos casting 
        jefeRRHH.setIncentivo(2300);
    
        
        for (Empleado emp : misEmpleados) {
            System.out.println("ID Empleado: "+emp.dimeIdEmpleado()+" Nombre: "+emp.getNombre() + " " + emp.getApellido()
                 +"  FECHA Contrato: "+ emp.getAltaContrato()
                 +"  SUELDO:  "+ emp.getSueldo());
        }
          
        if (jefeRRHH instanceof Empleado){
        System.out.println("Es de tipo Empleado");
        }
        if (jefeRRHH instanceof Jefatura){
             System.out.println("Es de tipo Jefatura");
        }
        if (jefeRRHH instanceof Comparable){
             System.out.println("Es de tipo Jefatura");
        }

    }
   
    
}
