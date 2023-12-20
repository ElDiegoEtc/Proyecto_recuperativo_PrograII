package Grafica;
import logica.*;
import logica.flechasdecorator.Flecha;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class PizarraPanel extends JPanel {

    private Pizarra pizarra;
    private Flecha tipoFlechaSeleccionada;

    public void setTipoFlechaSeleccionada(Flecha tipoFlechaSeleccionada) {
        this.tipoFlechaSeleccionada = tipoFlechaSeleccionada;
    }

    public PizarraPanel(Pizarra pizarra) {
        this.pizarra = pizarra;
        this.setLayout(new BorderLayout()); // O el layout que elijas
        setPreferredSize(new Dimension(800, 600));
    }

    public void addDibujaClases(DibujaClases dibujaClase) {
        this.add(dibujaClase);
        this.revalidate();
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

    }
}
