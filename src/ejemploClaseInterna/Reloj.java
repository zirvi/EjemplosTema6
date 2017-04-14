
package ejemploClaseInterna;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

public class Reloj {
    private int intervalo;
    private boolean sonido;
    //Constructor
    public Reloj(int intervalo, boolean sonido) {
        this.intervalo = intervalo;
        this.sonido = sonido;
    }
    public void enMarcha() {
        ActionListener oyente = new DameLaHora2();
        Timer mitemporizador = new Timer(intervalo, oyente);
        mitemporizador.start();
    }
    
    private class DameLaHora2 implements ActionListener { //Clase Interna

        public void actionPerformed(ActionEvent evento) {
            Date ahora = new Date();
            System.out.println("Te pongo la hora cada 3 seg." + ahora);
            if (sonido)//sonido==true
            {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    
    }
}