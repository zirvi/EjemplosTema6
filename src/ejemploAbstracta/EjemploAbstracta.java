

import ejemploAbstracta.EmpleadoAbstract;
import ejemploAbstracta.JefaturaAbstract;
import ejemploAbstracta.Persona;

import entidades.Empleado;
import entidades.Jefatura;

import java.util.Arrays;

public class EjemploAbstracta {

    public static void main(String[] args) {
        
        Persona[] person=new Persona[2];
        person[0]=new EmpleadoAbstract("Ana","Lopez",30000, 2015, 01, 26);
        person[1]=new Alumno("Miguel", "Gonzalez","Derecho");
         for (Persona p : person) {
            System.out.println(p.dameNombre() + " " + p.dameApellido()
                 +", "+ p.dameDescripcion());
        }
///////////////////////////////////////////////////////////////
        EmpleadoAbstract misEmpleados[] = new EmpleadoAbstract[6];
        misEmpleados[0] = new EmpleadoAbstract("Silvia", "Perez", 30000, 2015, 01, 26);
        misEmpleados[1] = new EmpleadoAbstract("Luis", "Minguez", 25000, 1996, 03, 10);
        misEmpleados[2] = new EmpleadoAbstract("Miguel", "Gonzalez", 17000, 2012, 06, 8);
        misEmpleados[3] = new EmpleadoAbstract("Sonia", "Gomez", 65000, 2012, 02, 04);
        misEmpleados[4] = new EmpleadoAbstract("Pepe", "Navarro", 95000, 2009, 10, 25);
        misEmpleados[5] = new JefaturaAbstract("Lucas", "Latorre", 34500, 2006, 12, 31);

        JefaturaAbstract jefeRRHH = (JefaturaAbstract) misEmpleados[5];

        jefeRRHH.setIncentivo(8965);

        Arrays.sort(misEmpleados);//obliga a usar la interface Comparable
        EmpleadoAbstract directorComercial=new JefaturaAbstract("Sergio", "Lopez", 120000, 1993, 12, 31);
         System.out.println("El director "+directorComercial.dameNombre()+ " tiene un bonus de "+misEmpleados[5].estableceBonus(520));
        //Comparable ejemplo=new Empleado("Olga", "Gimenez", 95000, 2009, 10, 25);
        //principio de sustitucion mediante el cual la clase Empleado 
        //implementa la interfaz Comparable y crea una instancia que pertenece a la interfaz pero
        //del tipo Empleado
         for (EmpleadoAbstract emp : misEmpleados) {
            System.out.println(emp.dameNombre()
                 +" "+ emp.dameApellido()
             +", "+ emp.dameDescripcion()
             +", "+ emp.getSueldo()
             +", "+ emp.getAltaContrato()
             +", "+ emp.estableceBonus(120));
        }
        System.out.println(jefeRRHH.tomarDecisiones("Dar mas dias de "
                 + "vacaciones a los empleados"
         ));
        System.out.println("El jefe "+jefeRRHH.dameNombre()+ " tiene un bonus de "+misEmpleados[5].estableceBonus(2000));
              
      
     
       

    }

}
