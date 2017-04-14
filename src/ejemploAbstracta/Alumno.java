
import ejemploAbstracta.Persona;



public class Alumno extends Persona{
       
     private String carrera;
    
     public Alumno(String nombre, String apellido,String carr){
         super(nombre,apellido);
        carrera=carr;
      
     }
     public String dameDescripcion(){
     return "esta estudiando la carrera de: "+carrera;
     }

    
}
