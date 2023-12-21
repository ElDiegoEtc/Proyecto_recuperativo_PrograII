package Grafica;
import logica.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class PizarraPanel extends JPanel {

    private Pizarra pizarra;
    private ArrayList<DibujaClases> listaDibujaClases;


    public PizarraPanel(Pizarra pizarra) {
        this.pizarra = pizarra;
        this.setLayout(new BorderLayout()); // O el layout que elijas
        setPreferredSize(new Dimension(800, 600));
        revalidate();
        repaint();
    }

    public void addDibujaClases(DibujaClases dibujaClase) {
        this.add(dibujaClase);
        this.revalidate();
        this.repaint();
    }
    public void addDibujaFlechas(DibujaFlecha dibujaFlecha) {
        this.add(dibujaFlecha);
        this.revalidate();
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

    }
}
