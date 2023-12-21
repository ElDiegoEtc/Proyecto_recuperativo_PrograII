package logica;

import java.io.Serializable;
import Grafica.GestorPestañas;
import javax.swing.*;

public class main implements Serializable {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GestorPestañas gp = new GestorPestañas();
                gp.setVisible(true);
            }
        });
    }
}