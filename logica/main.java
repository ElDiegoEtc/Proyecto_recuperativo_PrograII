package logica;
import java.io.Serializable;
import java.util.ArrayList;


import Grafica.GestorPestañas;
import Grafica.PizarraUML;
import logica.command.CommandConfiguracion;
import logica.command.CommandGuardarArchivoPizarra;

import javax.swing.*;

public class main implements Serializable {

    //Los test estan en out>testconectores

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GestorPestañas gp = new GestorPestañas();
                gp.setVisible(true);
            }
        });
    }
}



