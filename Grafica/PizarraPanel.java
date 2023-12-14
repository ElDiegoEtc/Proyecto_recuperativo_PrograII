package Grafica;
import logica.*;

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
        setPreferredSize(new Dimension(800, 600));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


    }
}
