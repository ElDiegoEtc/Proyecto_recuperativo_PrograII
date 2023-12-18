package Grafica;
import logica.clasesdecorator.Clase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DibujaClaseCompleta extends JPanel {
    private JPanel panel;
    private Point inicio, fin;
    private Rectangle rectangulo;
    private JTextArea[] textAreas;
    private boolean dibujando;
    private boolean mouseSoltado;

    public DibujaClaseCompleta(Clase c, JButton boton) {
        dibujando = true; //dibuja las lineas que simulan los Jareatext
        rectangulo = new Rectangle();
        mouseSoltado = false;

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (rectangulo != null) {
                    g.drawRect(rectangulo.x, rectangulo.y, rectangulo.width, rectangulo.height);

                    if (!dibujando && textAreas != null) {
                        for (int i = 0; i < 3; i++) {
                            textAreas[i].setBounds(rectangulo.x, rectangulo.y + (i * rectangulo.height / 3),
                                    rectangulo.width, rectangulo.height / 3);
                        }
                    }

                    // Dividir el rectángulo en 3 partes horizontales si se está dibujando
                    if (dibujando) {
                        int parte1 = rectangulo.y + rectangulo.height / 3;
                        int parte2 = rectangulo.y + 2 * rectangulo.height / 3;
                        g.drawLine(rectangulo.x, parte1, rectangulo.x + rectangulo.width, parte1);
                        g.drawLine(rectangulo.x, parte2, rectangulo.x + rectangulo.width, parte2);
                    }
                }
            }
        };


        panel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (!mouseSoltado) {
                    inicio = e.getPoint();
                    rectangulo.setLocation(inicio);
                }
            }

            public void mouseReleased(MouseEvent e) {
                if (!mouseSoltado) {
                    fin = e.getPoint();
                    dibujando = false;
                    rectangulo.add(fin);
                    textAreas = new JTextArea[3];
                    for (int i = 0; i < 3; i++) {
                        textAreas[i] = new JTextArea();
                        textAreas[i].setBounds(rectangulo.x, rectangulo.y + (i * rectangulo.height / 3),
                                rectangulo.width, rectangulo.height / 3);
                        textAreas[i].setText(c.modulo()[i]);
                        panel.add(textAreas[i]);
                    }
                    mouseSoltado = true;
                    repaint();
                }
            }
        });

        panel.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (dibujando && !mouseSoltado) {
                    fin = e.getPoint();
                    rectangulo.setFrameFromDiagonal(inicio, fin);
                    repaint();
                }
            }
        });

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
    }


}