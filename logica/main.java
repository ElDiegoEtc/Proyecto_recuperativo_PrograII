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

/*
public class main {
    public static void main(String[] args) {
        // Crear una instancia de ClaseBase
        Clase miClase = new ClaseBase();
        miClase = new DecoradorAtributo(miClase);

        // Establecer coordenadas
        miClase.setX(10);
        miClase.setY(20);

        // Obtener y mostrar las coordenadas
        System.out.println("Coordenadas: (" + miClase.getX() + ", " + miClase.getY() + ")");
    }
}*/




