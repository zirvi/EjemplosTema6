package entidades;

import java.util.Date;

public class Jefatura extends Empleado {

    private double incentivo;

    public Jefatura(String nombre, String apellido, double sueldo, int agno, int mes, int dia) {
        super(nombre, apellido, sueldo, agno, mes, dia);

    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public double getSueldo() {
        return super.getSueldo() + incentivo;
    }
}
