
package ejemploAbstracta;


public interface Trabajadores {
     double estableceBonus(double gratificacion);
    
    //Creamos una constante
     public static final double bonusBase=1500;
    //public: para poder acceder desde cualquier clase
    //static: porque pertenece a la interfaz Trabajadores
    //final: es constante, no se puede reasignar su valor
}
