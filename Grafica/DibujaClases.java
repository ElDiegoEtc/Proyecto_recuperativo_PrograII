package Grafica;

import logica.Pizarra;
import logica.clasesdecorator.Clase;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DibujaClases extends JPanel {
    private JPanel panel;
    private Point inicio, fin;
    private Rectangle rectangulo;
    private JTextArea[] textAreas;
    private boolean dibujando, mouseSoltado;
    private Clase actual;
    private int numero_textareas;

    public DibujaClases(int opcion, Pizarra p) {
        dibujando = true; //dibuja las lineas que simulan los Jareatext
        rectangulo = new Rectangle();
        mouseSoltado = false;
        actual = null;

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if(opcion == 3){
                    numero_textareas = 3;
                } else numero_textareas = 2;
                if (rectangulo != null) {
                    g.drawRect(rectangulo.x, rectangulo.y, rectangulo.width, rectangulo.height);

                    if (!dibujando && textAreas != null) {
                        for (int i = 0; i < numero_textareas; i++) {
                            textAreas[i].setBounds(rectangulo.x, rectangulo.y + (i * rectangulo.height / numero_textareas),
                                    rectangulo.width, rectangulo.height / numero_textareas);
                        }
                    }

                    // Dividir el rectángulo en 3 o 2 partes horizontales si se está dibujando
                    if (dibujando) {
                        int parte1 = rectangulo.y + rectangulo.height / numero_textareas;
                        int parte2 = rectangulo.y + 2 * rectangulo.height / numero_textareas;
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
                    if(opcion == 3){ //ClaseBase completa
                        p.clickBoton6();
                        int numeroClases = p.getArrayclases().size();
                        actual = p.getArrayclases().get(numeroClases-1);
                        numero_textareas = 3;
                    } else if(opcion == 2){ //ClaseBase con atributos
                        p.clickBoton3();
                        int numeroClases = p.getArrayclases().size();
                        actual = p.getArrayclases().get(numeroClases-1);
                        numero_textareas = 2;
                    } else if(opcion == 1){ //ClaseBase con metodos
                        p.clickBoton4();
                        int numeroClases = p.getArrayclases().size();
                        actual = p.getArrayclases().get(numeroClases-1);
                        numero_textareas = 2;
                    }
                    actual.setX(rectangulo.x);
                    actual.setY(rectangulo.y);
                    actual.setHeigth(rectangulo.height);
                    actual.setWidth(rectangulo.width);

                    textAreas = new JTextArea[numero_textareas];
                    for (int i = 0; i < numero_textareas; i++) {
                        textAreas[i] = new JTextArea();
                        textAreas[i].setBounds(rectangulo.x, rectangulo.y + (i * rectangulo.height / numero_textareas),
                                rectangulo.width, rectangulo.height / numero_textareas);
                        textAreas[i].setText(actual.getModulo()[i]);
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
    public void resetEstado() {
        mouseSoltado = false;
        // Restablecer cualquier otro estado necesario aquí
    }

}