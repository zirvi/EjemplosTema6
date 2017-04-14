package ejemploClaseInterna;

import java.awt.Toolkit;
import java.awt.event.*;

import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class ClaseInterna {

    public static void main(String[] args) {

        Reloj miReloj = new Reloj(3000, true);
        miReloj.enMarcha();
        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
        System.exit(0);
    }

}


