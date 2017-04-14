package ejemploAbstracta;



import ejemploAbstracta.Trabajadores;
import java.util.Date;




public class JefaturaAbstract extends EmpleadoAbstract implements Trabajadores{
    //Como 
    private double incentivo;

    public JefaturaAbstract(String nombre,String apellido, double sueldo, int agno,int mes, int dia) {
        
        super(nombre, apellido, sueldo, agno, mes, dia);
                           }
 
     public String tomarDecisiones(String decision){
     return "Un miembro de la direccion ha tomado la decision de: "+decision;
     }
    
       public double estableceBonus(double gratificacion){
           double prima=2000;//además tendrá prima 
           //por estar en clase Jefatura
       return Trabajadores.bonusBase+gratificacion+prima;
               
               }          
    public void setIncentivo(double incen) {
        incentivo = incen;
    }
    /////////METODO SUELDO DE JEFATURA/////////
    public double getSueldo(){
        double sueldoJefe=super.getSueldo();
        return sueldoJefe+incentivo;
    }
}
