
package ejemploAbstracta;


public abstract class Persona {
   private String nombre;
    private String apellido;

    public abstract String dameDescripcion();

    public Persona(String nom, String apell) {
        nombre = nom;
        apellido = apell;
    }

    public String dameNombre() {

        return nombre;
    }

    public String dameApellido() {

        return apellido;
    }

}
   

