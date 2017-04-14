package ejemploAbstracta;



import ejemploAbstracta.Persona;
import ejemploAbstracta.Trabajadores;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
//import utilidades.Trabajadores;

public class EmpleadoAbstract extends Persona implements Comparable, Trabajadores {
    private double sueldo;
    Date altaContrato;
    private int idEmpleado;
    private static int IdSiguiente;

    
    
    public int compareTo(Object miObjeto) { //Metodo para ordenar el sueldo de menor a mayor

        EmpleadoAbstract otroEmpleado = (EmpleadoAbstract) miObjeto;

        if (this.sueldo < otroEmpleado.sueldo) {
            return -1;
        }
        if (this.sueldo > otroEmpleado.sueldo) {
            return 1;
        }
        return 0;

    }

    public String dameDescripcion() {
        return ("tiene el ID: " + idEmpleado + " cobra " + sueldo + " euros.");
    }
public double estableceBonus(double gratificacion){
return Trabajadores.bonusBase+gratificacion;

}
    public int dameId() {
        return idEmpleado;
    }
    //Empleado misEmpleados[]=new Empleado[6];

    public EmpleadoAbstract(String nombre, String apellido, double sueldo, int agno, int mes, int dia) {

        super(nombre, apellido);

        this.sueldo = sueldo;
       
        
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();

        ++IdSiguiente;
        idEmpleado = IdSiguiente;

    }

    public Date getAltaContrato() {
        return altaContrato;
    }

    public void setAltaContrato(Date altaContrato) {
        this.altaContrato = altaContrato;
    }

///////METODOS SUELDO DEL EMPLEADO////
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /*public Empleado[] getMisEmpleados() {
        return misEmpleados;
    }

    public void setMisEmpleados(Empleado[] misEmpleados) {
        this.misEmpleados = misEmpleados;
    }*/
}
