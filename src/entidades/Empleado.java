package entidades;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

    private String nombre;
    private String apellido;
    private double sueldo;
    Date altaContrato;
    private int idEmpleado;
    private static int IdSiguiente;

    /////////////////////////////////////
    public Empleado() {
    }

    public Empleado(String nombre, String apellido, double sueldo, int agno, int mes, int dia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
          ++IdSiguiente;
        idEmpleado = IdSiguiente;
    }
    
    public int dimeIdEmpleado() {
        return idEmpleado;
    }

    /////////////////////////////////////////////////
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Date getAltaContrato() {
        return altaContrato;
    }

    public void setAltaContrato(Date altaContrato) {
        this.altaContrato = altaContrato;
    }

////////////////////////////////////
}
